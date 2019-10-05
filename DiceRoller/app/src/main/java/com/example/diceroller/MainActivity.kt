package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val CountUpButton: Button = findViewById(R.id.count_up_button)
        CountUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        // Toast.makeText(this, "button clicked",
        //    Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val current_result = resultText.text.toString()
        if (current_result.equals("Hello World!")) {
            resultText.text = "1"
            Toast.makeText(this, "No int value found, starting from 1",
                Toast.LENGTH_LONG).show()
        }
        else {
            val num_result = Integer.parseInt(current_result)
            if (num_result + 1 <= 6) {
                resultText.text = (num_result+1).toString()
            }
        }
    }
}
