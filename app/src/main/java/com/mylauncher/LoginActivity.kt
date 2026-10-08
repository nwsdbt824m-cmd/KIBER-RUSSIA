package com.mylauncher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnStart = findViewById<Button>(R.id.btnStartLauncher)
        btnStart.setOnClickListener {
            val intent = Intent(this, ServersActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
