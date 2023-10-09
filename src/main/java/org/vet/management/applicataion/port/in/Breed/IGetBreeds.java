package org.vet.management.applicataion.port.in.Breed;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/breed")
public interface IGetBreeds {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getBreeds();
}
