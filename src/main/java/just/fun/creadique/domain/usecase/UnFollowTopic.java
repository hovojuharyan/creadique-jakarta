package just.fun.creadique.domain.usecase;

import just.fun.creadique.domain.dao.TopicFollowingDao;

public class UnFollowTopic {

    private final TopicFollowingDao dao;

    public UnFollowTopic(TopicFollowingDao dao) {
        this.dao = dao;
    }

    public void execute(int userId, int topicId) {
        dao.unfollow(userId, topicId);
    }
}
