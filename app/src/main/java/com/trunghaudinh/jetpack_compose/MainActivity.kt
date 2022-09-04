package com.trunghaudinh.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MyHomePage()
            HelloContent()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun preview() {
    MyHomePage()
}
