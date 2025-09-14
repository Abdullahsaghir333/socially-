package com.AbdullahSaghir.i221076

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dm)
        val dm=findViewById<ImageView>(R.id.dmback1)
        val voice=findViewById<ImageView>(R.id.voicecall)
        dm.setOnClickListener {
            val intent = Intent(this, chat::class.java)
            startActivity(intent)
        }
        voice.setOnClickListener {
            val intent = Intent(this, voicecall::class.java)
            startActivity(intent)
        }

    }
}