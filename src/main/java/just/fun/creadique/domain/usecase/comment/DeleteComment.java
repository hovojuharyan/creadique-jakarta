package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;

public class DeleteComment {
    private final CommentDao dao;

    public DeleteComment(CommentDao dao) {
        this.dao = dao;
    }

    public boolean execute(int id) {
        return dao.delete(id);
    }
}
