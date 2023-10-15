package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val ques1 = Questions(
            1, "Which Countries Flag is this ?",
            R.drawable.china, "India", "America", "China", "Japan", 3
        )
        questionsList.add(ques1)

        val ques2 = Questions(
            2, "Which Countries Flag is this ?",
            R.drawable.australia, "Bangladesh", "Australia", "China", "Japan", 2
        )
        questionsList.add(ques2)

        val ques3 = Questions(
            3, "Which Countries Flag is this ?",
            R.drawable.india, "Ukrain", "America", "Pakistan", "India", 4
        )
        questionsList.add(ques3)

        val ques4 = Questions(
            4, "Which Countries Flag is this ?",
            R.drawable.italy, "Italy", "Australia", "China", "Japan", 1
        )
        questionsList.add(ques4)

        val ques5 = Questions(
            5, "Which Countries Flag is this ?",
            R.drawable.norway, "India", "America", "Norway", "Russia", 3
        )
        questionsList.add(ques5)

        val ques6 = Questions(
            6, "Which Countries Flag is this ?",
            R.drawable.russia, "South Africa", "Italy", "Russia", "India", 3
        )
        questionsList.add(ques6)

        val ques7 = Questions(
            7, "Which Countries Flag is this ?",
            R.drawable.south_africa, "India", "South Africa", "China", "Japan", 2
        )
        questionsList.add(ques7)

        val ques8 = Questions(
            8, "Which Countries Flag is this ?",
            R.drawable.ukrain, "Norway", "America", "Australia", "Ukrain", 4
        )
        questionsList.add(ques8)

        return questionsList
    }

}