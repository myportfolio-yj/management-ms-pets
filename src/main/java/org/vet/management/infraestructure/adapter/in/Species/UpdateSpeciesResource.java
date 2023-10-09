package org.vet.management.infraestructure.adapter.in.Species;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Species.IUpdateSpecies;
import org.vet.management.domain.model.Species.Species;
import org.vet.management.domain.service.SpeciesService;

public class UpdateSpeciesResource implements IUpdateSpecies {
  @Inject
  SpeciesService speciesService;
  @Override
  public Response putBreed(String idSpecies, Species species) {
    return Response.ok(speciesService.updateSpecies(idSpecies, species)).build();
  }
}
