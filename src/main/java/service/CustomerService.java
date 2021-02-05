package service;

import entity.Customer;
import enums.Equipment;
import enums.Exercise;
import enums.Food;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static util.InputUtils.inputStringValue;


public class CustomerService {
    public static final Logger LOGGER = LogManager.getLogger(CustomerService.class);
    public static final String DOING = "Exercise is in progress!!!";
    public static final String FEEDBACK = "Exercises completed, set feedback.\n";

    public void changeAppointmentByDeletingNegativeExercise(Customer customer, Exercise negativeExercise) {
        customer.getAppointment().getExercises().remove(negativeExercise);
    }

    public void changeAppointmentByDeletingNegativeFood(Customer customer, Food negativeFood) {
        customer.getAppointment().getFood().remove(negativeFood);
    }

    public void changeAppointmentByDeletingNegativeEquipment(Customer customer, Equipment negativeEquipment) {
        customer.getAppointment().getEquipments().remove(negativeEquipment);
    }

    public void changeAppointmentByEquipment(Customer customer, Equipment oldEquipment, Equipment newEquipment) {
        customer.getAppointment().getEquipments().remove(oldEquipment);
        customer.getAppointment().getEquipments().add(newEquipment);
    }

    public void doExercise(Customer customer) {
        Integer count = customer.getOrder().getNumberOfWorkouts();
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