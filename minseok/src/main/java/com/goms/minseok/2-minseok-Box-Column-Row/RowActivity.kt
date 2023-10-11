package com.goms.minseok.`2-minseok-Box-Column-Row`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.ui.theme.Android6thTILTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                RowExam()
            }
        }
    }
}

@Composable
fun RowExam() {
    //1.Row에 여러개의 text 배치
    /*Row(modifier = Modifier.background(Color.White)){
        Text(text = "first! ")
        Text(text = "second! ")
        Text(text = "third!")
    }*/
    //2.Row의 text에 align 적용
    /*Row(modifier = Modifier.height(100.dp).background(Color.White)){
        //Row는 기본적으로 vertical정렬 따라서 align은 horizontal 즉 수직으로 적용
        Text(text = "first! ", modifier = Modifier.align(Alignment.Top))
        Text(text = "second! ", modifier = Modifier.align(Alignment.CenterVertically))
        Text(text = "third!", modifier = Modifier.align(Alignment.Bottom))
    }*/
    //3.Row의 모든요소에 공동으로 align적용
    /*Row(verticalAlignment = Alignment.Bottom,
        modifier = Modifier.height(100.dp).background(Color.White)
    ){
        Text(text = "first! ", modifier = Modifier.align(Alignment.CenterVertically))// 한가지 요소만 따로 align적용 가능
        Text(text = "second! ")
        Text(text = "third!")
    }*/
    //4.Row에 horizontalArrangement 적용
    /*Row(horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.height(100.dp).width(200.dp).background(Color.White)
    ){
        Text(text = "first! ", modifier = Modifier.align(Alignment.CenterVertically))// 한가지 요소만 따로 align적용 가능
        Text(text = "second! ")
        Text(text = "third!")
    }*/
    //Row의 자식을 비율에 맞춰 정렬
    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.height(100.dp).width(300.dp).background(Color.White)
    ){
        Text(text = "first! ", modifier = Modifier.weight(3f))
        Text(text = "second! ",modifier = Modifier.weight(2f))
        Text(text = "third!",modifier = Modifier.weight(3f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android6thTILTheme {
        RowExam()
    }
}