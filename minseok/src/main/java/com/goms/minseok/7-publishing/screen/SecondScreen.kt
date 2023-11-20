package com.goms.minseok.`7-publishing`.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.`7-publishing`.component.SelectList
import com.goms.minseok.`7-publishing`.component.SelectListTitle
import com.goms.minseok.`7-publishing`.component.second.SecondBtn

@Composable
fun SecondScreen(
    onClick: () -> Unit,
) {
    val circuitList = listOf("강원도", "경기도", "충청북도", "충청남도", "경상북도", "전라북도", "경상남도", "전라남도")
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F9))
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Column() {
            Spacer(modifier = Modifier.fillMaxHeight(0.03f))
            SelectListTitle(text = "행정구역을 선택해주세요.")
            Spacer(modifier = Modifier.height(16.dp))
            SelectList(list = circuitList)
        }
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.855f))
            SecondBtn { }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen({})
}

