package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.applicataion.port.out.IBreedRepository;
import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.model.Breed.BreedEntity;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class BreedRepository implements PanacheMongoRepository<BreedEntity>, IBreedRepository {
  @Override
  public List<Breed> getAllBreeds() {
    return listAll().stream().map(p -> {
      Breed breed = new Breed();
      breed.setId(p.id.toString());
      breed.setDescription(p.description);
      return breed;
    }).toList();
  }

  @Override
  public Breed getBreedById(String id) {
    Optional<BreedEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Breed();
    }
    BreedEntity breedEntity = optional.get();
    Breed breed = new Breed();
    breed.setId(breedEntity.id.toString());
    breed.setDescription(breedEntity.description);
    return breed;
  }

  @Override
  public Breed createBreed(Breed breed) {
    BreedEntity breedEntity = new BreedEntity();
    breedEntity.setDescription(breed.getDescription());
    breedEntity.persist();
    Breed breed1 = new Breed();
    breed1.setId(breedEntity.getId().toString());
    breed1.setDescription(breedEntity.getDescription());
    return breed1;
  }

  @Override
  public Breed updateBreed(String id, Breed breed) {
    BreedEntity breedEntity = findById(new ObjectId(id));
    breedEntity.setDescription(breed.getDescription());
    update(breedEntity);
    Optional<BreedEntity> optional = findByIdOptional(new ObjectId(id));
    if (optional.isEmpty()){
      return new Breed();
    }
    BreedEntity breedEntity2 = optional.get();
    Breed breed1 = new Breed();
    breed1.setId(breedEntity2.getId().toString());
    breed1.setDescription(breedEntity2.getDescription());
    return breed1;
  }

  @Override
  public Breed deleteBreed(String id) {
    Optional<BreedEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Breed();
    }
    BreedEntity breedEntity = optional.get();
    delete(breedEntity);
    Breed breed = new Breed();
    breed.setId(breedEntity.id.toString());
    breed.setDescription(breedEntity.description);
    return breed;
  }
}
