package just.fun.creadique.domain.exception;

public class NoSuchCommentException extends RuntimeException {
    public NoSuchCommentException(int id) {
        super("Comment with id: " + id + " does not exist!!!");
    }
}
