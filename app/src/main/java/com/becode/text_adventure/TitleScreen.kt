package com.becode.text_adventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_title_screen.*

class TitleScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)
        //this calls on the button on the titlescreen
        titleButton.setOnClickListener{
            //this declares the intent of what it's going to do after listening.
            val Intent = Intent(this, GameScreen:: class.java)
            startActivity(Intent)
        }
    }
}