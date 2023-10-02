package com.aditya.wasnik.firstprojectcompose.navigation.navigation

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.aditya.wasnik.firstprojectcompose.navigation.screen.FirstScreen
import com.aditya.wasnik.firstprojectcompose.navigation.screen.SecondScreen
import com.aditya.wasnik.firstprojectcompose.navigation.screen.ThirdScreen
import com.aditya.wasnik.firstprojectcompose.navigation.utils.NavigationScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun StartNavigation(context:Activity) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.FirstScreen.route){
        composable(NavigationScreen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(NavigationScreen.SecondScreen.route){
            val data = it.arguments?.getString("data")
            println("data::: $data")
            SecondScreen(context, navController)
        }
        composable(NavigationScreen.ThirdScreen.route){
            ThirdScreen()
        }
    }

}