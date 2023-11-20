package com.goms.minseok.`7-publishing`.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainBtn(
    text: String,
    textColor: Color,
    buttonColor: Color,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(buttonColor),
        onClick = { onClick() }
    ) {
        Text(
            text = text,
            color = textColor,
        )
    }
}
