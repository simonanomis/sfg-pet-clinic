package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Repository;

@Repository
public interface PetService extends CrudService<Pet, Long> {
}
