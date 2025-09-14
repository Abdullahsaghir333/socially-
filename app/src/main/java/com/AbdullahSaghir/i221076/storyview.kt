package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class storyview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_storyview)

        val storyclose = findViewById<ImageView>(R.id.viewstoryclose)

        // Close story and go back to mainpage
        storyclose.setOnClickListener {
            val intent = Intent(this, mainpage::class.java)
            startActivity(intent)
            finish()  // optional: prevents multiple mainpage instances
        }
    }
}
