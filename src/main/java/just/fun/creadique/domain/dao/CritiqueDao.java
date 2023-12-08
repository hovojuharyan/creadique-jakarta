package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.Critique;

import java.util.Optional;

public interface CritiqueDao {

    boolean delete(int id);

    Critique create(Critique toCreate);

    Critique update(int id, Critique updated);

    Optional<Critique> get(int id);

    boolean exists(int id);
}
