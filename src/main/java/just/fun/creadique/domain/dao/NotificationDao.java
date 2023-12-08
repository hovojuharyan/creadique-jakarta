package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.Notification;

public interface NotificationDao {
    Notification update(int id, Notification updated);
}
