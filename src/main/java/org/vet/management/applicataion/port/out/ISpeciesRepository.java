package org.vet.management.applicataion.port.out;

import org.vet.management.domain.model.Breed.Breed;
import org.vet.management.domain.model.Species.Species;

import java.util.List;

public interface ISpeciesRepository {
  List<Species> getAllSpecies();
  Species getSpeciesById(String id);
  Species createSpecies(Species species);
  Species updateSpecies(String id, Species species);
  Species deleteSpecies(String id);
}
