package just.fun.creadique.persistence.impl;

import just.fun.creadique.model.entity.UserEntity;
import just.fun.creadique.persistence.UserDao;

import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public UserEntity create(UserEntity user) {
        return null;
    }

    @Override
    public Optional<UserEntity> delete(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> get(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> update(int id, UserEntity user) {
        return Optional.empty();
    }

    @Override
    public List<UserEntity> list() {
        return null;
    }

    @Override
    public List<UserEntity> listFollowing(int id) {
        return null;
    }

    @Override
    public List<UserEntity> listFollowers(int id) {
        return null;
    }
}
