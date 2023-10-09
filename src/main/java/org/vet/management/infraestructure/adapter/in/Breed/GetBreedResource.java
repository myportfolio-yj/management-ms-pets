package org.vet.management.infraestructure.adapter.in.Breed;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Breed.IGetBreeds;
import org.vet.management.domain.service.BreedService;

public class GetBreedResource implements IGetBreeds {
  @Inject
  BreedService breedService;
  @Override
  public Response getBreeds() {
    return Response.ok(breedService.getAllBreed()).build();
  }
}
