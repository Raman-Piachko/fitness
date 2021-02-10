package entity;

import enums.Sex;

import static enums.Discount.CORPORATE;

public class CorporateClient extends Client {
    public CorporateClient(Sex sex, String name) {
        super(sex, name,CORPORATE);
    }
}