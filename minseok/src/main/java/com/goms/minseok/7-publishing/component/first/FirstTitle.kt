package com.goms.minseok.`7-publishing`.component.first

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstTitleText() {
    Text(
        text = "PROTECT",
        color = Color.Black,
        fontSize = 32.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.32.sp,
    )
}

@Composable
fun FirstSubTitleText() {
    Text(
        text = "스쿨존 사고를 알아보아요",
        color = Color(0xFF989898),
        fontSize = 16.sp,
        fontWeight = FontWeight(500),
        letterSpacing = 0.16.sp,
    )
}

@Composable
fun FirstTitle(){
    FirstTitleText()
    Spacer(modifier = Modifier.height(4.dp))
    FirstSubTitleText()
}