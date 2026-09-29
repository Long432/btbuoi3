package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvResultUserName = findViewById<TextView>(R.id.tvResultUserName)
        val tvResultMSSV = findViewById<TextView>(R.id.tvResultMSSV)

        val userName = intent.getStringExtra("EXTRA_USERNAME")
        val mssv = intent.getStringExtra("EXTRA_MSSV")

        tvResultUserName.text = "Name: $userName"
        tvResultMSSV.text = "Student ID: $mssv"

        btnBack.setOnClickListener {
            finish()
        }
    }
}