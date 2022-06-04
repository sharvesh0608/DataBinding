package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        binding.progBtn.setOnClickListener {
            progAction()
        }
    }

    private fun progAction() {
        binding.apply {
            if (progBar.visibility == View.GONE) {
                progBar.visibility = View.VISIBLE
                progBtn.text = "Stop"
            } else {
                progBar.visibility = View.GONE
                progBtn.text = "Start"
            }
        }


    }
}