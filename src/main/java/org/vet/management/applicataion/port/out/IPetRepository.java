package org.vet.management.applicataion.port.out;

import org.vet.management.domain.model.Pet.Pet;

import java.util.List;

public interface IPetRepository {
  List<Pet> getAllPets();
  Pet getPetById(String id);
  Pet createPet(Pet pet);
  Pet updatePet(String id, Pet pet);
  Pet deletePet(String id);
}