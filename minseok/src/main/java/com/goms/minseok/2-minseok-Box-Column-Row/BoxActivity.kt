package com.goms.minseok.`2-minseok-Box-Column-Row`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                BoxExam()
            }
        }
    }
}

@Composable
fun BoxExam() {
    //compose 의 box는 xml에서의 FrameLayout과 유사
    //1.box안에서 여러개의 텍스트 배치
    /*Box(modifier = Modifier.size(100.dp).background(Color.White)) {

        Text(
            text = "Compose",
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "Box!",
            modifier = Modifier.align(Alignment.BottomCenter)
        )
        Text(
            text = "Hello",
            modifier = Modifier.align(Alignment.TopCenter)
        )
    }*/
    //2.Box안에 Box배치
    /*Box(modifier = Modifier.size(100.dp).background(Color.White)){
        Box(modifier = Modifier.size(70.dp).background(Color.LightGray).align(Alignment.BottomStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.TopEnd))
    }*/
    //3.부모 Box의 Modifier 설정을 제거해 wrap_content 처럼 만들기
    Box{
        Box(modifier = Modifier.fillMaxSize().background(Color.Gray).align(Alignment.BottomStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Red).align(Alignment.Center))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Android6thTILTheme {
        BoxExam()
    }
}