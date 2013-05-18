package com.samples.hws.basic.service;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.samples.hws.common.Person;
import com.samples.hws.common.PersonRepository;

@Service("personService")
@Path("/person")
public class PersonService {
    @Autowired
    private PersonRepository repo;

    @PostConstruct
    public void postConstruct() {
        repo.store(new Person(1, "Rogers", "Rogers Catalyst"));
        repo.store(new Person(2, "TDC", "CPS Pay"));
    }

    @GET
    @Produces("application/json")
    public List<Person> list() {
        return repo.list();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Person get(@PathParam("id") final long id) {
        final Person person = repo.get(id);
        if (person == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return person;
    }

    @POST
    @Path("/{name}/{description}")
    @Produces("text/plain")
    public String save(@PathParam("name") final String name,
                       @PathParam("description") final String description) {
        return "ok";
    }

    
}
