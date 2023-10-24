package com.goms.minseok.`6-minseok-zxing`

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.google.zxing.integration.android.IntentIntegrator

class ZxingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RunActivity()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents != null) {
                val scannedData = result.contents
            } else {

            }
        }
    }
}

@Composable
fun ZxingScanner(
    onQRCodeScanned: (String) -> Unit
) {
    val context = LocalContext.current

    val integrator = IntentIntegrator(context as Activity)
    integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
    integrator.initiateScan()
}

@Composable
fun WebView(url: String) {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                loadUrl(url)
            }
        }
    )
}
@Composable
fun RunActivity() {
    var scannedQRCode by remember { mutableStateOf<String?>(null) }

    ZxingScanner { qrCodeContents ->
        scannedQRCode = qrCodeContents
    }

    Column {
        scannedQRCode?.let { qrCodeContents ->
            WebView(qrCodeContents)
        }
    }
}