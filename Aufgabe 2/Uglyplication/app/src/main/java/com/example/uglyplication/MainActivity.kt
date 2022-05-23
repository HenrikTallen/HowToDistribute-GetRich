package com.example.uglyplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            Toast.makeText(this@MainActivity, "geilo !", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            throw RuntimeException ("Whoops")  // Zeile durch sinvolle Funktion ersetzen
        }
    }
}
