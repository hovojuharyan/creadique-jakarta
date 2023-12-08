package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.TopicFollowingDao;

public class FollowTopic {
    private final TopicFollowingDao dao;

    public FollowTopic(TopicFollowingDao dao) {
        this.dao = dao;
    }

    public void execute(int userId, int topicId) {
        dao.follow(userId, topicId);
    }

}
