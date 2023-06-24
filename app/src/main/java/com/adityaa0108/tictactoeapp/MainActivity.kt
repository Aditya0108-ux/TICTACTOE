package com.adityaa0108.tictactoeapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var imagebutton1:ImageView
    lateinit var imagebutton2:ImageView
    lateinit var imagebutton3:ImageView
    lateinit var imagebutton4:ImageView
    lateinit var imagebutton5:ImageView
    lateinit var imagebutton6:ImageView
    lateinit var imagebutton7:ImageView
    lateinit var imagebutton8:ImageView
    lateinit var imagebutton9:ImageView

    private var startgame:String = "X"
    var b1 = 5
    var b2 = 5
    var b3 = 5
    var b4 = 5
    var b5 = 5
    var b6 = 5
    var b7 = 5
    var b8 = 5
    var b9 = 5
   var crossCount = 0
    var zeroCount = 0
    var i=0
    private lateinit var scoreA : TextView
    private lateinit var scoreB : TextView
    private lateinit var reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      imagebutton1 = findViewById(R.id.buttonImage1)
        imagebutton2 = findViewById(R.id.buttonImage2)
        imagebutton3= findViewById(R.id.buttonImage3)
        imagebutton4 = findViewById(R.id.buttonImage4)
        imagebutton5 = findViewById(R.id.buttonImage5)
        imagebutton6 = findViewById(R.id.buttonImage6)
        imagebutton7 = findViewById(R.id.buttonImage7)
        imagebutton8 = findViewById(R.id.buttonImage8)
        imagebutton9 = findViewById(R.id.buttonImage9)
          scoreA = findViewById(R.id.scoreA)
          scoreB = findViewById(R.id.scoreB)
           reset = findViewById(R.id.Reset)
          reset.setOnClickListener {
              imagebutton1.setImageDrawable(null)
              imagebutton2.setImageDrawable(null)
              imagebutton3.setImageDrawable(null)
              imagebutton4.setImageDrawable(null)
              imagebutton5.setImageDrawable(null)
              imagebutton6.setImageDrawable(null)
              imagebutton7.setImageDrawable(null)
              imagebutton8.setImageDrawable(null)
              imagebutton9.setImageDrawable(null)
              crossCount = 0
              zeroCount = 0
              scoreA.text = "Score A : $crossCount"
              scoreB.text = "Score B : $crossCount"

          }
         imagebutton1.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton1.setImageResource(R.drawable.cross)
                 b1 = 1
                 i++
             }
             else{
                 imagebutton1.setImageResource(R.drawable.circle)
                 b1 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton2.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton2.setImageResource(R.drawable.cross)
                 b2 = 1
                 i++
             }
             else{
                 imagebutton2.setImageResource(R.drawable.circle)
                 b2 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton3.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton3.setImageResource(R.drawable.cross)
                 b3 = 1
                 i++
             }
             else{
                 imagebutton3.setImageResource(R.drawable.circle)
                 b3 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton4.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton4.setImageResource(R.drawable.cross)
                 b4 = 1
                 i++
             }
             else{
                 imagebutton4.setImageResource(R.drawable.circle)
                 b4 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton5.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton5.setImageResource(R.drawable.cross)
                 b5 = 1
                 i++
             }
             else{
                 imagebutton5.setImageResource(R.drawable.circle)
                 b5 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton6.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton6.setImageResource(R.drawable.cross)
                 b6 = 1
                 i++
             }
             else{
                 imagebutton6.setImageResource(R.drawable.circle)
                 b6 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton7.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton7.setImageResource(R.drawable.cross)
                 b7 = 1
                 i++
             }
             else{
                 imagebutton7.setImageResource(R.drawable.circle)
                 b7 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton8.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton8.setImageResource(R.drawable.cross)
                 b8 = 1
                 i++
             }
             else{
                 imagebutton8.setImageResource(R.drawable.circle)
                 b8 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
        imagebutton9.setOnClickListener {
             if(startgame.equals("X")){
                 imagebutton9.setImageResource(R.drawable.cross)
                 b9 = 1
                 i++
             }
             else{
                 imagebutton9.setImageResource(R.drawable.circle)
                 b9 = 0
                 i++
             }
             choosePlayer()
             winningPlayer()
         }
    }
    fun  choosePlayer(){
        if(startgame.equals("X")){
            startgame = "0"
        }else{
            startgame = "X"
        }

    }

    fun winningPlayer(){

        if((b1 == 1) && (b2 == 1) && (b3 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }

             else if((b4 == 1) && (b5 == 1) && (b6 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
        else if((b7 == 1) && (b8 == 1) && (b9 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
        else if((b1 == 1) && (b4 == 1) && (b7 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
        else if((b2 == 1) && (b5 == 1) && (b8 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
        else if((b3 == 1) && (b6 == 1) && (b9 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
           else if((b1 == 1) && (b5 == 1) && (b9 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }
        else if((b3 == 1) && (b5 == 1) && (b7 == 1)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player A Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            crossCount++
            scoreA.text = "Score A : $crossCount"
            }

       else if((b1 == 0) && (b2 == 0) && (b3 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }

             else if((b4 == 0) && (b5 == 0) && (b6 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }
        else if((b7 == 0) && (b8 == 0) && (b9 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }
        else if((b1 == 0) && (b4 == 0) && (b7 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score  B : $zeroCount"
            }
        else if((b2 == 0) && (b5 == 0) && (b8 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }
        else if((b3 == 0) && (b6 == 0) && (b9 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $crossCount"
            }
           else if((b1 == 0) && (b5 == 0) && (b9 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }
        else if((b3 == 0) && (b5 == 0) && (b7 == 0)){
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder.setMessage("Player B Wins")
            builder.setPositiveButton("Ok"){dialog,which ->
                imagebutton1.setImageDrawable(null)
                imagebutton2.setImageDrawable(null)
                imagebutton3.setImageDrawable(null)
                imagebutton4.setImageDrawable(null)
                imagebutton5.setImageDrawable(null)
                imagebutton6.setImageDrawable(null)
                imagebutton7.setImageDrawable(null)
                imagebutton8.setImageDrawable(null)
                imagebutton9.setImageDrawable(null)
                resetValues()
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
            zeroCount++
            scoreB.text = "Score B : $zeroCount"
            }
           else{
               if(i==9){
                   val builder: AlertDialog.Builder = AlertDialog.Builder(this)

                   builder.setMessage("No One Wins")
                   builder.setPositiveButton("Ok"){dialog,which ->
                       imagebutton1.setImageDrawable(null)
                       imagebutton2.setImageDrawable(null)
                       imagebutton3.setImageDrawable(null)
                       imagebutton4.setImageDrawable(null)
                       imagebutton5.setImageDrawable(null)
                       imagebutton6.setImageDrawable(null)
                       imagebutton7.setImageDrawable(null)
                       imagebutton8.setImageDrawable(null)
                       imagebutton9.setImageDrawable(null)
                       resetValues()
                   }

                   val dialog: AlertDialog = builder.create()
                   dialog.show()

               }
        }

        }

       fun resetValues(){
            b1 = 5
            b2 = 5
            b3 = 5
            b4 = 5
            b5 = 5
            b6 = 5
            b7 = 5
            b8 = 5
            b9 = 5
           i=0
       }

    }

