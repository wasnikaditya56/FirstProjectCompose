package com.aditya.wasnik.firstprojectcompose

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aditya.wasnik.firstprojectcompose.ui.theme.FirstProjectComposeTheme

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectComposeTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    LoginScreen()
                }
            }
        }
    }

    private fun logged(username: String, password: String) {
        if (username == "Aditya" && password == "12345") {
            Toast.makeText(this, "logged!!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "wrong credential", Toast.LENGTH_LONG).show()
        }
    }

    @Composable
    fun LoginScreen() {
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = "Hello Aditya!", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
        }

    }

}