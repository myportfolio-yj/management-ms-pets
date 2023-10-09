package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.applicataion.port.out.ISpeciesRepository;
import org.vet.management.domain.model.Species.Species;
import org.vet.management.domain.model.Species.SpeciesEntity;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class SpeciesRepository implements PanacheMongoRepository<SpeciesEntity>, ISpeciesRepository {
  @Override
  public List<Species> getAllSpecies() {
    return listAll().stream().map(p -> {
      Species species = new Species();
      species.setId(p.id.toString());
      species.setDescription(p.description);
      return species;
    }).toList();
  }

  @Override
  public Species getSpeciesById(String id) {
    Optional<SpeciesEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Species();
    }
    SpeciesEntity speciesEntity = optional.get();
    Species species = new Species();
    species.setId(speciesEntity.id.toString());
    species.setDescription(speciesEntity.description);
    return species;
  }

  @Override
  public Species createSpecies(Species species) {
    SpeciesEntity speciesEntity = new SpeciesEntity();
    speciesEntity.setDescription(species.getDescription());
    speciesEntity.persist();
    Species species1 = new Species();
    species1.setId(speciesEntity.getId().toString());
    species1.setDescription(speciesEntity.getDescription());
    return species1;
  }

  @Override
  public Species updateSpecies(String id, Species species) {
    SpeciesEntity speciesEntity = findById(new ObjectId(id));
    speciesEntity.setDescription(species.getDescription());
    update(speciesEntity);
    Optional<SpeciesEntity> optional = findByIdOptional(new ObjectId(id));
    if (optional.isEmpty()){
      return new Species();
    }
    SpeciesEntity speciesEntity1 = optional.get();
    Species species1 = new Species();
    species1.setId(speciesEntity1.getId().toString());
    species1.setDescription(speciesEntity1.getDescription());
    return species1;
  }

  @Override
  public Species deleteSpecies(String id) {
    Optional<SpeciesEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()){
      return new Species();
    }
    SpeciesEntity speciesEntity = optional.get();
    delete(speciesEntity);
    Species species = new Species();
    species.setId(speciesEntity.id.toString());
    species.setDescription(speciesEntity.description);
    return species;
  }
}
