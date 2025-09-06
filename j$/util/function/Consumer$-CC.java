package j$.util.function;

import j..util.Objects;
import j..util.concurrent.t;
import java.util.function.Consumer;

public final class Consumer.-CC {
    public static Consumer $default$andThen(Consumer consumer0, Consumer consumer1) {
        Objects.requireNonNull(consumer1);
        return new t(3, consumer0, consumer1);
    }
}

