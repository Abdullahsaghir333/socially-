package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class camerainterface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camerainterface)

        val story = findViewById<ImageView>(R.id.camera_capture_button)
        val backtick = findViewById<ImageView>(R.id.backtomain)

        // Navigate to StoryPost page after capture
        story.setOnClickListener {
            val intent = Intent(this, storypost::class.java) // replace with your story post activity
            startActivity(intent)
        }

        // Navigate back to MainPage
        backtick.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
        }
    }
}
