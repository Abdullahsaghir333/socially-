package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class followrequests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_followrequests)

        val home = findViewById<ImageView>(R.id.followrequesthome)
        val search = findViewById<ImageView>(R.id.followsearch1)
        val profile = findViewById<CardView>(R.id.followprofile)
        val follo = findViewById<LinearLayout>(R.id.following)

        // Navigate to Home Page
        home.setOnClickListener {
            val intent = Intent(this, mainpage::class.java) // your home activity
            startActivity(intent)
        }
        val sear = findViewById<ImageView>(R.id.searchpos3)
        sear.setOnClickListener {
            val intent = Intent(this, gallerypicker::class.java)
            startActivity(intent)
        }
        // Navigate to Search Page
        search.setOnClickListener {
            val intent = Intent(this, Searchpage::class.java) // your search activity
            startActivity(intent)
        }

        // Navigate to Profile Page
        profile.setOnClickListener {
            val intent = Intent(this, profilepage::class.java) // your profile activity
            startActivity(intent)
        }

        // Navigate to Following Page
        follo.setOnClickListener {
            val intent = Intent(this, notifications::class.java) // replace with your following activity
            startActivity(intent)
        }
    }
}
