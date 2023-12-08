package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.UserFollowingDao;

public class FollowUser {
    private final UserFollowingDao dao;

    public FollowUser(UserFollowingDao dao) {
        this.dao = dao;
    }

    public void execute(int fromId, int toId) {
        dao.follow(fromId, toId);
    }
}
