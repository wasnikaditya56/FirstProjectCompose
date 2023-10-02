package com.aditya.wasnik.firstprojectcompose.navigation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aditya.wasnik.firstprojectcompose.navigation.utils.NavigationScreen

@Composable
fun FirstScreen(navHostController: NavHostController) {

    Button(onClick = {
        navHostController.navigate(NavigationScreen.SecondScreen.createRoute("Hey"))
    }) {
        Text(text = "Click here")
    }
}