package org.vet.management.infraestructure.adapter.in.Breed;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Breed.IUpdateBreed;
import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.service.BreedService;

public class UpdateBreedResource implements IUpdateBreed {
  @Inject
  BreedService breedService;
  @Override
  public Response putBreed(String idBreed, Breed breed) {
    return Response.ok(breedService.updateBreed(idBreed, breed)).build();
  }
}
