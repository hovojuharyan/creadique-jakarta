package just.fun.creadique.mapper;

import java.util.List;

public interface GenericMapper<POJO, DTO, ENTITY, U_DTO> {

    POJO fromDto(DTO dto);

    POJO fromEntity(ENTITY entity);

    POJO fromUpdateDto(U_DTO dto);

    DTO toDto(POJO pojo);

    ENTITY toEntity(POJO pojo);

    U_DTO toUpdateDto(POJO pojo);

    List<POJO> fromDtoBunch(List<DTO> dtos);

    List<POJO> fromEntityBunch(List<ENTITY> entities);

    List<POJO> fromUpdateDtoBunch(List<U_DTO> dtos);

    List<DTO> toDtoBunch(List<POJO> pojos);

    List<ENTITY> toEntityBunch(List<POJO> pojos);

    List<U_DTO> toUpdateDtoBunch(List<POJO> pojos);

}
