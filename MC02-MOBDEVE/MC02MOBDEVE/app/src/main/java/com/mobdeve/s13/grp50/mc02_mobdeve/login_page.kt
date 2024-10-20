package com.mobdeve.s13.grp50.mc02_mobdeve

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        // Find views by their IDs
        val loginButton = findViewById<Button>(R.id.loginbtn)
        val signUpTextView = findViewById<TextView>(R.id.signUp)

        // Set OnClickListener for the login button
        loginButton.setOnClickListener {
            // Start MainMenu activity when login button is clicked
            val intent = Intent(this, MainMenu::class.java) // Adjust to your MainMenu class name
            startActivity(intent)
        }

        // Set OnClickListener for the sign-up text
        signUpTextView.setOnClickListener {
            // Start SignUpPage activity when sign-up text is clicked
            val intent = Intent(this, SignupPage::class.java) // Adjust to your SignUpPage class name
            startActivity(intent)
        }
    }
}
