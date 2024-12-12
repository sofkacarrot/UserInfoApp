package com.example.userinfoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        // Получаем переданные данные из Intent
        val name = intent.getStringExtra("USER_NAME")
        val age = intent.getStringExtra("USER_AGE")

        // Отображаем данные
        textViewWelcome.text = "Добро пожаловать, $name. Ваш возраст: $age."

        // Кнопка назад
        buttonBack.setOnClickListener {
            // Переход обратно на главный экран
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}