package com.aditya.wasnik.firstprojectcompose.navigation.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.aditya.wasnik.firstprojectcompose.ui.theme.FirstProjectComposeTheme

class AnotherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectComposeTheme {
                Surface() {

                }
            }
        }
    }
}