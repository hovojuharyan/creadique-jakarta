package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.entity.Comment;

import java.util.List;

public class GetCommentsOfCritique {
    private final CommentDao dao;

    public GetCommentsOfCritique(CommentDao dao) {
        this.dao = dao;
    }

    public List<Comment> execute(int critiqueId) {
        return dao.findAllByCritiqueId(critiqueId);
    }
}
