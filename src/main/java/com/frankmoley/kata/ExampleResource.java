package com.frankmoley.kata;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.frankmoley.kata.load.Counter;

@Path("/example")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        new Counter().count("Four Score and Seven Years Ago");
        return "Completed";
    }
}