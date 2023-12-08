package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.User;

public interface UserDao {
    User update(int id, User updated);
}
