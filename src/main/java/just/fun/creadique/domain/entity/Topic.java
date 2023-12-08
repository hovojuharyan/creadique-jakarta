package just.fun.creadique.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topic {
    int id;
    String title;
    String description;
    int followersCount;
    String image;
    int critiquesCount;
    LocalDate createdAt;
}
