package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.CritiqueDto;
import just.fun.creadique.model.dto.CritiqueUpdateDto;
import just.fun.creadique.model.entity.CritiqueEntity;
import just.fun.creadique.model.entity.CritiqueUpdateEntity;
import just.fun.creadique.model.pojo.Critique;
import org.mapstruct.Mapper;

@Mapper
public interface CritiqueMapper extends GenericMapper<Critique, CritiqueDto, CritiqueEntity, CritiqueUpdateDto, CritiqueUpdateEntity> {
}
