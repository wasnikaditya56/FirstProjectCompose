package com.aditya.wasnik.firstprojectcompose.components

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.*
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.rememberCoroutineScope
import com.aditya.wasnik.firstprojectcompose.components.screen.CheckBoxUi
import com.aditya.wasnik.firstprojectcompose.components.screen.ColumnScreen
import com.aditya.wasnik.firstprojectcompose.components.screen.CustomToggleButton
import com.aditya.wasnik.firstprojectcompose.ui.theme.FirstProjectComposeTheme

class ComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectComposeTheme {
                Surface {
                   val scaffoldState = rememberScaffoldState()
                   val scope = rememberCoroutineScope()
                    CustomToggleButton()
                }
            }
        }
    }
}