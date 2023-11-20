package com.goms.minseok.`7-publishing`.component.fifth

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.goms.minseok.`7-publishing`.component.first.FirstSubTitleText
import com.goms.minseok.`7-publishing`.component.first.FirstTitleText

@Composable
fun FifthTitleText() {
    Text(
        text = "서울특별시 도봉구1",
        color = Color.Black,
        fontSize = 32.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.32.sp,
    )
}
@Composable
fun FifthSubTitleText() {
    Text(
        text = "서울특별시 도봉구 창동(창림초교 부근)",
        color = Color(0xFF989898),
        fontSize = 16.sp,
        fontWeight = FontWeight(500),
        letterSpacing = 0.16.sp,
    )
}
@Composable
fun FifthTitle(){
    FirstTitleText()
    Spacer(modifier = Modifier.height(4.dp))
    FirstSubTitleText()
}