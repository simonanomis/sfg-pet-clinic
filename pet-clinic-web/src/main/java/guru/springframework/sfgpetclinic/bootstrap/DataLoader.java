package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Filip");
        owner1.setLastName("Ristovski");
        owner1.setAddress("Moon");
        owner1.setCity("Skopje");
        owner1.setTelephone("123456");

        Pet filipsPet = new Pet();
        filipsPet.setPetType(savedDogType);
        filipsPet.setOwner(owner1);
        filipsPet.setBirthday(LocalDate.now());
        filipsPet.setName("Lea");

        owner1.getPets().add(filipsPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Simona");
        owner2.setLastName("Stevkovska");
        owner2.setAddress("Sun");
        owner2.setCity("Skopje");
        owner2.setTelephone("456789");

        Pet simonaPet = new Pet();
        simonaPet.setPetType(savedCatType);
        simonaPet.setOwner(owner2);
        simonaPet.setBirthday(LocalDate.now());
        simonaPet.setName("Muce");

        owner2.getPets().add(simonaPet);

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Stanko");
        owner3.setLastName("Stankov");

        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Lea");
        vet1.setLastName("Ristovska");
        vetService.save(vet1);

    }
}
