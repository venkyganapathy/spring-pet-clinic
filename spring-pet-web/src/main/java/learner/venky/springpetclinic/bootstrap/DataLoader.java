package learner.venky.springpetclinic.bootstrap;

import learner.venky.springpetclinic.maps.OwnerServiceMap;
import learner.venky.springpetclinic.maps.PetServiceMap;
import learner.venky.springpetclinic.maps.VetServiceMap;
import learner.venky.springpetclinic.models.Owner;
import learner.venky.springpetclinic.models.Pet;
import learner.venky.springpetclinic.models.PetType;
import learner.venky.springpetclinic.models.Vet;
import learner.venky.springpetclinic.services.OwnerService;
import learner.venky.springpetclinic.services.PetService;
import learner.venky.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private PetService petService;
    private VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Venky");
        owner1.setId(1L);
        owner1.setLastName("Ganapathy");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Girish");
        owner2.setLastName("Nehete");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vet1");
        vet1.setLastName("Doctor1");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Vet2");
        vet2.setLastName("Doctor2");
        vetService.save(vet2);

        PetType petType = new PetType();
        petType.setId(1L);
        petType.setName("Dog");

        Pet pet1 = new Pet();
        pet1.setId(1L);
        pet1.setBirthDate(LocalDate.of(1972,11,18));
        pet1.setOwner(owner1);
        pet1.setPetType(petType);
        petService.save(pet1);

        Pet pet2 = new Pet();
        pet2.setId(2L);
        pet2.setBirthDate(LocalDate.of(2003,11,23));
        pet2.setOwner(owner2);
        pet2.setPetType(petType);
        petService.save(pet2);
    }
}
