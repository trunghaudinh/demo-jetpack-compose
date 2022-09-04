package com.trunghaudinh.jetpack_compose

import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun demo() {
        HelloContent()
}

@Composable
fun HelloContent() {

    val state = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Hello! ${state.value}",
            modifier = Modifier.padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = state.value,
            onValueChange = {
                state.value = it
            },
            label = { Text("Name") }
        )
    }
}