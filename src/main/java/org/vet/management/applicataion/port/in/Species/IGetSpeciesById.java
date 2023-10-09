package org.vet.management.applicataion.port.in.Species;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/species")
public interface IGetSpeciesById {
  @GET
  @Path("/{idSpecies}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getSpeciesById(@PathParam("idSpecies") String idSpecies);
}
