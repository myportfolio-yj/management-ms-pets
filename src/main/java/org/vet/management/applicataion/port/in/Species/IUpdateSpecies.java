package org.vet.management.applicataion.port.in.Species;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Species.Species;

@Path("/species")
public interface IUpdateSpecies {
  @PUT
  @Path("/{idSpecies}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putBreed(@PathParam("idSpecies") String idSpecies, Species species);
}
