package just.fun.creadique.domain.model;

import java.time.LocalDate;

public record Comment(int id,
                      String content,
                      LocalDate commented,
                      int rating,
                      int replyCount,
                      Comment parent,
                      User commenter,
                      Critique critique) {
}
