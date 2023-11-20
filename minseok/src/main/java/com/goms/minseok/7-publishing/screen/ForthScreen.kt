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
import com.goms.minseok.`7-publishing`.component.ListNavBtn
import com.goms.minseok.`7-publishing`.component.SelectList
import com.goms.minseok.`7-publishing`.component.SelectListTitle

@Composable
fun ForthScreen(
    onClick: () -> Unit,
) {
    val circuitList = listOf("용당1동", "용당2동", "연동", "산정동", "연상동", "원산동", "대성동", "목원동","동명동","삼향동","유달동","옥암동","부주동")
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F9))
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Column() {
            Spacer(modifier = Modifier.fillMaxHeight(0.03f))
            SelectListTitle(text = "목포시의 행정구역을 선택해주세요.")
            Spacer(modifier = Modifier.height(16.dp))
            SelectList(list = circuitList)
        }
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.9f))
            ListNavBtn(modifier = Modifier
                .height(56.dp)
                .weight(1f),
                onBackClick = {},
                onNextClick = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ForthScreenPreview() {
    ForthScreen({})
}

