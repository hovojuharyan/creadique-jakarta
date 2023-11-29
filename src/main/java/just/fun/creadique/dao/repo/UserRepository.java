package just.fun.creadique.dao.repo;

import just.fun.creadique.model.pojo.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User create(User user);

    Optional<User> delete(int id);

    Optional<User> get(int id);

    Optional<User> update(int id, User user);

    List<User> list();

    List<User> listFollowing(int id);

    List<User> listFollowers(int id);
}
