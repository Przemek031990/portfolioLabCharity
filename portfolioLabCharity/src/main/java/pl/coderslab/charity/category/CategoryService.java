package pl.coderslab.charity.category;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> findAllCategory() {
        return categoryRepository.findAllById().stream()
                .map(CategoryDtoMapper::map)
                .toList();
    }
}
