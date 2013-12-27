package org.ahedstrom.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Resource {

    @Path("ping")
    @GET
    public String ping() {
        return "pong";
    }
}
