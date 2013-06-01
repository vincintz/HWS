package com.samples.hws.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.samples.hws.core.Person;

@RunWith(JUnit4.class)
public class MockPersonRepositoryTest {
    private PersonRepository repo = new MockPersonRepository();

    @Test
    public void shouldStoreAndDelete() {
        final Person p1 = new Person(1, "Person1", "Test1");
        final Person p2 = new Person(2, "Person1", "Test1");
        assertTrue("Should start empty", repo.list().size() == 0);
        repo.store(p1);
        assertTrue("store *new* should add 1", repo.list().size() == 1);
        repo.store(p1);
        assertTrue("store *old* should *not* add", repo.list().size() == 1);
        repo.store(p2);
        assertTrue("store *new* should add 1", repo.list().size() == 2);
        repo.delete(1); repo.delete(2);
        assertTrue("Delete should remove", repo.list().size() == 0);
    }
}
