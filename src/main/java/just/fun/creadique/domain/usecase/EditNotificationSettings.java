package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.NotificationDao;
import just.fun.creadique.domain.entity.Notification;

public class EditNotificationSettings {
    private final NotificationDao dao;

    public EditNotificationSettings(NotificationDao dao) {
        this.dao = dao;
    }

    public Notification execute(int userId, Notification updated) {
        return dao.update(userId, updated);
    }
}
