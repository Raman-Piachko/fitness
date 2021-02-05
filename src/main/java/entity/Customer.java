package entity;

import enums.Sex;

public class Customer {
    private Sex sex;
    private String name;
    private boolean isRegularCustomer;
    private Order order;
    private Coach coach;
    private Appointment appointment;

    public Customer(Sex sex, String name, Boolean isRegularCustomer) {
        this.sex = sex;
        this.name = name;
        this.isRegularCustomer = isRegularCustomer;
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

    public Boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    public void setRegularCustomer(Boolean regularCustomer) {
        isRegularCustomer = regularCustomer;
    }

    public Order getOrder() {
        return order;
    }

    public void makeOrder(Integer numberOfWorkouts) {
        order = new Order(this, numberOfWorkouts);
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
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
}