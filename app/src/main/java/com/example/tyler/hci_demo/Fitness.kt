package com.example.tyler.hci_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Fitness : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitness)

        val flags = arrayListOf(false, false, false, false)

        val b = findViewById<Button>(R.id.button3)
        b.setOnClickListener {
            finish()
        }

        val b2 = findViewById<Button>(R.id.button4)
        b2.setOnClickListener{
            val intent = Intent(this, history_food::class.java)
            startActivity(intent)
        }

        val i1 = findViewById<ImageView>(R.id.imageView)
        val i2 = findViewById<ImageView>(R.id.imageView2)
        val i3 = findViewById<ImageView>(R.id.imageView3)
        val i4 = findViewById<ImageView>(R.id.imageView4)

        i1.setOnClickListener{
            i1.setImageResource(R.drawable.success)
            flags[0] = true
        }

        i2.setOnClickListener{
            i2.setImageResource(R.drawable.success)
            flags[1] = true
        }

        i3.setOnClickListener{
            i3.setImageResource(R.drawable.success)
            flags[2] = true
        }

        i4.setOnClickListener{
            i4.setImageResource(R.drawable.success)
            flags[3] = true
        }
    }
}
