package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.Critique;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestCritiqueDao implements CritiqueDao {

    public static TestCritiqueDao newInstance() {
        return new TestCritiqueDao();
    }

    private final Map<Integer, Critique> storage;

    private TestCritiqueDao() {
        this.storage = new HashMap<>();
    }

    @Override
    public boolean delete(int id) {
        return storage.remove(id) != null;
    }

    @Override
    public Critique create(Critique toCreate) {
        storage.put(toCreate.getId(), toCreate);
        return storage.get(toCreate.getId());
    }

    @Override
    public Critique update(int id, Critique updated) {
        storage.put(id, updated);
        return storage.get(id);
    }

    @Override
    public Optional<Critique> get(int id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public boolean exists(int id) {
        return storage.containsKey(id);
    }
}
