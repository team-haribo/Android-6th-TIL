package com.goms.minseok.`7-publishing`.screen

import androidx.compose.foundation.background
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
import com.goms.minseok.`7-publishing`.component.fifth.FifthBtn
import com.goms.minseok.`7-publishing`.component.fifth.FifthChart
import com.goms.minseok.`7-publishing`.component.fifth.FifthTitle
import com.goms.minseok.`7-publishing`.data.ChartData

@Composable
fun FifthScreen(){
    val data = listOf(
        ChartData("발생건수", "3", 0.5f),
        ChartData("사상자수", "6", 0.8f),
        ChartData("사망자수", "2", 0.35f),
        ChartData("중상자수", "1", 0.2f),
        ChartData("경상자수","1", 0.2f),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 20.dp, end = 20.dp),
    ) {
        Spacer(modifier = Modifier.fillMaxHeight(0.06f))
        FifthTitle()
        Spacer(modifier = Modifier.fillMaxHeight(0.03f))
        FifthChart(data = data)
        Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        FifthBtn {}
    }
}
@Preview(showBackground = true)
@Composable
fun FifthScreenPreview(){
    FifthScreen()
}