package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<TextView>(R.id.logintbn1)
        val signupBtn = findViewById<TextView>(R.id.signup)

        // Navigate to login credentials screen
        loginBtn.setOnClickListener {
            Log.d("LoginActivity", "Login button clicked")
            try {
                val intent = Intent(this, logincredentials::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("LoginActivity", "Error starting activity", e)
            }
        }

        // Navigate to signup screen
        signupBtn.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}
