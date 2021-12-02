package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int=1
    private var mQuestionsList:ArrayList<Question>?=null
    private var mSelectedOptionPosition:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionsList=Constants.getQuestion()
        setQuestion()

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)

        submit_button.setOnClickListener(this)

    }
    private fun setQuestion()
    {
        val question=mQuestionsList!!.get(mCurrentPosition-1)

        defaultOptionsView()
if(mCurrentPosition==mQuestionsList!!.size){
    submit_button.text="FINISH"
}
        else{
            submit_button.text="SUBMIT"
        }
        progressBar.progress=mCurrentPosition
        progressText.text="$mCurrentPosition" + "/" + progressBar.max
        questionText.text=question!!.question
        image.setImageResource(question.image)
        option_one.text=question?.optionOne
        option_two.text=question?.optionTwo
        option_three.text=question?.optionThree
        option_four.text=question?.optionFour
    }
private fun defaultOptionsView(){
    val options=ArrayList<TextView>()

    options.add(0,option_one)
    options.add(1,option_two)
    options.add(2,option_three)
    options.add(3,option_four)

    for (option in options){
        option.setTextColor(Color.parseColor("#7A8089"))
        option.typeface= Typeface.DEFAULT
        option.background=ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
    }

}

    override fun onClick(v: View?) {
when(v?.id){
    R.id.option_one->{
        selectedOptionView(option_one,1)

    }

    R.id.option_two->{
        selectedOptionView(option_two,2)
    }

    R.id.option_three->{
        selectedOptionView(option_three,3)
    }

    R.id.option_four->{
        selectedOptionView(option_four,4)
    }
    R.id.submit_button->{
        if(mSelectedOptionPosition==0){
            mCurrentPosition++

            when{
                mCurrentPosition<=mQuestionsList!!.size->{
                    setQuestion()
                }
                else ->{
                    Toast.makeText(this,"You have successfully completed the Quiz",
                    Toast.LENGTH_SHORT).show()
                }
            }
        }
        else{
            val question=mQuestionsList?.get(mCurrentPosition-1)
            if(question!!.correctAnswer!=mSelectedOptionPosition){
                answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
            }

            answerView(question.correctAnswer,R.drawable.correct_option_border_bg)

            if(mCurrentPosition==mQuestionsList!!.size){
                submit_button.text="FINISH"
                val intent= Intent(this,Result::class.java)
                startActivity(intent)
                finish()
            }
            else{
                submit_button.text="GO TO NEXT QUESTION"
            }
            mSelectedOptionPosition=0

        }
    }

}
    }

    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                option_one.background=ContextCompat.getDrawable(this,drawableView)
            }
            2->{
                option_two.background=ContextCompat.getDrawable(this,drawableView)
            }
            3->{
                option_three.background=ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                option_four.background=ContextCompat.getDrawable(this,drawableView)
            }
        }
    }


    private fun selectedOptionView(tv:TextView,selectedOptionNumber:Int){
        defaultOptionsView()

        mSelectedOptionPosition=selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }

}