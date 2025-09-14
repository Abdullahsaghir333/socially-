package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Searchpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_searchpage)

        // Initialize views
        val pos = findViewById<ImageView>(R.id.searchpos)
        val home = findViewById<ImageView>(R.id.searchhome)
        val noti = findViewById<ImageView>(R.id.searchnotification)
        val prof = findViewById<CardView>(R.id.mainbottomprofilepic)
        val searchBar = findViewById<TextView>(R.id.search_bar) // Fixed typo: searhbar -> searchBar

        // Gallery picker navigation (camera/post functionality)
        pos.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }

        // Search bar navigation
        searchBar.setOnClickListener {
            val intent = Intent(this, searchbaractivity::class.java)
            startActivity(intent)
        }

        // Bottom navigation
        home.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
        }

        noti.setOnClickListener {
            val intent = Intent(this, notifications::class.java)
            startActivity(intent)
        }

        prof.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
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