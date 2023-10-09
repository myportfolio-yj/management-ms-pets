package org.vet.management.applicataion.port.in.Pet;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pet")
public interface IGetPets {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getPets();
}
