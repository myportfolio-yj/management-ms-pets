package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.applicataion.port.out.ISpeciesRepository;
import org.vet.management.domain.model.Species.Species;

import java.util.List;
@ApplicationScoped
public class SpeciesService {
  @Inject
  ISpeciesRepository speciesRepository;
  public List<Species> getAllSpecies() {
    return speciesRepository.getAllSpecies();
  }

  public Species getSpeciesById(String id) {
    return speciesRepository.getSpeciesById(id);
  }

  public Species createSpecies(Species species) {
    return speciesRepository.createSpecies(species);
  }

  public Species updateSpecies(String id, Species species) {
    return speciesRepository.updateSpecies(id, species);
  }

  public Species deleteSpecies(String id) {
    return speciesRepository.deleteSpecies(id);
  }
}
