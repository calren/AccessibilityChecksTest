package com.caren.accessibilitycheckstest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.caren.accessibilitycheckstest.ui.theme.AccessibilityChecksTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccessibilityChecksTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        TextWithInsufficientColorContrast()

                        ButtonWithInsufficientTouchTargetSize()
                    }
                }
            }
        }
    }
}

@Composable
fun TextWithInsufficientColorContrast() {
    Text(text = "Hello!", color = Color.Yellow, fontSize = 30.sp)
}

@Composable
fun ButtonWithInsufficientTouchTargetSize() {
    Button(
        onClick = {
            Log.i("Caren", "Clicked on button")
        },
        modifier = Modifier.size(30.dp)
    ) {
        Icon(
            Icons.Filled.Favorite,
            contentDescription = "Favorite"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AccessibilityChecksTestTheme {
        TextWithInsufficientColorContrast()
    }
}