package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profileview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profileview)

        // Handle window insets for edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize highlights
        val highlight = findViewById<CardView>(R.id.highlight1)
        highlight.setOnClickListener {
            val intent = Intent(this, highlights::class.java)
            startActivity(intent)
        }

        // Initialize back button
        val backButton = findViewById<ImageView>(R.id.profileback)
        backButton.setOnClickListener {
            finish()
        }

        // Initialize follow button functionality
        val foll = findViewById<CardView>(R.id.followrequestid)
        val foll1 = findViewById<TextView>(R.id.followrequestid1)

        foll.setOnClickListener {
            // Toggle follow/unfollow
            if (foll1.text == "Follow") {
                foll1.text = "Following"
                foll1.setBackgroundColor(ContextCompat.getColor(this, R.color.transparent))

            } else {
                foll1.text = "Follow"
                foll1.setBackgroundColor(ContextCompat.getColor(this, R.color.biege))

            }
        }

        // Initialize navigation elements
        setupNavigation()
    }

    private fun setupNavigation() {
        // Bottom navigation elements
        val home = findViewById<ImageView>(R.id.profilehome)
        val search = findViewById<ImageView>(R.id.profilesearch)
        val notification = findViewById<ImageView>(R.id.profilnotification)
        val profile = findViewById<ImageView>(R.id.profilemyprofile)
        val sear = findViewById<ImageView>(R.id.searchpos4)

        // Gallery picker navigation
        sear.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }

        // Home navigation
        home.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
            finish()
        }

        // Search navigation
        search.setOnClickListener {
            val intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
            finish()
        }

        // Notification navigation
        notification.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
            finish()
        }

        // Profile navigation - Fixed: changed from 'profile' to 'profilepage'
        profile.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}