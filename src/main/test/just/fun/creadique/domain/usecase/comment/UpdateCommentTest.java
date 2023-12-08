package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.dao.TestCommentDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import just.fun.creadique.domain.exception.NoSuchCommentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateCommentTest {
    private UpdateComment updateComment;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        updateComment = new UpdateComment(dao);
    }

    @Test
    public void testUpdateComment() {
        User user = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "title", user);
        Comment comment = TestDataFactory.aComment(1, user, critique)
                .text("INITIAL TEXT")
                .build();
        Comment updated = TestDataFactory.aComment(1, user, critique)
                .text("UPDATED TEXT")
                .build();
        assertThrows(NoSuchCommentException.class, () -> updateComment.execute(1, updated));
        dao.create(comment);
        updateComment.execute(1, updated);
        assertTrue(dao.get(1).isPresent());
        assertEquals(dao.get(1).get().getText(), "UPDATED TEXT");
    }
}
