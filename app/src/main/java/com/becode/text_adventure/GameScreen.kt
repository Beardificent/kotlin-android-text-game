package com.becode.text_adventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_screen.*

class GameScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)

        val story = Story(this)
//had trouble getting the listener to work but had to replace the () with {}
        gameChoice1.setOnClickListener {
            story.selectPosition(story.nextPosition1)
        }
        gameChoice2.setOnClickListener {
            story.selectPosition(story.nextPosition2)
        }
        gameChoice3.setOnClickListener {
            story.selectPosition(story.nextPosition3)
        }
        gameChoice4.setOnClickListener {
            story.selectPosition(story.nextPosition4)
        }

        story.startingPoint()
    }
}