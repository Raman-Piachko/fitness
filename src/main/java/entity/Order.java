package entity;

import enums.Discount;

import java.util.Optional;

public class Order {
    private static final Integer WORKOUT_PRICE = 5;
    private Integer numberOfWorkouts;
    private Double totalPrice;
    private Coach coach;
    private Boolean isPaid = false;

    public Order(Client client, Integer numberOfWorkouts, Coach coach) {
        this.numberOfWorkouts = numberOfWorkouts;
        this.totalPrice = calculateTotalPrice(client, numberOfWorkouts);
        this.coach = coach;
    }

    private double calculateTotalPrice(Client client, Integer numberOfWorkouts) {
        return numberOfWorkouts * WORKOUT_PRICE * getDiscountValue(client);
    }

    private double getDiscountValue(Client client) {
        return Optional.ofNullable(client)
                .map(Client::getDiscount)
                .map(Discount::getValue)
                .orElseThrow(RuntimeException::new);
    }

    public Integer getNumberOfWorkouts() {
        return numberOfWorkouts;
    }

    public void setNumberOfWorkouts(Integer numberOfWorkouts) {
        this.numberOfWorkouts = numberOfWorkouts;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}