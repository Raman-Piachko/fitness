package entity.impl;

import entity.Appointment;
import entity.Coach;
import entity.Customer;
import enums.Equipment;
import enums.Exercise;
import enums.Food;

import java.util.List;

import static java.util.Arrays.asList;

public class PersonalCoachImpl implements Coach {
    @Override
    public Appointment makeAppointment(Customer customer, List<Exercise> exercises, List<Equipment> equipments, Food... food) {
        if (customer.getOrder().getPaid()) {
            return new Appointment(exercises, equipments, asList(food));
        }
        return null;
    }
}