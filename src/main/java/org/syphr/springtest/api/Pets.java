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
import org.syphr.springtest.db.PetRepository;
import org.syphr.springtest.model.Pet;

@Component
@Path("/pets")
public class Pets
{
    @Autowired
    private PetRepository repository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Long post(Pet pet)
    {
        return repository.save(pet).getId();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") Long id)
    {
        Pet pet = repository.findOne(id);
        if (pet == null)
        {
            return Response.status(Status.NOT_FOUND).build();
        }

        return Response.ok(pet).build();
    }
}
