package com.example.assigment1.Model;


public class typeExercises {
    private int id;
    private int period;
    private String name;
    private String result;

    public typeExercises(int id, int period, String name, String result) {
        this.id = id;
        this.period = period;
        this.name = name;
        this.result = result;
    }
    public static final typeExercises[] Items =
            {new typeExercises(0, 20, "squats", "strength"),
                    new typeExercises(1, 17, "Push ups", "building body")
            ,(new typeExercises(1, 60, "Swimming", "building body"))};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return name;
    }
}
