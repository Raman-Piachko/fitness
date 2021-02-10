package entity.impl;

import entity.Appointment;
import entity.Coach;
import entity.Client;
import enums.Equipment;
import enums.Exercise;
import enums.Food;

import java.util.List;

public class PersonalCoach implements Coach {
    @Override
    public Appointment makeAppointment(Client client, List<Exercise> exercises, List<Equipment> equipments, List<Food> food) {
        if (client.getOrder().getPaid()) {
            return new Appointment(exercises, equipments, food);
        }
        return null;
    }
}