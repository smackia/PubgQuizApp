package com.example.quizapp

object Constants {
    fun getQuestion():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
            val ques1=Question(1,
                "What country does this flag belong ",
                R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)
            questionsList.add(ques1)
        val ques2=Question(2,
            "What country does this flag belong ",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2)
        questionsList.add(ques2)

        val ques3=Question(3,
            "What country does this flag belong ",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "Australia",
            "Armenia",
            "India",
            4)
        questionsList.add(ques3)
        val ques4=Question(4,
            "What is the name of this gun ",
            R.drawable.akm,
            "Akm",
            "M416",
            "dp28",
            "Uzi",
            1)
        questionsList.add(ques4)
        return questionsList
    }
}