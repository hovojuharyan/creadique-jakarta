package just.fun.creadique.persistence.repo;

import just.fun.creadique.model.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    UserEntity create(UserEntity user);

    Optional<UserEntity> delete(int id);

    Optional<UserEntity> get(int id);

    Optional<UserEntity> update(int id, UserEntity user);

    List<UserEntity> list();

    List<UserEntity> listFollowing(int id);

    List<UserEntity> listFollowers(int id);
}
