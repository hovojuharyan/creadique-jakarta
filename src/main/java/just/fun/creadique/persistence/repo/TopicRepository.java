package just.fun.creadique.persistence.repo;

import just.fun.creadique.model.entity.TopicEntity;

import java.util.List;
import java.util.Optional;

public interface TopicRepository {
    TopicEntity create(TopicEntity topic);

    Optional<TopicEntity> get(int id);

    Optional<TopicEntity> delete(int id);

    Optional<TopicEntity> update(int id, TopicEntity topic);

    List<TopicEntity> list();

    List<TopicEntity> listFollowing(int userId);

}
