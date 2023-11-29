package just.fun.creadique.dao.repo;

import just.fun.creadique.model.entity.CommentEntity;
import just.fun.creadique.model.entity.CommentUpdateEntity;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    CommentEntity create(CommentEntity comment);

    Optional<CommentEntity> delete(int id);

    List<CommentEntity> listByCritique(CommentEntity comment);

    Optional<CommentEntity> update(int id, CommentUpdateEntity comment);

    void rate(int id, int rate);

}
