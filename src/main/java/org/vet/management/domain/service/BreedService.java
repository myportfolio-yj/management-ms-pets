package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.applicataion.port.out.IBreedRepository;
import org.vet.management.domain.model.Breed.Breed;

import java.util.List;
@ApplicationScoped
public class BreedService {
  @Inject
  IBreedRepository breedRepository;
  public List<Breed> getAllBreed() {
    return breedRepository.getAllBreeds();
  }

  public Breed getBreedById(String id) {
    return breedRepository.getBreedById(id);
  }

  public Breed createBreed(Breed breed) {
    return breedRepository.createBreed(breed);
  }

  public Breed updateBreed(String id, Breed breed) {
    return breedRepository.updateBreed(id, breed);
  }

  public Breed deleteBreed(String id) {
    return breedRepository.deleteBreed(id);
  }
}
