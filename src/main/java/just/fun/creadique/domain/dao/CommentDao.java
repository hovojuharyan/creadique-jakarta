package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentDao {
    Optional<Comment> get(int id);
    
    Comment create(Comment toCreate);

    Comment update(int id, Comment updated);

    boolean delete(int id);

    boolean exists(int id);

    List<Comment> findAllByCritiqueId(int critiqueId);

    List<Comment> findAllByUserId(int userId);
}
