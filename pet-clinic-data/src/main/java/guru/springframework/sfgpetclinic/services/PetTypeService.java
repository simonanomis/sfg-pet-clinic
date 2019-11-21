package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeService extends CrudService<PetType, Long> {
}
