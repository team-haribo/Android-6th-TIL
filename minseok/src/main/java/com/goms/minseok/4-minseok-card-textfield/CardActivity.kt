package com.goms.minseok.`4-minseok-card-textfield`

import android.os.Bundle
import android.os.ParcelFileDescriptor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.ui.theme.Android6thTILTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                CardExam()
            }
        }
    }
}

@Composable
fun CardExam() {
    Column(Modifier.padding(10.dp)) {
        Card {
            Text(text = "Compose Card")
        }
        Card(
            shape = RoundedCornerShape(1.dp)
        ) {
            Text(text = "Compose Card")
        }
        Card(
            border = BorderStroke(5.dp, color = Color.Blue),
            shape = RoundedCornerShape(1.dp),
        ) {
            Text(text = "Compose Card",modifier = Modifier.padding(5.dp))

        }
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp
            ) // ```elevation = 12.dp```  Material3에서는 이러한 방식으로 작동하지 않는듯 하다.
        ) {
            Text(text = "Compose Card",modifier = Modifier.padding(5.dp))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview7() {
    Android6thTILTheme {
        CardExam()
    }
}