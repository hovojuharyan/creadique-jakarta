package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.CritiqueDto;
import just.fun.creadique.model.entity.CritiqueEntity;
import just.fun.creadique.model.entity.CritiqueUpdateEntity;
import just.fun.creadique.model.pojo.Critique;

public class CritiqueMapper implements Mapper<Critique, CritiqueDto, CritiqueEntity, CritiqueUpdateEntity> {
    CritiqueMapper() {
    }

    @Override
    public Critique pojoFromDto(CritiqueDto critiqueDto) {
        return null;
    }

    @Override
    public Critique pojoFromEntity(CritiqueEntity critiqueEntity) {
        return null;
    }

    @Override
    public CritiqueDto dtoFromPojo(Critique critique) {
        return null;
    }

    @Override
    public CritiqueEntity entityFromPojo(Critique critique) {
        return null;
    }

    @Override
    public CritiqueUpdateEntity updateEntityFromPojo(Critique critique) {
        return null;
    }
}
