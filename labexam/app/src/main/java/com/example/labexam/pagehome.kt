package com.example.labexam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pagehome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagehome)
        val newp:ImageView = findViewById(R.id.image20)
        val newt:ImageView = findViewById(R.id.image8)


        newp.setOnClickListener {
            val intent = Intent(this,Userprofile::class.java)
            startActivity(intent)
        }


        newt.setOnClickListener {
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }
    }
}