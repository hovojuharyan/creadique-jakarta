package just.fun.creadique.persistence.impl;

import just.fun.creadique.model.entity.TopicEntity;
import just.fun.creadique.persistence.TopicDao;

import java.util.List;
import java.util.Optional;

public class TopicDaoImpl implements TopicDao {
    @Override
    public TopicEntity create(TopicEntity topic) {
        return null;
    }

    @Override
    public Optional<TopicEntity> get(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<TopicEntity> delete(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<TopicEntity> update(int id, TopicEntity topic) {
        return Optional.empty();
    }

    @Override
    public List<TopicEntity> list() {
        return null;
    }

    @Override
    public List<TopicEntity> listFollowing(int userId) {
        return null;
    }
}
