package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class storypost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_storypost)

        val btn = findViewById<ImageView>(R.id.btnclose)

        btn.setOnClickListener {
            try {
                val intent = Intent(this, camerainterface::class.java)
                startActivity(intent)
                finish()  // closes storypost so only camerainterface stays
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Error opening Camera Interface", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
