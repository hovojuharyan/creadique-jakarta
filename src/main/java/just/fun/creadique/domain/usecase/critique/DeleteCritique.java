package just.fun.creadique.domain.usecase.critique;

import just.fun.creadique.domain.dao.CritiqueDao;

public class DeleteCritique {

    private final CritiqueDao dao;

    public DeleteCritique(CritiqueDao dao) {
        this.dao = dao;
    }

    public boolean execute(int critiqueId) {
        return dao.delete(critiqueId);
    }

}
