package com.example.a7minworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import com.example.a7minworkout.databinding.ActivityExerciseBinding
import com.example.a7minworkout.databinding.ActivityMainBinding

class ExerciseActivity : AppCompatActivity() {

    private var binding: ActivityExerciseBinding? = null
    private var restTimer: CountDownTimer? = null
    private var restProgress = 0

    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

            setSupportActionBar(binding?.toolBarExercise)

//back btn
        if (supportActionBar!= null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolBarExercise?.setNavigationOnClickListener {
            onBackPressed()
        }
        setupRestView()
    }

    private fun setupRestView(){
        if (restTimer!=null){
            restTimer?.cancel()
            restProgress = 0

        }

        setRestProgressBar()
    }

    private fun setupExerciseView(){
        binding?.flProgressBar?.visibility = View.INVISIBLE 
        binding?.tvTitle?.text = "Exercise Name"
        binding?.flExercise?.visibility = View.VISIBLE
        if(exerciseTimer != null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        setExerciseProgressBar()
    }

    private fun setRestProgressBar() {
        restProgress = 0 // Reset progress to 0 before starting the timer
        binding?.progressBar?.progress = 0 // Set progress bar to 0 initially

        restTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                restProgress++
                binding?.progressBar?.progress = restProgress // Update progress bar with the current progress
                binding?.tvTimer?.text = (10 - restProgress).toString()
            }

            override fun onFinish() {
              setupExerciseView()
            }
        }.start()
    }

    private fun setExerciseProgressBar() {

        binding?.progressBarExercise?.progress = exerciseProgress

        exerciseTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                exerciseProgress++
                binding?.progressBarExercise?.progress = 30 - exerciseProgress // Update progress bar with the current progress
                binding?.tvTimerExercise?.text = (30 - exerciseProgress).toString()
            }

            override fun onFinish() {
                Toast.makeText(this@ExerciseActivity, "30 seconds are over, pull rest view", Toast.LENGTH_SHORT).show()
            }
        }.start()
    }


    override fun onDestroy() {
        super.onDestroy()

        if (restTimer!=null){
            restTimer?.cancel()
            restProgress = 0

        }

        if(exerciseTimer != null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }

        binding = null
    }
}