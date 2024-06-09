package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var texto: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var count = 0

        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.number)
        button = findViewById(R.id.button)

        button.setOnClickListener{
            count ++
            texto.text="$count"
        }
    }
}