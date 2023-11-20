package com.goms.minseok.`7-publishing`.component.fifth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.goms.minseok.`7-publishing`.data.ChartData

@Composable
fun FifthChart(
    data: List<ChartData>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        data.forEach { barData ->
            Column {
                Text(
                    text = barData.title,
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(700),
                    letterSpacing = 0.16.sp,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp)
                        .background(
                            color = Color(0xFFDDDDDD),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(barData.value)
                            .height(24.dp)
                            .background(
                                Color(0xFF8287FF),
                                shape = RoundedCornerShape(size = 8.dp)
                            )
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = barData.label,
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight(500),
                            letterSpacing = 0.16.sp,
                        )
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}