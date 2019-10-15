package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Filip");
        owner1.setLastName("Ristovski");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Simona");
        owner2.setLastName("Stevkovska");

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
