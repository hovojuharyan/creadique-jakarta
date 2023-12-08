package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.exception.NoSuchCommentException;

public class UpdateComment {
    private final CommentDao dao;

    public UpdateComment(CommentDao dao) {
        this.dao = dao;
    }

    public Comment execute(int id, Comment updated) {
        if (!dao.exists(id)) throw new NoSuchCommentException(id);
        return dao.update(id, updated);
    }
}
