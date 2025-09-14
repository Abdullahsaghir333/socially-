package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profilepage)

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bottom navigation + button
        val home = findViewById<ImageView>(R.id.myprofilehome)
        val search = findViewById<ImageView>(R.id.myprofilesearch)
        val noti = findViewById<ImageView>(R.id.myprofilenoti)
        val editprofile = findViewById<Button>(R.id.editprofile)

        // Go to Home Page
        home.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)  // change to your home activity
            startActivity(intent)
        }

        // Go to Search Page
        search.setOnClickListener {
            val intent = Intent(this, searchbaractivity::class.java) // replace with your search activity
            startActivity(intent)
        }

        // Go to Notifications Page
        noti.setOnClickListener {
            val intent = Intent(this, notifications::class.java) // replace with your notifications activity
            startActivity(intent)
        }

        val sear = findViewById<ImageView>(R.id.searchpos5)
        sear.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }
        // Go to Edit Profile Page
        editprofile.setOnClickListener {
            val intent = Intent(this, editprofilepage::class.java) // replace with your edit profile activity
            startActivity(intent)
        }

        // Debug Log
        Log.d("ProfileActivity", "Layout inflated successfully")
    }
}
