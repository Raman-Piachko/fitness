package entity;

import enums.Equipment;
import enums.Exercise;
import enums.Food;

import java.util.List;

import static enums.Equipment.BENCH;
import static enums.Equipment.DUMBBELLS;
import static enums.Equipment.FITNESS_MAT;
import static enums.Equipment.HORIZONTAL_BAR;
import static enums.Equipment.TREADMILL;
import static enums.Exercise.JUMPING;
import static enums.Exercise.LUNGES;
import static enums.Exercise.PULL_UPS;
import static enums.Exercise.PUSH_UPS;
import static enums.Exercise.RUN;
import static enums.Exercise.SQUATS;
import static enums.Food.BCAA;
import static enums.Food.ENERGY_DRINK;
import static enums.Food.FAT_BURNER;
import static enums.Food.PROTEIN_SHAKE;
import static enums.Sex.MAN;
import static enums.Sex.WOMEN;
import static java.util.Arrays.asList;


public interface Coach {
    default Appointment makeAppointment(Client client) {
        if (client.getOrder().getPaid()) {
            if (client.getSex() == MAN) {
                return new Appointment(asList(PULL_UPS, PUSH_UPS, RUN), asList(BENCH, HORIZONTAL_BAR, TREADMILL),
                        asList(ENERGY_DRINK, PROTEIN_SHAKE));
            } else if (client.getSex() == WOMEN) {
                return new Appointment(asList(SQUATS, JUMPING, LUNGES), asList(FITNESS_MAT, DUMBBELLS),
                        asList(BCAA, FAT_BURNER));
            }
        }
        return null;
    }

    Appointment makeAppointment(Client client, List<Exercise> exercises, List<Equipment> equipments, List<Food> food);
}