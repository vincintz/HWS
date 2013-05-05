package com.samples.hws.basic.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Locale;

@Service("pingService")
@Path("/ping")
public class PingService {
    @GET
    @Produces("text/plain")
    public String ping() {
        return "pong";
    }
    @GET
    @Path("/{input}")
    @Produces("text/plain")
    public String echo(@PathParam("input") final String input) {
        return "pong - " + input;
    }
    @GET
    @Path("/time")
    @Produces("text/plain")
    public String getDateTime() {
        final DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
        return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
    }

}
