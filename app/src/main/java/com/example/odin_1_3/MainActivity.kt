package com.example.odin_1_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myEmptyList = emptyList<Int>()
        val myList = myEmptyList.toMutableList()

        for (i in 1..10) {
            myList.add(i)
        }

        fun outText (outList: List<Int>) {

            var myString: String = ""
            for (j in 0..9) {
                myString = myString + outList[j] + " "
            }

            val myText: TextView
            myText = findViewById(R.id.myText)

            myText.text = myString


        }

        outText(myList)

    }
}