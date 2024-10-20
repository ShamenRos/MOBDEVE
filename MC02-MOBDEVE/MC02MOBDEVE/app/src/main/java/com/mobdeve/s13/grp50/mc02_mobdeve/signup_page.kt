package com.mobdeve.s13.grp50.mc02_mobdeve

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)

        // Handling system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the Register button and set click listener
        val registerButton = findViewById<Button>(R.id.registerbtn)
        registerButton.setOnClickListener {
            // Start the LoginActivity when Register button is clicked
            val intent = Intent(this, LoginActivity::class.java) // LoginActivity is the new activity for login
            startActivity(intent)
        }

        // Find the "Sign in" text and set click listener
        val signInText = findViewById<TextView>(R.id.signin)
        signInText.setOnClickListener {
            // Start the LoginActivity when "Sign in" text is clicked
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
