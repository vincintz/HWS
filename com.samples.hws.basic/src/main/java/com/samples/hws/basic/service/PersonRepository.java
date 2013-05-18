package com.samples.hws.basic.service;

import java.util.List;

public interface PersonRepository {
    List<Person> list();
    Person get(long id);
    void store(Person person);
    void delete(long id);
}