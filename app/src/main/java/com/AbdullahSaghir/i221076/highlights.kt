package com.AbdullahSaghir.i221076

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.AbdullahSaghir.i221076.R.id.highlightsclose

class highlights : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_highlights)
        val clos=findViewById<ImageView>(highlightsclose)
            clos.setOnClickListener {
                val intent = Intent(this, profileview::class.java) // Replace with your home activity
                startActivity(intent)
                finish()
            }

    }
}