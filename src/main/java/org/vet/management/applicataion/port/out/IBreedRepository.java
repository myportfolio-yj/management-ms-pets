package org.vet.management.applicataion.port.out;

import org.vet.management.domain.model.Breed.Breed;

import java.util.List;

public interface IBreedRepository {
  List<Breed> getAllBreeds();
  Breed getBreedById(String id);
  Breed createBreed(Breed breed);
  Breed updateBreed(String id, Breed breed);
  Breed deleteBreed(String id);
}
