package just.fun.creadique.persistence.impl;

import just.fun.creadique.model.entity.CommentEntity;
import just.fun.creadique.model.entity.CritiqueEntity;
import just.fun.creadique.persistence.CommentDao;

import java.util.List;
import java.util.Optional;

public class CommentDaoImpl implements CommentDao {
    @Override
    public CommentEntity create(CommentEntity comment) {
        return null;
    }

    @Override
    public Optional<CommentEntity> delete(int id) {
        return Optional.empty();
    }

    @Override
    public List<CommentEntity> listByCritique(CritiqueEntity critique) {
        return null;
    }

    @Override
    public Optional<CommentEntity> update(int id, CommentEntity comment) {
        return Optional.empty();
    }

    @Override
    public void rate(int id, int rate) {

    }
}
