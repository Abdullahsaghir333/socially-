package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainpage)

        // Initialize views
        val img1 = findViewById<CardView>(R.id.user1)  // Changed to CardView
        val sear = findViewById<ImageView>(R.id.searchpos1)
        sear.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }
        val cam1 = findViewById<ImageView>(R.id.maincamera1)
        val dm = findViewById<ImageView>(R.id.homedm)
        val search = findViewById<ImageView>(R.id.mainsearch)
        val noti1 = findViewById<ImageView>(R.id.mainnotification)
        val profile = findViewById<CardView>(R.id.mainbottomprofilepic)
        val mystor1 = findViewById<CardView>(R.id.your_story)  // Changed to CardView

        // Story view
        img1.setOnClickListener {
            val intent = Intent(this, storyview::class.java)
            startActivity(intent)
        }

        // Camera
        cam1.setOnClickListener {
            val intent = Intent(this, camerainterface::class.java)
            startActivity(intent)
        }

        // DM/Chat
        dm.setOnClickListener {
            val intent = Intent(this, chat::class.java)
            startActivity(intent)
        }

        // Search
        search.setOnClickListener {
            val intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
        }

        // Profile
        profile.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
        }

        // Notifications
        noti1.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
        }

        // My Story
        mystor1.setOnClickListener {
            val intent = Intent(this, mystory::class.java)
            startActivity(intent)
        }

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}