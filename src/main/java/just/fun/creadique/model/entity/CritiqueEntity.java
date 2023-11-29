package just.fun.creadique.model.entity;

import java.time.LocalDate;
import java.util.List;

public record CritiqueEntity(int id,
                             String title,
                             String content,
                             LocalDate published,
                             LocalDate lastEdited,
                             int rating,
                             int read,
                             boolean validated,
                             UserEntity publisher,
                             List<TopicEntity> topics,
                             int wordCount) {
}
