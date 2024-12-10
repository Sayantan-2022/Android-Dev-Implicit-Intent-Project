package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnGoogle = findViewById<Button>(R.id.btnGoogle)
        val btnCamera = findViewById<Button>(R.id.btnCamera)
        val btnLinkedIn = findViewById<Button>(R.id.btnLinkedIn)

        btnGoogle.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.google.com/")
            startActivity(intent)
        }
        btnCamera.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        btnLinkedIn.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://www.linkedin.com/in/sayantan-sen-26843b31a?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app")
            startActivity(intent)
        }

    }
}