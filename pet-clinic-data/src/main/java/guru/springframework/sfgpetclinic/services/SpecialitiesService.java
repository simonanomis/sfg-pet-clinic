package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialitiesService extends CrudService<Speciality, Long> {
}
