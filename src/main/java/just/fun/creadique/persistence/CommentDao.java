package just.fun.creadique.persistence;

import just.fun.creadique.model.entity.CommentEntity;
import just.fun.creadique.model.entity.CritiqueEntity;

import java.util.List;
import java.util.Optional;

public interface CommentDao {
    CommentEntity create(CommentEntity comment);

    Optional<CommentEntity> delete(int id);

    List<CommentEntity> listByCritique(CritiqueEntity critique);

    Optional<CommentEntity> update(int id, CommentEntity comment);

    void rate(int id, int rate);

}
