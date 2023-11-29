package just.fun.creadique.dao.repo;

import just.fun.creadique.model.pojo.Comment;
import just.fun.creadique.model.pojo.Critique;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    Comment create(Comment comment);

    Optional<Comment> delete(int id);

    List<Comment> listByCritique(Critique critique);

    Optional<Comment> update(int id, Comment comment);

    void rate(int id, int rate);

}
