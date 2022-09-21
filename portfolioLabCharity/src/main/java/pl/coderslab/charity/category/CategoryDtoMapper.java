package pl.coderslab.charity.category;

public class CategoryDtoMapper {
    static CategoryDto map(Category category) {
        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }
}
