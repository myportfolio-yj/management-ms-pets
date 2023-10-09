package org.vet.management.infraestructure.adapter.in.Breed;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Breed.ICreateBreed;
import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.service.BreedService;

public class CreateBreedResource implements ICreateBreed {
  @Inject
  BreedService breedService;
  @Override
  public Response postBreed(Breed breed) {
    return Response.ok(breedService.createBreed(breed)).build();
  }
}
