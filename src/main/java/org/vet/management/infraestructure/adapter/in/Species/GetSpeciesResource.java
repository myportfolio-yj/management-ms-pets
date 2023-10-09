package org.vet.management.infraestructure.adapter.in.Species;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Species.IGetSpecies;
import org.vet.management.domain.service.SpeciesService;

public class GetSpeciesResource implements IGetSpecies {
  @Inject
  SpeciesService speciesService;
  @Override
  public Response getSpecies() {
    return Response.ok(speciesService.getAllSpecies()).build();
  }
}
