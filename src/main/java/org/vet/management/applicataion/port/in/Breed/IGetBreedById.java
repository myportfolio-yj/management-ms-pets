package org.vet.management.applicataion.port.in.Breed;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/breed")
public interface IGetBreedById {
  @GET
  @Path("/{idBreed}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getBreedById(@PathParam("idBreed") String idBreed);
}
