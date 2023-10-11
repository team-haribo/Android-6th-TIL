package com.goms.minseok.`2-minseok-Box-Column-Row`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.ui.theme.Android6thTILTheme

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                ColumnExam()
            }
        }
    }
}

@Composable
fun ColumnExam() {
    //Colum은 Row와 다르게 horizontal 정렬
    /*Column(modifier = Modifier.size(100.dp)) {
        Text(text = "first!")
        Text(text = "second!")
        Text(text = "third!")
    }*/
    //1.horizontalAlignment 적용
    // Alignment 진행방향과 수직 Arrangement 진행방향
    /*Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(100.dp).background(Color.White)
    ) {
        Text(text = "first!")
        Text(text = "second!")
        Text(text = "third!")
    }*/
    //2.verticalArrangement 적용
    /*Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.size(100.dp).background(Color.White)
    ) {
        Text(text = "first!")
        Text(text = "second!")
        Text(text = "third!")
    }*/
    //3. Text에 modifier적용
    Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.size(100.dp).background(Color.White)
    ) {
        //Alignment 에서 center(CenterHorizontally,CenterVertically) Arrangement 에서 center(Center)
        Text(text = "first!", modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "second!")
        Text(text = "third!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Android6thTILTheme {
        ColumnExam()
    }
}