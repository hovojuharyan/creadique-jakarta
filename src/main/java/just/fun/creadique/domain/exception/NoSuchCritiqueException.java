package just.fun.creadique.domain.exception;

public class NoSuchCritiqueException extends RuntimeException {
    public NoSuchCritiqueException(int id) {
        super("Critique with id: " + id + " does not exist!!!");
    }
}
