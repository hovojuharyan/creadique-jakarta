package just.fun.creadique.model.dto;

import java.time.LocalDate;

public record UserDto(int id,
                      String username,
                      String email,
                      String password,
                      LocalDate birthdate,
                      String introduction) {
}
