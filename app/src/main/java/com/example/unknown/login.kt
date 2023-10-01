package com.example.unknown

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.math.log

class login : AppCompatActivity() {
    private lateinit var logoutBtn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        logoutBtn = findViewById(R.id.logoutBtn)

        logoutBtn.setOnClickListener {
            val intent = Intent(this, services::class.java)
            startActivity(intent)
        }

    }
}