package com.becode.text_adventure

import kotlinx.android.synthetic.main.activity_game_screen.*

class Story (val gs: GameScreen) {

    var nextPosition1 = "";
    var nextPosition2 = "";
    var nextPosition3 = "";
    var nextPosition4 = "";

    fun selectPosition(position: String) {

        when(position){
            "startingPoint" -> startingPoint()
            "sign" -> sign()
        }
    }

    fun startingPoint () {

        gs.gameTextView.setText("You are on the road. There is a wooden sign nearby.\n\n What will you do?")

        gs.gameChoice1.setText("Go North.")
        gs.gameChoice2.setText("Go East.")
        gs.gameChoice3.setText("Go West.")
        gs.gameChoice4.setText("Read Sign.")

        nextPosition1 = "monster"
        nextPosition2 = "sword"
        nextPosition3 = "pipe"
        nextPosition4 = "sign"
    }
    fun sign (){

        gs.gameImageView.setImageResource(R.drawable.charmander)
        gs.gameTextView.setText("The sign reads: \n\nMONSTER AHEAD!")

        gs.gameChoice1.setText("Go back.")
        gs.gameChoice2.setText("")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }
}