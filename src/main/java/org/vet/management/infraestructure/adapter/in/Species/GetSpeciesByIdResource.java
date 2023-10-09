package org.vet.management.infraestructure.adapter.in.Species;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Species.IGetSpeciesById;
import org.vet.management.domain.service.SpeciesService;

public class GetSpeciesByIdResource implements IGetSpeciesById {
  @Inject
  SpeciesService speciesService;
  @Override
  public Response getSpeciesById(String idSpecies) {
    return Response.ok(speciesService.getSpeciesById(idSpecies)).build();
  }
}
