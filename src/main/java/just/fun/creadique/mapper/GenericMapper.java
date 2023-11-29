package just.fun.creadique.mapper;

public interface GenericMapper<POJO, DTO, ENTITY, U_DTO, U_ENTITY> {

    POJO fromDto(DTO dto);
    POJO fromEntity(ENTITY entity);
    POJO fromUpdateDto(U_DTO dto);
    POJO fromUpdateEntity(U_ENTITY dto);
    DTO toDto(POJO pojo);
    ENTITY toEntity(POJO pojo);
    U_DTO toUpdateDto(POJO pojo);
    U_ENTITY toUpdateEntity(POJO pojo);
}
