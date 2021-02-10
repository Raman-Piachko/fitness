package service;

import entity.Appointment;
import entity.Client;
import entity.Order;
import enums.Equipment;
import enums.Exercise;
import enums.Food;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

import static util.InputUtils.inputStringValue;

public class CustomerService {
    public static final Logger LOGGER = LogManager.getLogger(CustomerService.class);
    public static final String DOING = "Exercise is in progress!!!";
    public static final String FEEDBACK = "Exercises completed, set feedback.\n";

    public void changeAppointmentByDeletingNegativeExercise(Client client, Exercise negativeExercise) {
        Optional.ofNullable(client)
                .map(Client::getAppointment)
                .map(Appointment::getExercises)
                .map(exercise -> exercise.remove(negativeExercise))
                .orElseThrow(RuntimeException::new);
    }

    public void changeAppointmentByDeletingNegativeFood(Client client, Food negativeFood) {
        Optional.ofNullable(client)
                .map(Client::getAppointment)
                .map(Appointment::getFood)
                .map(food -> food.remove(negativeFood))
                .orElseThrow(RuntimeException::new);
    }

    public void changeAppointmentByEquipment(Client client, Equipment oldEquipment, Equipment newEquipment) {
        removeEquipment(client, oldEquipment);
        Optional.ofNullable(client)
                .map(Client::getAppointment)
                .map(Appointment::getEquipments)
                .map(equipment -> equipment.add(newEquipment))
                .orElseThrow(RuntimeException::new);
    }

    public void removeEquipment(Client client, Equipment oldEquipment) {
        Optional.ofNullable(client)
                .map(Client::getAppointment)
                .map(Appointment::getEquipments)
                .map(equipment -> equipment.remove(oldEquipment)).orElseThrow(RuntimeException::new);
    }

    public void doExercise(Client client) {
        Integer count = Optional.ofNullable(client)
                .map(Client::getOrder)
                .map(Order::getNumberOfWorkouts)
                .orElseThrow(RuntimeException::new);
        while (count > 0) {
            count--;
            LOGGER.info(DOING);
        }
        leaveFeedback(inputStringValue(FEEDBACK));
    }

    private void leaveFeedback(String feedback) {
        LOGGER.info(feedback);
    }
}