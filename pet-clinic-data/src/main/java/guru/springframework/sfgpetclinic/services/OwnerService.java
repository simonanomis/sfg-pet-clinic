package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
