package com.AbdullahSaghir.i221076

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class logincredentials : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logincredentials)

        val username = findViewById<EditText>(R.id.username1)
        val password = findViewById<EditText>(R.id.password1)
        val loginBtn = findViewById<Button>(R.id.loginButton)   // login button
        val signupBtn = findViewById<TextView>(R.id.signup1)     // signup textview
        val back=findViewById<TextView>(R.id.back1)

        // Login button logic
        loginBtn.setOnClickListener {
            val userText = username.text.toString().trim()
            val passText = password.text.toString().trim()


                if (userText == "" && passText == "") {
                    // Correct credentials → go to Main Page
                    val intent = Intent(this, mainpage::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Wrong credentials
                    Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }

        }

        // Signup navigation
        signupBtn.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)

        }
        back.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
    }
}
