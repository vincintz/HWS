package com.samples.hws.service;

import java.util.List;
import com.samples.hws.common.Person;

public interface PersonRepository {
    List<Person> list();
    Person get(long id);
    void store(Person person);
    void delete(long id);
}
