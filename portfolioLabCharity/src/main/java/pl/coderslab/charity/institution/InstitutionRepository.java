package pl.coderslab.charity.institution;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.institution.Institution;

import java.util.List;

public interface InstitutionRepository extends CrudRepository<Institution, Long> {
    List<Institution> findAllById();
}
