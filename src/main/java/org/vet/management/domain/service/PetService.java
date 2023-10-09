package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.applicataion.port.out.IPetRepository;
import org.vet.management.domain.model.Pet.Pet;

import java.util.List;
@ApplicationScoped
public class PetService {
  @Inject
  IPetRepository petRepository;
  public List<Pet> getAllBreed() {
    return petRepository.getAllPets();
  }

  public Pet getBreedById(String id) {
    return petRepository.getPetById(id);
  }

  public Pet createBreed(Pet pet) {
    return petRepository.createPet(pet);
  }

  public Pet updateBreed(String id, Pet pet) {
    return petRepository.updatePet(id, pet);
  }

  public Pet deleteBreed(String id) {
    return petRepository.deletePet(id);
  }
}
