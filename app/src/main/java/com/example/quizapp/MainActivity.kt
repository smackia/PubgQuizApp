package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        StartButton.setOnClickListener {
            Log.d("Click","Button is Clicked")
            if(PlayerName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent=Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}