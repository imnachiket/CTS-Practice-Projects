package org.constructorinjection;

public class Address {
    private int hno;
    private String street;
    private String city;

    public Address(int hno, String street, String city) {
        this.hno = hno;
        this.street = street;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
