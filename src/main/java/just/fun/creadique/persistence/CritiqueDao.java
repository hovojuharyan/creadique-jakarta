package just.fun.creadique.persistence;

import just.fun.creadique.model.entity.CritiqueEntity;
import just.fun.creadique.model.pojo.Topic;
import just.fun.creadique.model.pojo.User;

import java.util.List;
import java.util.Optional;

public interface CritiqueDao {

    CritiqueEntity create(CritiqueEntity critique);

    CritiqueEntity delete(int id);

    Optional<CritiqueEntity> get(int id);

    Optional<CritiqueEntity> update(int id, CritiqueEntity critique);

    List<CritiqueEntity> list();

    List<CritiqueEntity> listByTopic(Topic topic);

    List<CritiqueEntity> listByUser(User user);

    void rateCritique(int id, int rating);
}
