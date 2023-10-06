package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.utils.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.textView)
        val dice = Dice(6)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
            resultTextView.text = dice.roll().toString()
        }
    }
}

