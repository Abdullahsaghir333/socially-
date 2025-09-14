package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class notifications : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notifications)

        // Note: Removed window insets handling since there's no 'main' ID in the layout

        // Initialize navigation
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        // Get references to navigation elements
        val home = findViewById<ImageView>(R.id.notihome)
        val search = findViewById<ImageView>(R.id.notisearch)
        val profile = findViewById<ImageView>(R.id.noti_profile)
        val follow=findViewById<LinearLayout>(R.id.followrequest)
        // Home navigation - navigate to MainActivity
        val sear = findViewById<ImageView>(R.id.searchpos2)
        sear.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close current activity
        }

        // Search navigation - navigate to Searchpage
        search.setOnClickListener {
            val intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
            finish()
        }

        // Profile navigation - navigate to profileview
        profile.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
            finish()
        }
        follow.setOnClickListener {
            val intent = Intent(this, followrequests::class.java)
            startActivity(intent)
            finish()

        }
    }


}