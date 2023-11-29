package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.UserDto;
import just.fun.creadique.model.entity.UserEntity;
import just.fun.creadique.model.entity.UserUpdateEntity;
import just.fun.creadique.model.pojo.User;

public class UserMapper implements Mapper<User, UserDto, UserEntity, UserUpdateEntity> {
    UserMapper() {
    }

    @Override
    public User pojoFromDto(UserDto userDto) {
        return null;
    }

    @Override
    public User pojoFromEntity(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserDto dtoFromPojo(User user) {
        return null;
    }

    @Override
    public UserEntity entityFromPojo(User user) {
        return null;
    }

    @Override
    public UserUpdateEntity updateEntityFromPojo(User user) {
        return null;
    }
}
