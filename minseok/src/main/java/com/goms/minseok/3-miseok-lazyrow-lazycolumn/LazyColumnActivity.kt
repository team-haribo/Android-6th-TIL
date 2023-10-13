package com.goms.minseok.`3-miseok-lazyrow-lazycolumn`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.goms.minseok.ui.theme.Android6thTILTheme

class LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android6thTILTheme {
                StickyHeaderLazyColumn()
            }
        }
    }
}

@Composable
fun LazyColumnExam() {
    val itemsList = (0..5).toList()
    val itemsIndexedList = listOf("A", "B", "C")
    LazyColumn(modifier = Modifier.background(Color.White)){
        item {
            WordBox(data = "Single item")
        }

        items(count = itemsList.size) {
            NumBox(data = itemsList[it])
        }

        itemsIndexed(items = itemsIndexedList) { index, item ->
            WordBox(num = index, data = itemsIndexedList[index])
        }
    }
}
data class Item(val category: Char, val number: Int)

val data = ('A'..'E').flatMap { char ->
    (0 .. 5).map { index ->
        Item(char, index)
    }//item(a,0) item(a,1) item(a,2) item(a,3) item(a,4)
     //item(b,0) ...
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StickyHeaderLazyColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        data.forEachIndexed { index,item ->
            if(item.number == 0) {
                stickyHeader {
                    StickyBox(num = -1, data = item.category.toString())
                }
            }
            item {
                if(item.number != 0) {
                    StickyBox(num = item.number, data = item.category.toString())
                }
            }
        }
    }
}



@Composable
fun StickyBox(num: Int, data: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .border(width = 4.dp, color = Color.Black)
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Box(modifier = Modifier.padding(10.dp)) {
            if(num != -1) {
                Text("$data-$num")
            }else{
                Text("$data", modifier = Modifier.background(Color.Red))
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    Android6thTILTheme {
        //LazyColumnExam()
        StickyHeaderLazyColumn()
    }
}
@Composable
fun NumBox(data: Int){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .border(width = 4.dp, color = Color.Black)
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Box(modifier = Modifier.padding(10.dp)){
            Text("item is ${data}")
        }

    }
}
@Composable
fun WordBox(num: Int = 1,data: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .border(width = 4.dp, color = Color.Black)
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Box(modifier = Modifier.padding(10.dp)) {
            Text("item is ${num} data : ${data}")
        }
    }
}