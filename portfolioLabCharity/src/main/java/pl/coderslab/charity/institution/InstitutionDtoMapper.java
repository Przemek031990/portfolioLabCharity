package pl.coderslab.charity.institution;

public class InstitutionDtoMapper {
    static InstitutionDto map(Institution institution) {
        return new InstitutionDto(
                institution.getId(),
                institution.getName(),
                institution.getDescription()
        );
    }
}
