package com.example.tyler.hci_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class food : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        var i1 = findViewById<ImageView>(R.id.imageView13)
        var i2 = findViewById<ImageView>(R.id.imageView14)
        var i3 = findViewById<ImageView>(R.id.imageView15)
        var i4 = findViewById<ImageView>(R.id.imageView16)

        i1.setOnClickListener{
            i1.setImageResource(R.drawable.salad)
        }

        i2.setOnClickListener{
            i2.setImageResource(R.drawable.salad)
        }

        i3.setOnClickListener{
            i3.setImageResource(R.drawable.salad)
        }

        i4.setOnClickListener{
            i4.setImageResource(R.drawable.salad)
        }

        var b = findViewById<Button>(R.id.button6)
        b.setOnClickListener{
            val intent = Intent(this, fitness_history::class.java)
            startActivity(intent)
        }

    }
}
