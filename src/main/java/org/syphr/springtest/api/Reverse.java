package org.syphr.springtest.api;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/reverse/{input}")
public class Reverse
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("input") @NotNull String input)
    {
        return "{ result: \"" + new StringBuilder(input).reverse().append("\" }").toString();
    }
}
