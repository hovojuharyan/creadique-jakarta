package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.dao.TestCommentDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeleteCommentTest {
    private DeleteComment deleteComment;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        deleteComment = new DeleteComment(dao);
    }

    @Test
    public void testDeleteComment() {
        User user = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "title", user);
        Comment comment = TestDataFactory.aComment(1, user, critique).build();
        boolean wasThereBefore = deleteComment.execute(1);
        assertFalse(wasThereBefore);
        dao.create(comment);
        assertTrue(dao.exists(1));
        boolean wasThere = deleteComment.execute(1);
        assertTrue(wasThere);
        assertFalse(dao.exists(1));
        boolean wasThereAfter = deleteComment.execute(1);
        assertFalse(wasThereAfter);
    }
}
