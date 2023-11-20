package com.goms.minseok.`7-publishing`.component.second

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.goms.minseok.`7-publishing`.component.MainBtn

@Composable
fun SecondBtn(onClick: () -> Unit) {
    MainBtn(
        text = "다음",
        textColor = Color.White,
        buttonColor = Color(0xFF8287FF),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        onClick()
    }
}
