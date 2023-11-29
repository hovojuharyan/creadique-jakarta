package just.fun.creadique.mapper;

import just.fun.creadique.model.dto.CommentDto;
import just.fun.creadique.model.entity.CommentEntity;
import just.fun.creadique.model.entity.CommentUpdateEntity;
import just.fun.creadique.model.pojo.Comment;

public class CommentMapper implements Mapper<Comment, CommentDto, CommentEntity, CommentUpdateEntity> {
    CommentMapper() {
    }

    @Override
    public Comment pojoFromDto(CommentDto commentDto) {
        return null;
    }

    @Override
    public Comment pojoFromEntity(CommentEntity commentEntity) {
        return null;
    }

    @Override
    public CommentDto dtoFromPojo(Comment comment) {
        return null;
    }

    @Override
    public CommentEntity entityFromPojo(Comment comment) {
        return null;
    }

    @Override
    public CommentUpdateEntity updateEntityFromPojo(Comment comment) {
        return null;
    }
}
