package com.example.a7minworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false,)
        exerciseList.add(jumpingJacks)

        val abdominalCrunch = ExerciseModel(
            2,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false,)
        exerciseList.add(abdominalCrunch)

        val highKnees = ExerciseModel(
            3,
            "High Knee Running",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false,)
        exerciseList.add(highKnees)

        val Lunge = ExerciseModel(
            4,
            "Lunge",
            R.drawable.ic_lunge,
            false,
            false,)
        exerciseList.add(Lunge)

        val plank = ExerciseModel(
            5,
            "Plank",
            R.drawable.ic_plank,
            false,
            false,)
        exerciseList.add(plank)

        val pushUp = ExerciseModel(
            6,
            "Push Up",
            R.drawable.ic_push_up,
            false,
            false,)
        exerciseList.add(pushUp)

        val pushUpRotate = ExerciseModel(
            7,
            "Push Up And Rotation",
            R.drawable.ic_push_up_and_rotation,
            false,
            false,)
        exerciseList.add(pushUpRotate)

        val sidePlank = ExerciseModel(
            8,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false,)
        exerciseList.add(sidePlank)

        val squat = ExerciseModel(
            9,
            "Squat",
            R.drawable.ic_squat,
            false,
            false,)
        exerciseList.add(squat)

        val tricepsDip = ExerciseModel(
            10,
            "Triceps Dips on Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false,)
        exerciseList.add(tricepsDip)

        val wallSit = ExerciseModel(
            11,
            "Wall Sits",
            R.drawable.ic_wall_sit,
            false,
            false,)
        exerciseList.add(wallSit)

        return exerciseList
    }
}