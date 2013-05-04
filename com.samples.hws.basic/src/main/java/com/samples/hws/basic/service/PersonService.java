package com.samples.hws.basic.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Service;

@Service("personService")
@Path("/person")
public class PersonService {
    @GET
    @Produces("application/json")
    public Person getPerson() {
        return new Person("Theo", "Reyes");
    }
}
