package entity;

import enums.Sex;

import static enums.Discount.REGULAR;

public class RegularClient extends Client {

    public RegularClient(Sex sex, String name) {
        super(sex, name, REGULAR);
    }
}