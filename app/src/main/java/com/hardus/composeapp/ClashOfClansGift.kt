package com.hardus.composeapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hardus.composeapp.ui.SplashScreen
import com.hardus.composeapp.ui.navigation.NavigationItem
import com.hardus.composeapp.ui.navigation.Screen
import com.hardus.composeapp.ui.screen.cart.CartScreen
import com.hardus.composeapp.ui.screen.category.CategoryScreen
import com.hardus.composeapp.ui.screen.detail.DetailScreen
import com.hardus.composeapp.ui.screen.home.HomeScreen
import com.hardus.composeapp.ui.screen.profile.ProfileScreen
import com.hardus.composeapp.ui.theme.ComposeAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ClashOfClansGift(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.SplashScreen.route && currentRoute != Screen.DetailTroop.route) {
                BottomBar(navController)
            }
        }, modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.SplashScreen.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.SplashScreen.route) {
                SplashScreen(navController)
            }
            composable(Screen.Home.route) {
                HomeScreen(navigateToDetail = { troopId ->
                    navController.navigate(Screen.DetailTroop.createRoute(troopId))
                })
            }
            composable(Screen.Category.route) {
                CategoryScreen(navigateToDetail = { troopId ->
                    navController.navigate(Screen.DetailTroop.createRoute(troopId))
                })
            }
            composable(Screen.Cart.route) {
                val context = LocalContext.current
                CartScreen { message ->
                    sharedOrder(context, message)
                }
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
            composable(
                route = Screen.DetailTroop.route,
                arguments = listOf(navArgument("troopId") { type = NavType.LongType })
            ) {
                val id = it.arguments?.getLong("troopId") ?: -1L
                DetailScreen(troopId = id,
                    navigateBack = { navController.navigateUp() },
                    navigateToCart = {
                        navController.popBackStack()
                        navController.navigate(Screen.Cart.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    })
            }
        }
    }
}


@Composable
fun BottomBar(
    navController: NavHostController, modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        modifier = modifier
    ) {
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_list),
                icon = Icons.Default.List,
                screen = Screen.Category
            ),
            NavigationItem(
                title = stringResource(R.string.menu_cart),
                icon = Icons.Default.ShoppingCart,
                screen = Screen.Cart
            ),
            NavigationItem(
                title = stringResource(R.string.menu_profile),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profile
            ),
        )
        BottomNavigation {
            navigationItems.map { item ->
                BottomNavigationItem(icon = {
                    Icon(
                        imageVector = item.icon, contentDescription = item.title
                    )
                },
                    label = { Text(item.title) },
                    selected = currentRoute == item.screen.route,
                    onClick = {
                        navController.navigate(item.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    })
            }
        }
    }
}

private fun sharedOrder(context: Context, summary: String) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.coc_gift))
        putExtra(Intent.EXTRA_TEXT, summary)
    }
    context.startActivity(
        Intent.createChooser(
            intent, context.getString(R.string.coc_gift)
        )
    )
}


@Preview(showBackground = true)
@Composable
fun ClashOfClansGiftPreview() {
    ComposeAppTheme {
        ClashOfClansGift()
    }
}
