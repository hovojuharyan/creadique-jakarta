package just.fun.creadique.domain.dao;

public interface UserFollowingDao {
    void follow(int fromId, int toId);

    void unfollow(int fromId, int toId);
}
