package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import just.fun.creadique.domain.exception.NoSuchCritiqueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UpdateCritiqueTest {
    private UpdateCritique updateCritique;
    private CritiqueDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCritiqueDao.newInstance();
        updateCritique = new UpdateCritique(dao);
    }

    @Test
    public void testUpdateCritique() {
        User owner = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "a title", owner);
        Critique updated = TestDataFactory.aCritique(1, "an updated title", owner);
        assertThrows(NoSuchCritiqueException.class, () -> updateCritique.execute(1, updated));
        assertFalse(dao.exists(1));
        dao.create(critique);
        assertTrue(dao.exists(1));
        assertTrue(dao.get(1).isPresent());
        assertEquals(dao.get(1).get().getTitle(), "a title");
        Critique updatedResult = updateCritique.execute(1, updated);
        assertEquals(updatedResult.getTitle(), "an updated title");
    }
}
