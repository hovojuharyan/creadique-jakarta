package just.fun.creadique.dao.repo;

import just.fun.creadique.model.pojo.Topic;

import java.util.List;
import java.util.Optional;

public interface TopicRepository {
    Topic create(Topic topic);

    Optional<Topic> get(int id);

    Optional<Topic> delete(int id);

    Optional<Topic> update(int id, Topic topic);

    List<Topic> list();

    List<Topic> listFollowing(int userId);

}
