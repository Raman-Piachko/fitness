package entity;

import enums.Equipment;
import enums.Exercise;
import enums.Food;
import enums.Sex;

import java.util.List;

import static enums.Equipment.*;
import static enums.Exercise.*;
import static enums.Food.*;
import static java.util.Arrays.asList;

public interface Coach {
    default Appointment makeAppointment(Customer customer) {
        if (customer.getOrder().getPaid()) {
            if (customer.getSex() == Sex.MAN) {
                return new Appointment(asList(PULL_UPS, PUSH_UPS, RUN), asList(BENCH, HORIZONTAL_BAR, TREADMILL),
                        asList(ENERGY_DRINK, PROTEIN_SHAKE));
            } else if (customer.getSex() == Sex.WOMEN) {
                return new Appointment(asList(SQUATS, JUMPING, LUNGES), asList(FITNESS_MAT, DUMBBELLS),
                        asList(BCAA, FAT_BURNER));
            }
        }
        return null;
    }

    Appointment makeAppointment(Customer customer, List<Exercise> exercises, List<Equipment> equipments, Food... food);
}