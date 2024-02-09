package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnexplicit = findViewById<Button>(R.id.button2)
        btnexplicit.setOnClickListener{
            val intent = Intent(applicationContext, SecondScreen::class.java)
            startActivity(intent)
        }

        val btnimplicit = findViewById<Button>(R.id.button3)
        btnimplicit.setOnClickListener{
            val webaddress = Intent(Intent.ACTION_VIEW)
            webaddress.data = Uri.parse("http://github.com/JohnCarroll1703")
            startActivity(webaddress)
        }

        val btnexplicit2 = findViewById<Button>(R.id.button4)

        btnexplicit2.setOnClickListener{
            val strtcam = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(strtcam)
        }
    }
}