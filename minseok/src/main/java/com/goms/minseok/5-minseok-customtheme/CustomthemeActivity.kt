package com.goms.minseok.`5-minseok-customtheme`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.goms.minseok.ui.theme.Android6thTILTheme

class CustomthemeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Customtheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(
        color = MaterialTheme.colorScheme.background,
        text = "Hello!",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview8() {
    Customtheme {
        Greeting()
    }
}

private val DarkColorPalette = darkColorScheme(
    background = Color.Green
)

private val LightColorPalette = lightColorScheme(
    background = Color.Red
)

@Composable
fun Customtheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}