package org.vet.management.applicataion.port.in.Pet;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Pet.Pet;

@Path("/pet")
public interface IUpdatePet {
  @PUT
  @Path("/{idPet}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putPet(@PathParam("idPet") String idPet, Pet pet);
}
