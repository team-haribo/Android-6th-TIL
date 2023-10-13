package com.goms.minseok.`3-miseok-lazyrow-lazycolumn`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.goms.minseok.ui.theme.Android6thTILTheme

class LazyrowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                LazyRowExam()
            }
        }
    }
}
@Composable
fun LazyRowExam() {
    val itemsList = (5..10).toList()
    val itemsIndexedList = listOf("A", "B", "C")

    LazyRow(modifier = Modifier.background(Color.White)) {
        item {
            Text("Single item  ")
        }

        items(count = itemsList.size) {
            Text("Item is ${itemsList[it]}  ")
        }

        itemsIndexed(items = itemsIndexedList) { index, item ->
            Text("Item at index $index is $item  ")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Android6thTILTheme {
        LazyRowExam()
    }
}