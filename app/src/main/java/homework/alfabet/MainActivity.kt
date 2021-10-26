package homework.alfabet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val helloTextView: TextView = findViewById(R.id.abc_cgar)
        helloTextView.textSize = 30f

        val Button: Button = findViewById(R.id.button)

        var abc = arrayOfNulls<String>(26)// объявили массив

        var value = 0

        for (i in 0..25) {        // наполняем массив буквами алфавита


            var ascii = value + 65
            var char = ascii.toChar()
            abc[value] = char.toString()
            value++
        }

        Button.setOnClickListener {
            helloTextView.text = abc[0].toString()
        }

     //   val list = listOf(abc).toList()
        var value1 = 0
        var abchalf = arrayOfNulls<String>(26)// объявили массив
        var value2 = 0

      //  while ( value1 =26){
        Button.setOnClickListener {

            if (value1 % 2 == 0) {
                value1++
            } else {
                abchalf[value2] = abc[value1]

                helloTextView.text = abchalf[value2].toString()
                value1++
                value2++
       //     }




        }

                }



                }

        }
      //  Button.setOnClickListener {
         //   abchalf[1].toString()}






/*
        var abchalf = arrayOfNulls<String>(26)// объявили массив

        var value1 = 0
        for (k in 1..26) {
            if (value1 % 2 == 0) {
                var ascii1 = value1 + 65
              var char1 = ascii1.toChar()
              abchalf[value] = char.toString()

            }
            value1++
        }*/



 //   val printstring = abchalf.toString()

      //  val helloTextView1: TextView = findViewById(R.id. abcstring)
      //  helloTextView1.textSize = 30f
     //   helloTextView1.text = printstring







