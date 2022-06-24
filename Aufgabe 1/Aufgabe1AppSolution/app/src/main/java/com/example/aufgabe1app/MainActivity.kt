package com.example.aufgabe1app

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.sample_12s)
        mediaPlayer.isLooping = true
        mediaPlayer.start()

        val winButton = findViewById<Button>(R.id.winButton)
        winButton.setOnClickListener {
            val intent = Intent(this, WinActivity::class.java)
            startActivity(intent)
        }
    }

    // Aufg 1.1: Der MediaPlayer im Hintergrund verstößt gegen Qualitätsanforderungen CR-1/CR-8

    // Aufg 1.2
    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
    }

    // Aufg 1.2
    override fun onResume() {
        super.onResume()
        mediaPlayer.start()
    }
}