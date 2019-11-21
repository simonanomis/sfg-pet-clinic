package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity {

  private PetType petType;
  private Owner owner;
  private LocalDate birthday;
  private String name;
}
