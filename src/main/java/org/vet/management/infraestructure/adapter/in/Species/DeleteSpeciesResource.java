package org.vet.management.infraestructure.adapter.in.Species;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Species.IDeleteSpecies;
import org.vet.management.domain.service.SpeciesService;

public class DeleteSpeciesResource implements IDeleteSpecies {
  @Inject
  SpeciesService speciesService;
  @Override
  public Response deleteSpecies(String idSpecies) {
    return Response.ok(speciesService.deleteSpecies(idSpecies)).build();
  }
}
