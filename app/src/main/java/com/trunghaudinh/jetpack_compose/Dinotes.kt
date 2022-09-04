package com.trunghaudinh.jetpack_compose

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MyHomePage() {
    Scaffold(topBar = { MyTopAppBar() },
        backgroundColor = Color(0xFFF4F5F6),
        content = {
            Column {
                ViewPagerSlider()
                val list = rememberLazyListState()
                LazyColumn(state = list) {

                    items(listDinotes.size) { position ->
                        val context = LocalContext.current
                        Surface(modifier = Modifier.clickable {
                            val intent = Intent(context, SecondActivity::class.java)
                            intent.putExtra("position",position)
                            context.startActivity(intent)
                        }) {
                            ItemDinotes(item = listDinotes[position])
                        }
                    }
                }

            }
        }, floatingActionButton = {
            FloatingActionButton(onClick = {

            }) {
                Image(painter = painterResource(id = R.drawable.ic_create), contentDescription = "")
            }
        })
}

@Preview
@Composable
fun Demo() {
    Scaffold(topBar = { MyTopAppBar() },
        backgroundColor = Color(0xFFF4F5F6),
        content = { Text("content") })
}

@Composable
fun MyTopAppBar() {
    val context = LocalContext.current
    TopAppBar(
        backgroundColor = Color(0xFFF4F5F6),
        elevation = 0.dp,
    ) {
        CustomIconAppBar(R.drawable.ic_menu, "click Menu")

        Text(
            text = "Dinote Lite", color = Color.Black, fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.weight(1f))
        CustomIconAppBar(R.drawable.ic_search, "click Search")
        CustomIconAppBar(R.drawable.ic_bell, "click Bell")
        CustomIconAppBar(R.drawable.ic_slide, "click slide")

    }

}

@Composable
fun CustomIconAppBar(idIcon: Int, toast: String) {
    val context = LocalContext.current
    IconButton(onClick = {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }) {
        Icon(
            painter = painterResource(id = idIcon),
            "icon",
        )
    }
}

