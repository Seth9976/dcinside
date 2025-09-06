package bolts;

public class i extends RuntimeException {
    public i(Exception exception0) {
        super("An exception was thrown by an Executor", exception0);
    }
}

