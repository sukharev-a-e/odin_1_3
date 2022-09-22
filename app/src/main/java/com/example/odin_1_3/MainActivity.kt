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

        for (item in 1..10) {
            myList.add(item)
        }

        fun outText (outList: List<Int>) {

            var myString: String = ""
            for (item in myList) {
                myString = myString + item + " "
            }

            val myText: TextView
            myText = findViewById(R.id.myText)

            myText.text = myString


        }

        outText(myList)

    }
}