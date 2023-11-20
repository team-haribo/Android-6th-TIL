package com.goms.minseok.`7-publishing`.component.first

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.goms.minseok.R

@Composable
fun FirstScreenImg() {
    Image(
        painter = painterResource(id = R.drawable.ic_first_screen_img),
        contentDescription = "Start Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()
    )
}

