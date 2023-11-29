package just.fun.creadique.dao.repo;

import just.fun.creadique.model.pojo.Critique;
import just.fun.creadique.model.pojo.Topic;
import just.fun.creadique.model.pojo.User;

import java.util.List;
import java.util.Optional;

public interface CritiqueRepository {

    Critique create(Critique critique);

    Critique delete(int id);

    Optional<Critique> get(int id);

    Optional<Critique> update(int id, Critique critique);

    List<Critique> list();

    List<Critique> listByTopic(Topic topic);

    List<Critique> listByUser(User user);

    void rateCritique(int id, int rating);
}
