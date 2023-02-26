package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClikeMe = findViewById<Button>(R.id.mybutton)
        val textChangeAnother = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClikeMe.setOnClickListener {
            timesClicked += 1
            textChangeAnother.text = timesClicked.toString() + "번"
        }

    }
}