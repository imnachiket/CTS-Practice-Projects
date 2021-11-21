package org.spring.xmlcongif;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void hi() {
        System.out.println("Hi patient");
    }

    public void bye() {
        System.out.println("Bye patient");
    }
}
