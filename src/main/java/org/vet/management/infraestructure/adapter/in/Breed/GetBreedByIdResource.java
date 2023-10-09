package org.vet.management.infraestructure.adapter.in.Breed;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Breed.IGetBreedById;
import org.vet.management.domain.service.BreedService;

public class GetBreedByIdResource implements IGetBreedById {
  @Inject
  BreedService breedService;
  @Override
  public Response getBreedById(String idBreed) {
    return Response.ok(breedService.getBreedById(idBreed)).build();
  }
}
