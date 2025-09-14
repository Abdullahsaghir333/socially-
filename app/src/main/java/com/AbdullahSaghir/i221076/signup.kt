package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val name = findViewById<EditText>(R.id.name)
        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val lastname = findViewById<EditText>(R.id.lastName)
        val dob = findViewById<EditText>(R.id.dob)
        val btn = findViewById<Button>(R.id.createAccountButton)
        val backBtn = findViewById<ImageView>(R.id.back) // back arrow

        // Create Account button logic
        btn.setOnClickListener {
            val nameText = name.text.toString().trim()
            val usernameText = username.text.toString().trim()
            val emailText = email.text.toString().trim()
            val passwordText = password.text.toString().trim()
            val lastnameText = lastname.text.toString().trim()
            val dobText = dob.text.toString().trim()

            if (nameText.isEmpty() || usernameText.isEmpty() || emailText.isEmpty() ||
                passwordText.isEmpty() || lastnameText.isEmpty() || dobText.isEmpty()
            ) {
                // Show Toast if any field is empty
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                // Navigate to login activity
                val intent = Intent(this, login::class.java)
                startActivity(intent)
                finish()
            }
        }

        // Back button logic → return to previous activity
        backBtn.setOnClickListener {
            finish()  // ends current activity and goes back
        }
    }
}
