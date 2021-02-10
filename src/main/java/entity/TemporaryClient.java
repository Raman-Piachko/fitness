package entity;

import enums.Sex;

import static enums.Discount.TEMPORARY;

public class TemporaryClient extends Client {
    public TemporaryClient(Sex sex, String name) {
        super(sex, name, TEMPORARY);
    }
}