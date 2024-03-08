package com.example.a7minworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.flStart?.
        setOnClickListener {
val intent = Intent(this@MainActivity, ExerciseActivity::class.java)
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting ExerciseActivity: ${e.message}")
            }
           // startActivity(intent)
        }
    }
    override fun onDestroy(){
        super.onDestroy()

        binding = null
    }
}