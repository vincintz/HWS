package com.samples.hws.basic.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Locale;

@Service("timeService")
@Path("/time")
public class TimeService {
    @GET
    @Produces("text/plain")
    public String getDateTime() {
        final DateFormatter formatter = new DateFormatter("dd/MM/yyyy hh:mm:ss");
        return formatter.print(Calendar.getInstance().getTime(), Locale.getDefault());
    }

}
