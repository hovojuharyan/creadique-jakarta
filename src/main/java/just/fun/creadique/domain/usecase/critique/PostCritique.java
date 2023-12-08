package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.entity.Critique;

public class PostCritique {
    private final CritiqueDao dao;

    public PostCritique(CritiqueDao dao) {
        this.dao = dao;
    }

    public Critique execute(Critique toPost) {
        return dao.create(toPost);
    }
}
