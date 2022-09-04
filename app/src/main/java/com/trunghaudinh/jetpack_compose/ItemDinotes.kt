package com.trunghaudinh.jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

data class Dinotes(
    val id: Long,
    val title: String,
    val content: String,
    val time: Long
) {

}


@Composable
fun ItemDinotes(item: Dinotes) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        backgroundColor = Color(0xFFF4F5F6),
        elevation = 2.dp,

    ) {
        Row {
            CalendarView(time = item.time)
            Column(
                modifier = Modifier.align(alignment = Alignment.CenterVertically),
            ) {
                Text(
                    text = item.title,
                    style = TextStyle(
                        color = Color(0xFF23262F),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = item.content,
                    style = TextStyle(
                        color = Color(0xFF777E90),
                        fontSize = 14.sp,
                    )
                )
            }
        }
    }
}

@Composable
fun CalendarView(time: Long) {
    val calendar = Calendar.getInstance().apply { timeInMillis = time }

    val year = calendar.get(Calendar.YEAR)
    val day = calendar.get(Calendar.DAY_OF_MONTH)
    val month = calendar.get(Calendar.MONTH)
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color(0xFFFDDC8E), shape = RoundedCornerShape(16.dp))
            .padding(8.dp)
    ) {
        Text(
            text = year.toString(),
            style = TextStyle(color = Color(0xFFB18620), fontSize = 12.sp)
        )
        Spacer(modifier = Modifier.size(15.dp))
        Row {
            Text(
                text = day.toString(),
                style = TextStyle(
                    color = Color(0xFFB18620),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = "Th${month.plus(1)}",
                style = TextStyle(color = Color(0xFFB18620), fontSize = 12.sp)
            )
        }
    }
}


val listDinotes = listOf(
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
    Dinotes(
        id = 1,
        title = "Trời hôm nay nhiều mây cực",
        content = "Một bài hát của Đen Vâu ye ye",
        time = System.currentTimeMillis()
    ),
)

