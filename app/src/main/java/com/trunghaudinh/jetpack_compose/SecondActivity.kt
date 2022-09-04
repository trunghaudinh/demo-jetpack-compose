package com.trunghaudinh.jetpack_compose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme{
                MyApp()
            }
        }
    }


    @Composable
    fun MyApp(){
        val positionState = remember {

        }
        Text(text = "Trung Hau Dinh $positionState")
    }
}