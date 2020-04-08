package com.example.stap2

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import layout.CustomController

class CustomActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)

        val viewGroup = findViewById<FrameLayout>(R.id.fl_custom)
        viewGroup.removeAllViews()
        viewGroup.addView(CustomController(this))
    }
}