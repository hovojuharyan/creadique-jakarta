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
public class User {
    int id;
    String name;
    String email;
    String password;
    String introDesc;
    LocalDate joinedAt;
    UserStatus status;
    double rating;
    int followersCount;
    int followingCount;
    int interestedTopicsCount;
    String image;
    LocalDate bornAt;
}
