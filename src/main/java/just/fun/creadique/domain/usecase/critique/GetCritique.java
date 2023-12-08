package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.entity.Critique;
import just.fun.creadique.domain.dao.CritiqueDao;

import java.util.Optional;

public class GetCritique {
    private final CritiqueDao dao;

    public GetCritique(CritiqueDao dao) {
        this.dao = dao;
    }

    public Optional<Critique> execute(int critiqueId) {
        return dao.get(critiqueId);
    }
}
