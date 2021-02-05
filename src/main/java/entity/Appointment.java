package entity;

import enums.Equipment;
import enums.Exercise;
import enums.Food;

import java.util.List;

public class Appointment {
    private List<Exercise> exercises;
    private List<Equipment> equipments;
    private List<Food> food;

    public Appointment(List<Exercise> exercises, List<Equipment> equipments, List<Food> food) {
        this.exercises = exercises;
        this.equipments = equipments;
        this.food = food;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }
}