package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username=intent.getStringExtra(Constants.USER_NAME)
        val totalquestions=intent.getIntExtra(Constants.Total_Question,0)
        val correctanswer=intent.getIntExtra(Constants.correct_answer,0)

        result_username.text=username.toString()
        result_score.text="Your score is $correctanswer out of $totalquestions"

        finish_btn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}