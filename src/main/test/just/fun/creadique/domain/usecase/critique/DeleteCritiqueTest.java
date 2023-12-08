package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeleteCritiqueTest {
    private DeleteCritique deleteCritique;
    private CritiqueDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCritiqueDao.newInstance();
        deleteCritique = new DeleteCritique(dao);
    }

    @Test
    public void testDeleteCritique() {
        User owner = TestDataFactory.aUser(1, "user name");
        Critique critique = TestDataFactory.aCritique(1, "a title", owner);
        dao.create(critique);
        assertTrue(dao.exists(1));
        boolean wasThere = deleteCritique.execute(1);
        assertFalse(dao.exists(1));
        assertTrue(wasThere);
        boolean wasThereSecondTime = deleteCritique.execute(1);
        assertFalse(wasThereSecondTime);
    }
}
