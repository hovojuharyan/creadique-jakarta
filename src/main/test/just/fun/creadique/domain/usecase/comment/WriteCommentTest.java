package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.dao.TestCommentDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class WriteCommentTest {
    private WriteComment writeComment;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        writeComment = new WriteComment(dao);
    }

    @Test
    public void testWriteComment() {
        User user = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "title", user);
        Comment comment = TestDataFactory.aComment(1, null, null).build();
        assertFalse(dao.exists(1));
        writeComment.execute(comment, critique, user);
        assertTrue(dao.exists(1));
        Optional<Comment> created = dao.get(1);
        assertTrue(created.isPresent());
        assertEquals(created.get().getWriter(), user);
        assertEquals(created.get().getCritique(), critique);
    }
}
