package j$.util.function;

import j..util.Objects;
import j..util.concurrent.t;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class BiFunction.-CC {
    public static BiFunction $default$andThen(BiFunction biFunction0, Function function0) {
        Objects.requireNonNull(function0);
        return new t(biFunction0, function0);
    }
}

