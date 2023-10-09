package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.applicataion.port.out.IPetRepository;
import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.model.Breed.BreedEntity;
import org.vet.management.domain.model.Pet.Pet;
import org.vet.management.domain.model.Pet.PetEntity;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class PetRepository implements PanacheMongoRepository<PetEntity>, IPetRepository {
  @Override
  public List<Pet> getAllPets() {
    return listAll().stream().map(p -> {
      Pet pet = new Pet();
      pet.setId(p.id.toString());
      pet.setCode(p.code);
      pet.setName(p.name);
      pet.setLastName(p.lastName);
      pet.setBirthdayDate(p.birthdayDate);
      pet.setGender(p.gender);
      pet.setIdSpecies(p.idSpecies);
      pet.setIdBreed(p.idBreed);
      pet.setIdOwner(p.idOwner);
      return pet;
    }).toList();
  }

  @Override
  public Pet getPetById(String id) {
    Optional<PetEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Pet();
    }
    PetEntity petEntity = optional.get();
    Pet pet = new Pet();
    pet.setId(petEntity.id.toString());
    pet.setCode(petEntity.code);
    pet.setName(petEntity.name);
    pet.setLastName(petEntity.lastName);
    pet.setBirthdayDate(petEntity.birthdayDate);
    pet.setGender(petEntity.gender);
    pet.setIdSpecies(petEntity.idSpecies);
    pet.setIdBreed(petEntity.idBreed);
    pet.setIdOwner(petEntity.idOwner);
    return pet;
  }

  @Override
  public Pet createPet(Pet pet) {
    PetEntity petEntity = new PetEntity();
    petEntity.setCode(pet.code);
    petEntity.setName(pet.name);
    petEntity.setLastName(pet.lastName);
    petEntity.setBirthdayDate(pet.birthdayDate);
    petEntity.setGender(pet.gender);
    petEntity.setIdSpecies(pet.idSpecies);
    petEntity.setIdBreed(pet.idBreed);
    petEntity.setIdOwner(pet.idOwner);
    petEntity.persist();
    Pet pet1 = new Pet();
    pet1.setId(petEntity.id.toString());
    pet1.setCode(petEntity.code);
    pet1.setName(petEntity.name);
    pet1.setLastName(petEntity.lastName);
    pet1.setBirthdayDate(petEntity.birthdayDate);
    pet1.setGender(petEntity.gender);
    pet1.setIdSpecies(petEntity.idSpecies);
    pet1.setIdBreed(petEntity.idBreed);
    pet1.setIdOwner(petEntity.idOwner);
    return pet1;
  }

  @Override
  public Pet updatePet(String id, Pet pet) {
    PetEntity petEntity = findById(new ObjectId(id));
    petEntity.setCode(pet.code);
    petEntity.setName(pet.name);
    petEntity.setLastName(pet.lastName);
    petEntity.setBirthdayDate(pet.birthdayDate);
    petEntity.setGender(pet.gender);
    petEntity.setIdSpecies(pet.idSpecies);
    petEntity.setIdBreed(pet.idBreed);
    petEntity.setIdOwner(pet.idOwner);
    update(petEntity);
    Optional<PetEntity> optional = findByIdOptional(new ObjectId(id));
    if (optional.isEmpty()){
      return new Pet();
    }
    PetEntity petEntity1 = optional.get();
    Pet pet1 = new Pet();
    pet1.setId(petEntity1.id.toString());
    pet1.setCode(petEntity1.code);
    pet1.setName(petEntity1.name);
    pet1.setLastName(petEntity1.lastName);
    pet1.setBirthdayDate(petEntity1.birthdayDate);
    pet1.setGender(petEntity1.gender);
    pet1.setIdSpecies(petEntity1.idSpecies);
    pet1.setIdBreed(petEntity1.idBreed);
    pet1.setIdOwner(petEntity1.idOwner);
    return pet1;
  }

  @Override
  public Pet deletePet(String id) {
    Optional<PetEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Pet();
    }
    PetEntity petEntity = optional.get();
    delete(petEntity);
    Pet pet = new Pet();
    pet.setId(petEntity.id.toString());
    pet.setCode(petEntity.code);
    pet.setName(petEntity.name);
    pet.setLastName(petEntity.lastName);
    pet.setBirthdayDate(petEntity.birthdayDate);
    pet.setGender(petEntity.gender);
    pet.setIdSpecies(petEntity.idSpecies);
    pet.setIdBreed(petEntity.idBreed);
    pet.setIdOwner(petEntity.idOwner);
    return pet;
  }
}
