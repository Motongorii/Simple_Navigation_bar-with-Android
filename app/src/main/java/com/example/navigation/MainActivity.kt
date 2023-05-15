package com.example.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var home_button: Button
    lateinit var about_button: Button
    lateinit var blog_button: Button
    lateinit var services_button: Button
    lateinit var contacts_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home_button = findViewById(R.id.btnhome)
        about_button = findViewById(R.id.btnabout)
        blog_button = findViewById(R.id.btnblog)
        services_button = findViewById(R.id.btnservices)
        contacts_button = findViewById(R.id.btncontact)


        //give a set on click listner

        home_button.setOnClickListener {
            var gotohome = Intent(this, Home::class.java)
            startActivity(gotohome)

        }

        about_button.setOnClickListener {
            var gotoabout = Intent(this, About::class.java)
            startActivity(gotoabout)
        }
        blog_button.setOnClickListener {
            var gotoblog = Intent(this, Blog::class.java)
            startActivity(gotoblog)
        }
        services_button.setOnClickListener {
            var gotoservices = Intent(this, Services::class.java)
            startActivity(gotoservices)
        }
    }
}