package com.caren.accessibilitycheckstest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TextViewInsufficientColorContrast : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_insufficient_color_contrast)
    }
}