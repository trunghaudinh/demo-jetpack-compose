package com.trunghaudinh.jetpack_compose

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield


val listBanner = listOf(
    R.drawable.img_slide_1,
    R.drawable.img_slide_2,
    R.drawable.img_slide_3,
    R.drawable.img_slide_4,
)

@ExperimentalPagerApi
@Composable
fun ViewPagerSlider() {
    val pageState = rememberPagerState(
        initialPage = 0,
    )

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2000)
            pageState.animateScrollToPage(
                page = (pageState.currentPage + 1) % (pageState.pageCount),
                animationSpec = tween(600)
            )
        }
    }


    HorizontalPager(
        state = pageState,
        count = listBanner.size,
        verticalAlignment = Alignment.Top,
        contentPadding = PaddingValues(32.dp)
    ) { page ->

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = listBanner[page]),
                contentDescription = "demo",
            )
        }

    }
}

