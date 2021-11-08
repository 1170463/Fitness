package com.example.assigment1.Model;

public class ExercisesFactory {

    public IExercisesDa getModel(){
        return (IExercisesDa) new ExercisesDa();
    }
}
