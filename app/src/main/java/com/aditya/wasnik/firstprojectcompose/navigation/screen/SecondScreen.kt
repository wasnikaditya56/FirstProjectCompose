package com.aditya.wasnik.firstprojectcompose.navigation.screen

import android.app.Activity
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aditya.wasnik.firstprojectcompose.navigation.utils.NavigationScreen

@Composable
fun SecondScreen(context: Activity, navHostController: NavHostController) {
    Button(onClick = {
        navHostController.navigate(NavigationScreen.ThirdScreen.route){
            launchSingleTop = true
        }
    }) {
        Text(text = "goto another activity")
    }
}

// A -> B -> C -> A -> B ->