package petshopservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshopservice.PetShopApplication;

@Entity
@Table(name = "Animal_table")
@Data
//<<< DDD / Aggregate Root
public class Animal {

    @Id
    private UUID animalId;

    private String animalType;

    private String healthStatus;

    private String temperament;

    public static AnimalRepository repository() {
        AnimalRepository animalRepository = PetShopApplication.applicationContext.getBean(
            AnimalRepository.class
        );
        return animalRepository;
    }
}
//>>> DDD / Aggregate Root
