package com.example.lab2test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.lab2test.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        log("onCreate")
        binding.buttonAbout.setOnClickListener { view ->
            startActivity(Intent(this, About::class.java))
        }
        binding.buttonSettings.setOnClickListener { view ->
            startActivity(Intent(this, Settings::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }

    private fun log(message: String) {
        Log.d(tag, message)
    }
}