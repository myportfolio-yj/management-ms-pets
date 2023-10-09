package org.vet.management.domain.model.Pet;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;
@MongoEntity(collection="collect-pets")
public class PetEntity extends PanacheMongoEntity {
  public ObjectId id;
  public String code;
  public String name;
  public String lastName;
  public String birthdayDate;
  public String gender;
  public String idSpecies;
  public String idBreed;
  public String idOwner;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthdayDate() {
    return birthdayDate;
  }

  public void setBirthdayDate(String birthdayDate) {
    this.birthdayDate = birthdayDate;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIdSpecies() {
    return idSpecies;
  }

  public void setIdSpecies(String idSpecies) {
    this.idSpecies = idSpecies;
  }

  public String getIdBreed() {
    return idBreed;
  }

  public void setIdBreed(String idBreed) {
    this.idBreed = idBreed;
  }

  public String getIdOwner() {
    return idOwner;
  }

  public void setIdOwner(String idOwner) {
    this.idOwner = idOwner;
  }
}
