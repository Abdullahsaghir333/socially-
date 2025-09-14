package com.AbdullahSaghir.i221076

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gallerypicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gallerypicker)

        // Initialize cancel button
        val cancel = findViewById<TextView>(R.id.gallercancel)
        cancel.setOnClickListener {
            finish()
        }

    }
}