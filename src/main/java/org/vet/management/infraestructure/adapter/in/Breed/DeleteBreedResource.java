package org.vet.management.infraestructure.adapter.in.Breed;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.applicataion.port.in.Breed.IDeleteBreed;
import org.vet.management.domain.service.BreedService;

public class DeleteBreedResource implements IDeleteBreed {
  @Inject
  BreedService breedService;
  @Override
  public Response deleteBreed(String idBreed) {
    return Response.ok(breedService.deleteBreed(idBreed)).build();
  }
}
