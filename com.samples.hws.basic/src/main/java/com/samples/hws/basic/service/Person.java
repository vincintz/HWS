package com.samples.hws.basic.service;

public class Person {
    private String name;
    private String description;

    public Person(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
