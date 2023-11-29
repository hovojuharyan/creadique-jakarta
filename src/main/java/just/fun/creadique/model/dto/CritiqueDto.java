package just.fun.creadique.model.dto;

import java.time.LocalDate;
import java.util.List;

public record CritiqueDto(int id,
                          String title,
                          String content,
                          LocalDate published,
                          LocalDate lastEdited,
                          int rating,
                          int read,
                          boolean validated,
                          UserDto publisher,
                          List<TopicDto> topics,
                          int wordCount) {
}
