package com.hardus.composeapp.data


import com.hardus.composeapp.model.CountTroops
import com.hardus.composeapp.model.Troops
import com.hardus.composeapp.model.fakedata.FakeTroopsDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class TroopsRepository {
    private val orderTroop = mutableListOf<CountTroops>()

    init {
        if (orderTroop.isEmpty()) {
            FakeTroopsDataSource.dummyTroops.forEach {
                orderTroop.add(CountTroops(it, 0))
            }
        }
    }

    fun getAllTroops(): Flow<List<CountTroops>> {
        return flowOf(orderTroop)
    }


    fun getTroop(): List<Troops> {
        return FakeTroopsDataSource.dummyTroops
    }

    fun getOrderTroopsById(troopId: Long): CountTroops {
        return orderTroop.first {
            it.troops.id == troopId
        }
    }



    fun updateTroops(troopId: Long, newCountValue: Int): Flow<Boolean> {
        val index = orderTroop.indexOfFirst { it.troops.id == troopId }
        val result = if (index >= 0) {
            val troop = orderTroop[index]
            orderTroop[index] = troop.copy(troops = troop.troops, count = newCountValue)
            true
        } else {
            false
        }
        return flowOf(result)
    }



    fun getAddOrderTroops(): Flow<List<CountTroops>> {
        return getAllTroops().map { orderTroops ->
            orderTroops.filter {
                it.count != 0
            }
        }
    }

    fun searchTroop(query: String): List<Troops> {
        return FakeTroopsDataSource.dummyTroops.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

    companion object {
        @Volatile
        private var instance: TroopsRepository? = null

        fun getInstance(): TroopsRepository = instance ?: synchronized(this) {
            TroopsRepository().apply {
                instance = this
            }
        }
    }

}