package com.becode.text_adventure

import android.view.View
import kotlinx.android.synthetic.main.activity_game_screen.*

class Story (val gs: GameScreen) {

    var nextPosition1 = ""
    var nextPosition2 = ""
    var nextPosition3 = ""
    var nextPosition4 = ""

    fun selectPosition(position: String) {

        when(position){
            "startingPoint" -> startingPoint()
            "sign" -> sign()
            "pipe" -> pipe()
            "plant" -> plant()
            "sword" -> sword()
            "dead" -> dead()
            "goTitleScreen" -> gs.goTitleScreen()
        }
    }

    fun showAllButtons(){
        gs.gameChoice1.setVisibility(View.VISIBLE)
        gs.gameChoice2.setVisibility(View.VISIBLE)
        gs.gameChoice3.setVisibility(View.VISIBLE)
        gs.gameChoice4.setVisibility(View.VISIBLE)
    }
    fun startingPoint () {
        gs.gameImageView.setImageResource(R.drawable.charmander)
        gs.gameTextView.setText("You are on the road. There is a wooden sign nearby.\n\n What will you do?")

        gs.gameChoice1.setText("Go North.")
        gs.gameChoice2.setText("Go East.")
        gs.gameChoice3.setText("Go West.")
        gs.gameChoice4.setText("Read Sign.")

        showAllButtons()
        nextPosition1 = "monster"
        nextPosition2 = "sword"
        nextPosition3 = "pipe"
        nextPosition4 = "sign"
    }
    fun sign (){

        gs.gameImageView.setImageResource(R.drawable.charmeleon)
        gs.gameTextView.setText("The sign reads: \n\nMONSTER AHEAD!")

        gs.gameChoice1.setText("Go back.")
        gs.gameChoice2.setText("")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")
        gs.gameChoice2.setVisibility(View.INVISIBLE)
        gs.gameChoice3.setVisibility(View.INVISIBLE)
        gs.gameChoice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun pipe(){
        gs.gameImageView.setImageResource(R.drawable.charizard)
        gs.gameTextView.setText("You find a gigantic pipe")

        gs.gameChoice1.setText("Look inside.")
        gs.gameChoice2.setText("Go back")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")
        gs.gameChoice3.setVisibility(View.INVISIBLE)
        gs.gameChoice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "plant"
        nextPosition2 = "startingPoint"
        nextPosition3 = ""
        nextPosition4 = ""
    }
    fun plant(){
        gs.gameImageView.setImageResource(R.drawable.bulbasaur)
        gs.gameTextView.setText("There's a weird plant inside!! It released a poisonous spore\n\n " +
                "It seems you died. ")

        gs.gameChoice1.setText(">")
        gs.gameChoice2.setText("")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")
        gs.gameChoice2.setVisibility(View.INVISIBLE)
        gs.gameChoice3.setVisibility(View.INVISIBLE)
        gs.gameChoice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "dead"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun sword() {

        gs.gameImageView.setImageResource(R.drawable.squirtle)
        gs.gameTextView.setText("Amazing! A Snapping Turtle to fight for your safety!\n\n (You take some mud and use it as glue to attach the turtle to your fist)")

        gs.gameChoice1.setText("Back")
        gs.gameChoice2.setText("")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")
        gs.gameChoice2.setVisibility(View.INVISIBLE)
        gs.gameChoice3.setVisibility(View.INVISIBLE)
        gs.gameChoice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "startingPoint"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun dead() {
        gs.gameImageView.setImageResource(R.drawable.haunter)
        gs.gameTextView.setText("You wake up as a ghost. You realize you're dead.\n\n GAME OVER")

        gs.gameChoice1.setText("Back to title")
        gs.gameChoice2.setText("")
        gs.gameChoice3.setText("")
        gs.gameChoice4.setText("")
        gs.gameChoice2.setVisibility(View.INVISIBLE)
        gs.gameChoice3.setVisibility(View.INVISIBLE)
        gs.gameChoice4.setVisibility(View.INVISIBLE)

        nextPosition1 = "goTitleScreen"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }
}