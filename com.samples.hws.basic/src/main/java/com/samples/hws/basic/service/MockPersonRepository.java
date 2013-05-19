package com.samples.hws.basic.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.samples.hws.common.Person;

@Component
public class MockPersonRepository implements PersonRepository {
    private List<Person> list = new ArrayList<Person>();

    public List<Person> list() {
        return list;
    }

    public Person get(final long id) {
        for (Person person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void store(final Person person) {
        delete(person.getId());
        list.add(person);
    }

    public void delete(final long id) {
        final Person person = get(id);
        list.remove(person);
    }

}
