package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.exception.NoSuchCommentException;

public class ReplyToComment {
    private final CommentDao dao;

    public ReplyToComment(CommentDao dao) {
        this.dao = dao;
    }

    public Comment execute(int parentId, Comment comment) {
        Comment parent = dao.get(parentId).orElseThrow(() -> new NoSuchCommentException(parentId));
        comment.setParent(parent);
        return dao.create(comment);
    }
}
