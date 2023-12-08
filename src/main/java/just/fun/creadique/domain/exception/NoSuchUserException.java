package just.fun.creadique.domain.exception;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(int id) {
        super("User with id: " + id + " does not exist!!!");
    }
}
