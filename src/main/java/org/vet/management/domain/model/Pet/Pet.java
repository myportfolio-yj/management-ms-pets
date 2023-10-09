package org.vet.management.domain.model.Pet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pet {
  public String id;
  public String code;
  public String name;
  public String lastName;
  public String birthdayDate;
  public String gender;
  public String idSpecies;
  public String idBreed;
  public String idOwner;
}
