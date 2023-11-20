package com.goms.minseok.`7-publishing`.component.first

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.`7-publishing`.component.MainBtn

@Composable
fun FirstBtn(onClick: () -> Unit) {
    MainBtn(
        text = "시작하기",
        textColor = Color.White,
        buttonColor = Color(0xFF8287FF),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        onClick()
    }
}

@Preview(showBackground = true)
@Composable
fun FirstBtnPreview() {
    FirstBtn(onClick = {})
}

