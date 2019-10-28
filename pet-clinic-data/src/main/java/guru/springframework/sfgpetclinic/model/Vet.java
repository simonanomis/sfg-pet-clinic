package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Set;

@Data
public class Vet extends Person {

    private Set<Speciality> speciality;
}
