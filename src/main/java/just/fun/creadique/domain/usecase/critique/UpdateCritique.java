package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.dao.CritiqueDao;
import just.fun.creadique.domain.exception.NoSuchCritiqueException;

public class UpdateCritique {

    private final CritiqueDao dao;

    public UpdateCritique(CritiqueDao dao) {
        this.dao = dao;
    }

    public Critique execute(int id, Critique updated) {
        if (!dao.exists(id)) throw new NoSuchCritiqueException(id);
        return dao.update(id, updated);
    }
}
