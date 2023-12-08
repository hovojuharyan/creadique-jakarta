package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.dao.TestCritiqueDao;
import just.fun.creadique.domain.data.TestDataFactory;
import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GetCritiqueTest {
    private GetCritique getCritique;
    private CritiqueDao dao;

    @BeforeEach
    public void setup() {
        dao = TestCritiqueDao.newInstance();
        getCritique = new GetCritique(dao);
    }

    @Test
    public void testGetCritique() {
        User owner = TestDataFactory.aUser(1, "owner");
        Critique critique = TestDataFactory.aCritique(1, "a title", owner);
        assertTrue(getCritique.execute(1).isEmpty());
        Critique created = dao.create(critique);
        Optional<Critique> got = getCritique.execute(1);
        assertTrue(got.isPresent());
        assertEquals(created, got.get());
    }
}
