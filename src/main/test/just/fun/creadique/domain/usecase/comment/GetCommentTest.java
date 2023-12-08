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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetCommentTest {
    private GetComment getComment;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        getComment = new GetComment(dao);
    }

    @Test
    public void testGetComment() {
        User user = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "title", user);
        Comment comment = TestDataFactory.aComment(1, user, critique).build();
        Optional<Comment> gotBefore = getComment.execute(1);
        assertTrue(gotBefore.isEmpty());
        Comment created = dao.create(comment);
        Optional<Comment> gotAfter = getComment.execute(1);
        assertTrue(gotAfter.isPresent());
        assertEquals(gotAfter.get(), created);
    }
}
