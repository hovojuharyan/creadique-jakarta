package just.fun.creadique.domain.entity;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Comment {
    int id;
    User writer;
    String text;
    double rating;
    LocalDate writtenAt;
    int replyCount;
    Comment parent;
    Critique critique;

}
