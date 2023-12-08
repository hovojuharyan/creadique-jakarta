package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.dao.TestCommentDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetCommentsOfCritiqueTest {
    private GetCommentsOfCritique getCommentsOfCritique;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        getCommentsOfCritique = new GetCommentsOfCritique(dao);
    }

    @Test
    public void testGetCommentsOfCritique() {
        User user = TestDataFactory.aUser(1, "user name");
        int critique1Id = 1;
        int critique2Id = 2;
        List<Comment> before = getCommentsOfCritique.execute(critique1Id);
        assertTrue(before.isEmpty());
        Critique critique1 = TestDataFactory.aCritique(critique1Id, "title 1", user);
        Critique critique2 = TestDataFactory.aCritique(critique2Id, "title 2", user);
        Comment comment1of1 = TestDataFactory.aComment(1, user, critique1).build();
        Comment comment2of1 = TestDataFactory.aComment(2, user, critique1).build();
        Comment comment1of2 = TestDataFactory.aComment(3, user, critique2).build();
        Comment comment2of2 = TestDataFactory.aComment(4, user, critique2).build();
        dao.create(comment1of1);
        dao.create(comment2of1);
        dao.create(comment1of2);
        dao.create(comment2of2);
        List<Comment> of1 = getCommentsOfCritique.execute(critique1Id);
        List<Comment> of2 = getCommentsOfCritique.execute(critique2Id);
        assertEquals(of1.size(), 2);
        assertEquals(of1.getFirst().getId(), 1);
        assertEquals(of2.size(), 2);
        assertEquals(of2.getFirst().getId(), 3);
    }
}
