package com.example.ebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        val historyBtn = findViewById<ImageView>(R.id.his_btn)
        historyBtn.setOnClickListener{
            val intent = Intent(this,page4::class.java)
            startActivity(intent)
        }
        val homeBtn = findViewById<ImageView>(R.id.home_btn)
        homeBtn.setOnClickListener{
            val intent = Intent(this,page3::class.java)
            startActivity(intent)
        }
        val accountBtn = findViewById<ImageView>(R.id.account_btn)
        accountBtn.setOnClickListener{
            val intent = Intent(this,page4::class.java)
            startActivity(intent)
        }
    }
}