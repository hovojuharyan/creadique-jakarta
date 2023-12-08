package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.UserFollowingDao;

public class UnFollowUser {

    private final UserFollowingDao dao;

    public UnFollowUser(UserFollowingDao dao) {
        this.dao = dao;
    }

    public void execute(int fromId, int toId) {
        dao.unfollow(fromId, toId);
    }
}
