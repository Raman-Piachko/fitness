package entity;

import enums.Discount;
import enums.Sex;

public abstract class Client {
    private Sex sex;
    private String name;
    private Discount discount;
    private Order order;
    private Appointment appointment;

    public Client(Sex sex, String name, Discount discount) {
        this.sex = sex;
        this.name = name;
        this.discount = discount;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void makeOrder(Integer numberOfWorkouts, Coach coach) {
        order = new Order(this, numberOfWorkouts, coach);
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void pay(boolean isPaid) {
        this.order.setPaid(isPaid);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}