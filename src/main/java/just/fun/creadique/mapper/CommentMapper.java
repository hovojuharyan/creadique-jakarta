package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.CommentDto;
import just.fun.creadique.model.entity.CommentEntity;
import just.fun.creadique.model.entity.CommentUpdateEntity;
import just.fun.creadique.model.pojo.Comment;
import org.mapstruct.Mapper;

@Mapper
public interface CommentMapper extends GenericMapper<Comment, CommentDto, CommentEntity, CommentDto, CommentUpdateEntity>{
}
