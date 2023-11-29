package just.fun.creadique.model.dto;

import java.util.List;

public record CritiqueUpdateDto(int id,
                                String title,
                                String content,
                                List<TopicDto> topics) {
}
