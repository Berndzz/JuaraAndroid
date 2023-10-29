package com.hardus.composeapp.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Cart : Screen("cart")
    object Category : Screen("category")
    object Profile : Screen("profile")
    object DetailTroop : Screen("home/{troopId}") {
        fun createRoute(troopId: Long) = "home/$troopId"
    }
    object SplashScreen : Screen("splash_Screen")
}
