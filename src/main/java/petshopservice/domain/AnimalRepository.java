package petshopservice.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import petshopservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "animals", path = "animals")
public interface AnimalRepository
    extends PagingAndSortingRepository<Animal, UUID> {}
