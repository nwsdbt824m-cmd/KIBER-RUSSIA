package com.mylauncher

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ServersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servers)

        val btnConnect1 = findViewById<Button>(R.id.btnConnect1)

        btnConnect1.setOnClickListener {
            Toast.makeText(this, "Подключение к KIBER RUSSIA...", Toast.LENGTH_SHORT).show()

            try {
                val launchIntent = packageManager.getLaunchIntentForPackage("com.kiber.russia")
                
                if (launchIntent != null) {
                    launchIntent.putExtra("ip", "91.219.149.29") 
                    launchIntent.putExtra("port", 1480)       
                    startActivity(launchIntent)
                } else {
                    Toast.makeText(this, "Ошибка: Клиент KIBER RUSSIA не найден!", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Не удалось запустить игру", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
