package com.example.tyler.hci_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class demo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        val b1 = findViewById<Button>(R.id.button)
        val b2 = findViewById<Button>(R.id.button2)

        b1.setOnClickListener{
            val intent = Intent(this, Fitness::class.java)
            startActivity(intent)
        }

        b2.setOnClickListener{
            val intent = Intent(this, food::class.java)
            startActivity(intent)
        }
    }
}
