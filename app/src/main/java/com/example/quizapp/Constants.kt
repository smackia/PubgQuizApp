package com.example.quizapp

object Constants {

    const val USER_NAME:String="USER_NAME"
    const val Total_Question:String="total_question"
    const val correct_answer:String="correct_answer"

    fun getQuestion():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
            val ques1=Question(1,
                "What is the strongest melee item you can wield in the game? ",
                R.drawable.question1_img,
            "Pan",
            "Crowbar",
            "Machete",
            "Sickle",
            1)
            questionsList.add(ques1)
        val ques2=Question(2,
            "What is the Playzone also referred to as in PUBG ",
            R.drawable.question2_img,
            "The fighting zone",
            "The Storm",
            "The Circle",
            "The Death Zone",
            3)
        questionsList.add(ques2)

        val ques3=Question(3,
            "On which map can you drive the Tukshai vehicle ",
            R.drawable.question3_img,
            "Miramar",
            "Erangel",
            "Sahnok",
            "Vikendi",
            3)
        questionsList.add(ques3)
        val ques4=Question(4,
            "What is the name of this gun ",
            R.drawable.question4_img,
            "Akm",
            "M416",
            "dp28",
            "Uzi",
            1)
        questionsList.add(ques4)

        val ques5=Question(5,
            "How many people can you fit in motorcycle with sidecar ",
            R.drawable.question5_img,
            "2",
            "3",
            "4",
            "5",
            2)
        questionsList.add(ques5)

        val ques6=Question(6,
            "What does this throwables call? ",
            R.drawable.question6_img,
            "Smoke Granade",
            "Frag Granade",
            "Stun Granade",
            "Decoy Granade",
            3)
        questionsList.add(ques6)

        val ques7=Question(7,
            "What has the highest boost duration time? ",
            R.drawable.question7_img,
            "Energy Drink",
            "Pain Killer",
            "MedKit",
            "Adrenaline Syringe",
            4)
        questionsList.add(ques7)

        val ques8=Question(8,
            "What does this muzzle called? ",
            R.drawable.question8_img,
            "Compensator",
            "Flash Hider",
            "Suppressor",
            "Duckbill",
            2)
        questionsList.add(ques8)

        val ques9=Question(9,
            "What is the correct name of this attachment? ",
            R.drawable.question9_img,
            "Thumb Grip",
            "Half Grip",
            "Angled Foregrip",
            "Light Grip",
            3)
        questionsList.add(ques9)

        val ques10=Question(10,
            "What is the name of this Vehicle? ",
            R.drawable.question10_img,
            "Boat",
            "PG-117",
            "Rony",
            "Aquarail",
            2)
        questionsList.add(ques10)


        return questionsList
    }
}