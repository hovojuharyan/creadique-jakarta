package just.fun.creadique.domain.model;

import java.time.LocalDate;

public record User(int id,
                   String username,
                   String email,
                   String password,
                   LocalDate birthdate,
                   String introduction) {
}
