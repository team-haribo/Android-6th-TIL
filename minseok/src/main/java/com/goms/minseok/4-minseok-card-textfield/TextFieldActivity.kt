package com.goms.minseok.`4-minseok-card-textfield`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.goms.minseok.ui.theme.Android6thTILTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                TextFieldExam()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldExam() {
    var data by remember {
        mutableStateOf("Hellow")
    }
    Column(modifier = Modifier.background(Color.White)) {
        TextField(value = "Hello", onValueChange = {})

        TextField(value = data, onValueChange = {data = it}) // 값 변경 가능

        TextField(
            value = "Hello",
            label = {
                    Text(text = "텍스트 필드")
            },
            onValueChange = {})
        OutlinedTextField(
            value = "Hello",
            label = {
                Text(text = "텍스트 필드")
            },
            onValueChange = {})
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    Android6thTILTheme {
        TextFieldExam()
    }
}