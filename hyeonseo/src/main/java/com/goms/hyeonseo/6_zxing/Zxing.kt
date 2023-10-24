package com.goms.minseok.`3-miseok-lazyrow-lazycolumn`

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.core.app.ActivityCompat
import com.google.zxing.integration.android.IntentIntegrator

class QRScannerActivity : ComponentActivity() {
    private val scannerLauncher: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            val intentResult = IntentIntegrator.parseActivityResult(result.resultCode, result.data)
            if (intentResult.contents != null) {
                val scannedText = intentResult.contents
                // 여기서 스캔된 텍스트를 처리
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QRScannerContent(scannerLauncher)
        }
    }
}

@Composable
fun QRScannerContent(scannerLauncher: ActivityResultLauncher<Intent>) {
    val context = LocalContext.current
    val density = LocalDensity.current.density

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                // 카메라 권한 확인 및 요청
                if (ActivityCompat.checkSelfPermission(context, android.Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_GRANTED
                ) {
                    startScanner(context, scannerLauncher)
                } else {
                    requestCameraPermission()
                }
            }
        ) {
            Text("스캔 시작")
        }
    }
}

fun startScanner(context: Context, scannerLauncher: ActivityResultLauncher<Intent>) {
    val integrator = IntentIntegrator(context as Activity)
    integrator.initiateScan()
}

fun requestCameraPermission() {
    // 카메라 권한 요청 로직을
}