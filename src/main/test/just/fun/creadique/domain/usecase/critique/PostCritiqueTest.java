package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostCritiqueTest {
    private PostCritique postCritique;
    private CritiqueDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCritiqueDao.newInstance();
        postCritique = new PostCritique(dao);
    }

    @Test
    public void testPostCritique() {
        User owner = TestDataFactory.aUser(1, "a name");
        Critique critique = TestDataFactory.aCritique(1, "a title", owner);
        assertFalse(dao.exists(1));
        postCritique.execute(critique);
        assertTrue(dao.exists(1));
        Critique created = dao.get(1).get();
        assertEquals(created.getTitle(), "a title");
        assertEquals(created.getOwner(), owner);
    }

}
