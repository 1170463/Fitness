package com.example.assigment1.Model;


import java.util.ArrayList;
import java.util.List;

class ExercisesDa implements IExercisesDa {

    private ArrayList<typeExercises> exercise = new ArrayList<>();

    public ExercisesDa() {
        exercise.add(new typeExercises(0, 20, "squats", "strength"));
        exercise.add(new typeExercises(1, 17, "Push ups", "building body"));
        exercise.add(new typeExercises(1, 60, "Swimming", "building body"));


    }
    @Override
    public List<typeExercises> getExercises(String data) {

        ArrayList<typeExercises> list = new ArrayList<>();
        for(typeExercises m : exercise){
            if(m.getName().equals(data)){
                list.add(m);
            }
        }
        return list;
    }



}

