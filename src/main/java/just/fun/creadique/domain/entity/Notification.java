package just.fun.creadique.domain.entity;

import java.time.LocalDate;

public class Notification {
    int id;
    User to;
    String type;
    String content;
    LocalDate sentAt;
}
