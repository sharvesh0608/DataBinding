package com.example.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // val button: Button = findViewById<Button>(R.id.submit_button)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
        binding.nxtButton.setOnClickListener {
            pgrActivity()
        }
    }

    private fun displayGreeting() {
//        val messageView: TextView = findViewById<TextView>(R.id.greeting_text_view)
//        val nameText: EditText = findViewById<EditText>(R.id.name_edit_text)
//        messageView.text = "Hello! " + nameText.text

        binding.greetingTextView.text = "Hello!" + binding.nameEditText.text
    }

    private fun pgrActivity() {
        val intent = Intent(this, MainActivity2::class.java)
        // start your next activity
        startActivity(intent)

    }
}