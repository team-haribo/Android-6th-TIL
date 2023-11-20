package com.goms.minseok.`7-publishing`.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListNavNextBtn(
    modifier: Modifier,
    onClick: () -> Unit
) {
    MainBtn(
        text = "다음",
        textColor = Color.White,
        buttonColor = Color(0xFF8287FF),
        modifier = modifier
    ) {
        onClick()
    }
}
@Composable
fun ListNavBackBtn(
    modifier: Modifier,
    onClick: () -> Unit
) {
    MainBtn(
        text = "이전",
        textColor = Color.Black,
        buttonColor = Color(0xFFEDEDED),
        modifier = modifier
    ) {
        onClick()
    }
}

@Composable
fun ListNavBtn(
    modifier: Modifier,
    onBackClick: () -> Unit,
    onNextClick: () -> Unit
) {
    Row(modifier = Modifier.padding(start = 6.dp, end = 6.dp)) {
        ListNavBackBtn(
            modifier = Modifier
                .height(56.dp)
                .weight(1f)
        ) {
            onBackClick()
        }
        Spacer(modifier = Modifier.width(5.dp))
        ListNavNextBtn(
            modifier = Modifier
                .height(56.dp)
                .weight(1f)
        ) {
            onNextClick()
        }
    }
}
