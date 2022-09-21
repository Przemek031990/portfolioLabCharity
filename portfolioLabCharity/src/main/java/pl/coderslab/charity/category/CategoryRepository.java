package pl.coderslab.charity.category;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.category.Category;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAllById();
}
