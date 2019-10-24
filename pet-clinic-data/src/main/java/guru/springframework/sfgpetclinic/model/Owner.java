package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Set;

@Data
public class Owner extends Person {

    private Long id;
    private Set<Pet> pets;

}
