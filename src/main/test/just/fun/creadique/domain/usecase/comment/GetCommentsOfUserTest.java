package just.fun.creadique.domain.usecase.comment;

import just.fun.creadique.domain.dao.CommentDao;
import just.fun.creadique.domain.dao.TestCommentDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Comment;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GetCommentsOfUserTest {
    private GetCommentsOfUser getCommentsOfUser;
    private CommentDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCommentDao.newInstance();
        getCommentsOfUser = new GetCommentsOfUser(dao);
    }

    @Test
    public void testGetCommentsOfUser() {
        int user1Id = 1;
        int user2Id = 2;
        List<Comment> before = getCommentsOfUser.execute(user1Id);
        assertTrue(before.isEmpty());
        User user1 = TestDataFactory.aUser(user1Id, "user name 1");
        User user2 = TestDataFactory.aUser(user2Id, "user name 2");
        Critique critique = TestDataFactory.aCritique(1, "title", user1);
        Comment comment1of1 = TestDataFactory.aComment(1, user1, critique).build();
        Comment comment2of1 = TestDataFactory.aComment(2, user1, critique).build();
        Comment comment1of2 = TestDataFactory.aComment(3, user2, critique).build();
        Comment comment2of2 = TestDataFactory.aComment(4, user2, critique).build();
        dao.create(comment1of1);
        dao.create(comment2of1);
        dao.create(comment1of2);
        dao.create(comment2of2);
        List<Comment> of1 = getCommentsOfUser.execute(user1Id);
        List<Comment> of2 = getCommentsOfUser.execute(user2Id);
        assertEquals(of1.size(), 2);
        assertEquals(of2.size(), 2);
        assertEquals(of1.getFirst().getId(), 1);
        assertEquals(of2.getFirst().getId(), 3);
    }
}
