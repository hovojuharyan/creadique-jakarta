package just.fun.creadique.model.pojo;

import java.time.LocalDate;
import java.util.List;

public record Critique(int id,
                       String title,
                       String content,
                       LocalDate published,
                       LocalDate lastEdited,
                       int rating,
                       int read,
                       boolean validated,
                       User publisher,
                       List<Topic> topics,
                       int wordCount) {
}
