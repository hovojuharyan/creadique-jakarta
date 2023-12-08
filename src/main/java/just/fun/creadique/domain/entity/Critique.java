package just.fun.creadique.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Critique {
    int id;
    String title;
    String description;
    User owner;
    double rating;
    String images;
    String content;
    LocalDate postedAt;
    LocalDate lastEditedAt;
    List<String> references;
    List<String> sideNotes;
    List<Topic> topics;

}
