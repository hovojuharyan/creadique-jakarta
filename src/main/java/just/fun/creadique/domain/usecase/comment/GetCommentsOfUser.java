package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.Comment;

import java.util.List;

public class GetCommentsOfUser {
    private final CommentDao dao;

    public GetCommentsOfUser(CommentDao dao) {
        this.dao = dao;
    }

    public List<Comment> execute(int userId) {
        return dao.findAllByUserId(userId);
    }
}
