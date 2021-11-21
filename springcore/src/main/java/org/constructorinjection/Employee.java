package org.constructorinjection;

public class Employee {
    private int id;
    private Address address;

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }
}
