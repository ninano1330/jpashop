package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    public Address(String ctiy, String street, String zipcode) {
        this.city = ctiy;
        this.street = street;
        this.zipcode = zipcode;
    }
}
