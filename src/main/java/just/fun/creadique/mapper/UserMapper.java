package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.UserDto;
import just.fun.creadique.model.dto.UserUpdateDto;
import just.fun.creadique.model.entity.UserEntity;
import just.fun.creadique.model.pojo.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<User, UserDto, UserEntity, UserUpdateDto> {
}
