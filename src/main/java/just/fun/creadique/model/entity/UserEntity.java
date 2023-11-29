package just.fun.creadique.model.entity;

import java.time.LocalDate;

public record UserEntity(int id,
                         String username,
                         String email,
                         String password,
                         LocalDate birthdate,
                         String introduction) {
}
