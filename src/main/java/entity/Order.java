package entity;

public class Order {
    private static Integer workoutPrice = 5;
    private Integer numberOfWorkouts;
    private Double totalPrice;
    private Boolean isPaid = false;

    public Order(Customer customer, Integer numberOfWorkouts) {
        if (customer.isRegularCustomer()) {
            this.numberOfWorkouts = numberOfWorkouts;
            this.totalPrice = numberOfWorkouts * workoutPrice * 0.95;
        } else {
            this.numberOfWorkouts = numberOfWorkouts;
            this.totalPrice = (double) (numberOfWorkouts * workoutPrice);
        }
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
}