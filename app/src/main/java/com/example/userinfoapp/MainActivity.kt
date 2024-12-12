package com.example.userinfoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val buttonContinue = findViewById<Button>(R.id.buttonContinue)

        buttonContinue.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()

            // Создаем Intent для перехода на второй экран
            val intent = Intent(this, SecondActivity::class.java)
            // Передаем данные через Intent
            intent.putExtra("USER_NAME", name)
            intent.putExtra("USER_AGE", age)
            startActivity(intent)
        }
    }
}
