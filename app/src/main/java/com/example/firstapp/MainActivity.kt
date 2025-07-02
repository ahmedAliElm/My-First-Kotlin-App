package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)


        val editText: EditText = findViewById(R.id.editText1)


        val btn: Button = findViewById(R.id.button1)

        btn.setOnClickListener {

            val textInput = editText.text.toString()

            Toast.makeText(this@MainActivity,
                textInput, Toast.LENGTH_LONG).show()
        }


        val img: ImageView = findViewById(R.id.img)

    }
}


























