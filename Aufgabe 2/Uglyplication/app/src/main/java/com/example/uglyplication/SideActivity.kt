package com.example.uglyplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.RuntimeException

class SideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)

        val button = findViewById<Button>(R.id.back)
        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar.title = "Danke"

        }

        button.setOnClickListener {
            throw RuntimeException();
        }

    }
}