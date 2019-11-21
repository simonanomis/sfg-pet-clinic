package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Repository;

@Repository
public interface VetService extends CrudService<Vet, Long> {
}
