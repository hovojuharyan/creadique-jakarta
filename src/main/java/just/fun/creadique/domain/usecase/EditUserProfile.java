package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.entity.User;
import just.fun.creadique.domain.dao.UserDao;

public class EditUserProfile {

    private final UserDao dao;

    public EditUserProfile(UserDao dao) {
        this.dao = dao;
    }

    public User execute(int userId, User updated) {
        return dao.update(userId, updated);
    }
}
