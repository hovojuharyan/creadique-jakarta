package just.fun.creadique.domain.dao;

import just.fun.creadique.domain.entity.Comment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TestCommentDao implements CommentDao {

    public static TestCommentDao newInstance() {
        return new TestCommentDao();
    }

    private final Map<Integer, Comment> storage;

    public TestCommentDao() {
        storage = new HashMap<>();
    }

    @Override
    public Optional<Comment> get(int id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Comment create(Comment toCreate) {
        storage.put(toCreate.getId(), toCreate);
        return storage.get(toCreate.getId());
    }

    @Override
    public Comment update(int id, Comment updated) {
        storage.put(id, updated);
        return storage.get(id);
    }

    @Override
    public boolean delete(int id) {
        return storage.remove(id) != null;
    }

    @Override
    public boolean exists(int id) {
        return storage.containsKey(id);
    }

    @Override
    public List<Comment> findAllByCritiqueId(int critiqueId) {
        return storage.values()
                .stream()
                .filter(comment -> comment.getCritique().getId() == critiqueId)
                .toList();
    }

    @Override
    public List<Comment> findAllByUserId(int userId) {
        return storage.values()
                .stream()
                .filter(comment -> comment.getWriter().getId() == userId)
                .toList();
    }
}
