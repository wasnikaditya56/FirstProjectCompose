package com.aditya.wasnik.firstprojectcompose.components.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomTitleBar() {

    var title by remember { mutableStateOf("")}

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        androidx.compose.foundation.layout.Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Card(
                modifier = Modifier.background(Color.Transparent),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
                border = BorderStroke(1.dp, Color.Gray)
            ) {
                Text(text = "Title", modifier = Modifier.padding(horizontal = 20.dp))
            }
            OutlinedTextField(
                value = title, onValueChange = {
                    title = it
                },
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.fillMaxWidth().height(150.dp)
            )
        }
    }

}