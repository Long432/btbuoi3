package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtUserName = findViewById<EditText>(R.id.edtUserName)
        val edtMSSV = findViewById<EditText>(R.id.edtMSSV)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            val userName = edtUserName.text.toString().trim()
            val mssv = edtMSSV.text.toString().trim()

            if (userName.isEmpty()) {
                edtUserName.error = "Please enter your name!"
                edtUserName.requestFocus()
                return@setOnClickListener
            }

            if (mssv.isEmpty()) {
                edtMSSV.error = "Please enter your student ID!"
                edtMSSV.requestFocus()
                return@setOnClickListener
            }

            val intent = Intent(this, Screen2Activity::class.java).apply {
                putExtra("EXTRA_USERNAME", userName)
                putExtra("EXTRA_MSSV", mssv)
            }
            startActivity(intent)
        }
    }
}