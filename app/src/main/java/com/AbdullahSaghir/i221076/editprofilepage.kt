package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class editprofilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_editprofilepage)

        val cancel = findViewById<TextView>(R.id.cancel)
        val done = findViewById<TextView>(R.id.done)

        // Navigate to profile when cancel pressed
        cancel.setOnClickListener {
            try {
                val intent = Intent(this, profilepage::class.java)
                startActivity(intent)
                finish()
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Error opening Profile page", Toast.LENGTH_SHORT).show()
            }
        }

        // Navigate to profile when done pressed
        done.setOnClickListener {
            try {
                val intent = Intent(this, profilepage::class.java)
                startActivity(intent)
                finish()
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Error opening Profile page", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
