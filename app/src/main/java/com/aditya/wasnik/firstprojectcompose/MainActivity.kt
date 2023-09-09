package com.aditya.wasnik.firstprojectcompose

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aditya.wasnik.firstprojectcompose.ui.theme.FirstProjectComposeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectComposeTheme {
               Scaffold(
                   topBar = {
                       TopAppBar(
                           title = {
                                Text(text = "Welcome Aditya")
                       },
                       navigationIcon = {
                           IconButton(onClick = { }) {
                               Icon(Icons.Filled.Menu , contentDescription = "menu")
                           }
                       },
                       actions = {
                           IconButton(onClick = {  }) {
                               Icon(Icons.Filled.Notifications, contentDescription = "noti")
                           }
                           IconButton(onClick = { }) {
                               Icon(Icons.Filled.Search, contentDescription = "search")
                           }
                       }
                       )
                   },
                   floatingActionButton = {
                       FloatingActionButton(onClick = { }) {
                           IconButton(onClick = {  }) {
                               Icon(Icons.Filled.Add, contentDescription = "add")
                           }
                       }
                   },
               ) {
                        ShowSwitch()
               }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colorScheme.secondary
    )
}

@Preview(showBackground = true, name = "light mode")
/*@Preview(
    showBackground = true, name = "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)*/
@Composable
fun GreetingPreview() {
    FirstProjectComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun ShowSwitch() {
    val isChecked = remember {
        mutableStateOf(true)
    }

    Switch(
        checked = isChecked.value,
        onCheckedChange = {
            isChecked.value = it
            println("isChecked.value:::"+ isChecked.value)
        },
        modifier = Modifier.run {
            size(20.dp)
            padding(100.dp)
        }
    )
}