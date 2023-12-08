package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.User;

public class WriteComment {
    private final CommentDao dao;

    public WriteComment(CommentDao dao) {
        this.dao = dao;
    }

    public Comment execute(Comment comment, Critique critique, User writer) {
        comment.setCritique(critique);
        comment.setWriter(writer);
        return dao.create(comment);
    }
}
