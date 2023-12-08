package just.fun.creadique.domain.dao;

public interface TopicFollowingDao {
    void follow(int userId, int topicId);
    void unfollow(int userId, int topicId);
}
