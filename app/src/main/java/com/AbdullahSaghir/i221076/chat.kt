package com.AbdullahSaghir.i221076

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class chat : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)
        val back1=findViewById<ImageView>(R.id.chatback1)
        val dm2=findViewById<TextView>(R.id.chatdm)
        val dm1=findViewById<TextView>(R.id.chatdm1)
        back1.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
        }
        dm2.setOnClickListener {
            val intent = Intent(this, dm::class.java)
            startActivity(intent)
        }
        dm1.setOnClickListener {
            val intent = Intent(this, dm::class.java)
            startActivity(intent)
        }
    }
}