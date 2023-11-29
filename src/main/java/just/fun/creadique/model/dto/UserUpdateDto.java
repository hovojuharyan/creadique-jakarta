package just.fun.creadique.model.dto;

import java.time.LocalDate;

public record UserUpdateDto(int id,
                            String email,
                            String password,
                            LocalDate birthdate,
                            String introduction) {
}
