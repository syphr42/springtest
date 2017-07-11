package org.syphr.springtest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.syphr.springtest.db.ColorRepository;
import org.syphr.springtest.model.Color;
import org.syphr.springtest.model.ColorDTO;

@Component
@Path("/colors")
public class Colors
{
    @Autowired
    private ColorRepository repository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String post(Color color)
    {
        return repository.insert(new ColorDTO(color)).getId();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") String id)
    {
        ColorDTO favColor = repository.findOne(id);
        if (favColor == null)
        {
            return Response.status(Status.NOT_FOUND).build();
        }

        return Response.ok(favColor.getColor()).build();
    }
}
