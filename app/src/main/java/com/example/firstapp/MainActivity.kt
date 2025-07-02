package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)


        val resultText: TextView = findViewById(R.id.result)
        val btn: Button = findViewById(R.id.button1)
        val editText: EditText = findViewById(R.id.et1)

        btn.setOnClickListener() {

            var kilos = editText.text.toString().toFloat()

            resultText.setText("${convertToPounds(kilos)} pounds.")
        }
    }

    fun increaseCounter(): Int {
        return ++counter
    }

    fun convertToPounds(kilos: Float): Float {
        return kilos * 2.2f
    }
}


























