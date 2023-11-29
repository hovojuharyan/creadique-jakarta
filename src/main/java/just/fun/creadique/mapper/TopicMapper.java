package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.TopicDto;
import just.fun.creadique.model.dto.TopicUpdateDto;
import just.fun.creadique.model.entity.TopicEntity;
import just.fun.creadique.model.entity.TopicUpdateEntity;
import just.fun.creadique.model.pojo.Topic;
import org.mapstruct.Mapper;

@Mapper
public interface TopicMapper extends GenericMapper<Topic, TopicDto, TopicEntity, TopicUpdateDto, TopicUpdateEntity> {
}
