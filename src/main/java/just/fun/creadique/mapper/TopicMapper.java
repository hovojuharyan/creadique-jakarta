package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.TopicDto;
import just.fun.creadique.model.entity.TopicEntity;
import just.fun.creadique.model.entity.TopicUpdateEntity;
import just.fun.creadique.model.pojo.Topic;

public class TopicMapper implements Mapper<Topic, TopicDto, TopicEntity, TopicUpdateEntity> {
    TopicMapper() {
    }

    @Override
    public Topic pojoFromDto(TopicDto topicDto) {
        return null;
    }

    @Override
    public Topic pojoFromEntity(TopicEntity topicEntity) {
        return null;
    }

    @Override
    public TopicDto dtoFromPojo(Topic topic) {
        return null;
    }

    @Override
    public TopicEntity entityFromPojo(Topic topic) {
        return null;
    }

    @Override
    public TopicUpdateEntity updateEntityFromPojo(Topic topic) {
        return null;
    }
}
