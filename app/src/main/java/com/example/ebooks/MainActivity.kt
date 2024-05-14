package com.example.ebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBtn = findViewById<Button>(R.id.loginbtn)
        loginBtn .setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)

        }
    }

}