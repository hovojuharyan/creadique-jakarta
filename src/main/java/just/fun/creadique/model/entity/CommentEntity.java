package just.fun.creadique.model.entity;

import java.time.LocalDate;

public record CommentEntity(int id,
                            String content,
                            LocalDate commented,
                            int rating,
                            int replyCount,
                            CommentEntity parent,
                            UserEntity commenter,
                            CritiqueEntity critique) {
}
