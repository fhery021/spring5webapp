package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ferenc on 11/28/2018.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
