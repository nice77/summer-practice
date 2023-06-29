package com.example.task00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val result : TextView = findViewById(R.id.result)
            val naym : String = findViewById<TextView>(R.id.nameField).text.toString()
            val height : Int = findViewById<TextView>(R.id.heightField).text.toString().toInt()
            val weight : Double =  findViewById<TextView>(R.id.weightField).text.toString().toDouble()
            val age : Int = findViewById<TextView>(R.id.ageField).text.toString().toInt()
            if (height in 1..249 && weight in 1.0..249.0 && age in 1..149) {
                val stats : Int = (age - naym.length) + (height / weight).toInt()
                result.setText("${getString(R.string.result)} ${stats}")
            }
            else {
                result.setText("Result: incorrect data")
            }
        }
    }
}
