package java.util.function;

public interface Function {
    Function andThen(Function arg1);

    Object apply(Object arg1);
}

