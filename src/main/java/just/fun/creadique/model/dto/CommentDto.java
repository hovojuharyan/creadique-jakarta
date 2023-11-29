package just.fun.creadique.model.dto;

import java.time.LocalDate;

public record CommentDto(int id,
                         String content,
                         LocalDate commented,
                         int rating,
                         int replyCount,
                         CommentDto parent,
                         UserDto commenter,
                         CritiqueDto critique) {
}
