package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.Comment;

import java.util.Optional;

public class GetComment {
    private final CommentDao dao;

    public GetComment(CommentDao dao) {
        this.dao = dao;
    }

    public Optional<Comment> execute(int id) {
        return dao.get(id);
    }
}
