package com.AbdullahSaghir.i221076

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class voicecall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_voicecall)

        val endcall = findViewById<ImageView>(R.id.endcall)

        // Set click listener to finish the activity when end call is clicked
        endcall.setOnClickListener {
            finish()
        }

    }
}