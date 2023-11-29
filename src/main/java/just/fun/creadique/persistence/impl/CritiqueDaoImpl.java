package just.fun.creadique.persistence.impl;

import just.fun.creadique.model.entity.CritiqueEntity;
import just.fun.creadique.model.pojo.Topic;
import just.fun.creadique.model.pojo.User;
import just.fun.creadique.persistence.CritiqueDao;

import java.util.List;
import java.util.Optional;

public class CritiqueDaoImpl implements CritiqueDao {
    @Override
    public CritiqueEntity create(CritiqueEntity critique) {
        return null;
    }

    @Override
    public CritiqueEntity delete(int id) {
        return null;
    }

    @Override
    public Optional<CritiqueEntity> get(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<CritiqueEntity> update(int id, CritiqueEntity critique) {
        return Optional.empty();
    }

    @Override
    public List<CritiqueEntity> list() {
        return null;
    }

    @Override
    public List<CritiqueEntity> listByTopic(Topic topic) {
        return null;
    }

    @Override
    public List<CritiqueEntity> listByUser(User user) {
        return null;
    }

    @Override
    public void rateCritique(int id, int rating) {

    }
}
