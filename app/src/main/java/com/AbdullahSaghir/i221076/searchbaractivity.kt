package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class searchbaractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchbaractivity)

        // Since searchbarback is a CardView
        val backButton = findViewById<CardView>(R.id.searchbarback)
        val user1 = findViewById<LinearLayout>(R.id.searchbaruser1)

        backButton.setOnClickListener {
            // Go back to searchpage activity
            val intent = Intent(this, Searchpage::class.java)
            startActivity(intent)
        }

        // Add click listener for user1
        user1.setOnClickListener {
            val intent = Intent(this, profileview::class.java)
            startActivity(intent)
        }
    }
}