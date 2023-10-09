package org.vet.management.infraestructure.adapter.in.Species;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Species.ICreateSpecies;
import org.vet.management.domain.model.Species.Species;
import org.vet.management.domain.service.BreedService;
import org.vet.management.domain.service.SpeciesService;

public class CreateSpeciesResource implements ICreateSpecies {
  @Inject
  SpeciesService speciesService;
  @Override
  public Response postSpecies(Species species) {
    return Response.ok(speciesService.createSpecies(species)).build();
  }
}
