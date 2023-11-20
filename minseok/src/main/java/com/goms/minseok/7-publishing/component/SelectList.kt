package com.goms.minseok.`7-publishing`.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SelectList(list: List<String>){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(list.lastIndex) { index ->
            ListItemComponent(list[index])
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun ListItemComponent(data: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .shadow(elevation = 8.dp, spotColor = Color(0x14000000), ambientColor = Color(0x14000000))
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = data,
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight(500),
            letterSpacing = 0.16.sp,
        )
    }
}