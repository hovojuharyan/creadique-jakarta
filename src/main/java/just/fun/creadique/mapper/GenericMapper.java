package just.fun.creadique.mapper;

import java.util.List;

public interface GenericMapper<POJO, DTO, ENTITY, U_DTO, U_ENTITY> {

    POJO fromDto(DTO dto);

    POJO fromEntity(ENTITY entity);

    POJO fromUpdateDto(U_DTO dto);

    POJO fromUpdateEntity(U_ENTITY dto);

    DTO toDto(POJO pojo);

    ENTITY toEntity(POJO pojo);

    U_DTO toUpdateDto(POJO pojo);

    U_ENTITY toUpdateEntity(POJO pojo);

    List<POJO> fromDtoBunch(List<DTO> dtos);

    List<POJO> fromEntityBunch(List<ENTITY> entities);

    List<POJO> fromUpdateDtoBunch(List<U_DTO> dtos);

    List<POJO> fromUpdateEntityBunch(List<U_ENTITY> dtos);

    List<DTO> toDtoBunch(List<POJO> pojos);

    List<ENTITY> toEntityBunch(List<POJO> pojos);

    List<U_DTO> toUpdateDtoBunch(List<POJO> pojos);

    List<U_ENTITY> toUpdateEntityBunch(List<POJO> pojos);

}
