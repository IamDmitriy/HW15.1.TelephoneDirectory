package com.company;

public class Contact {
    private String name;
    private String numberPhone;

    public Contact(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Телефон: " + numberPhone;
    }

    //TODO при необходимости переоределим hashCode, equals, toString

}
