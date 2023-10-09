package org.vet.management.applicataion.port.in.Breed;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.model.Pet.Pet;

@Path("/breed")
public interface ICreateBreed {
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response postBreed(Breed breed);
}
