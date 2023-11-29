package just.fun.creadique.mapper;

public interface Mapper<POJO, DTO, ENTITY, UPDATE_ENTITY> {

    POJO pojoFromDto(DTO dto);

    POJO pojoFromEntity(ENTITY entity);

    DTO dtoFromPojo(POJO pojo);

    ENTITY entityFromPojo(POJO pojo);

    UPDATE_ENTITY updateEntityFromPojo(POJO pojo);
}
