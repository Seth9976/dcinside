package j$.util.function;

import j..util.Objects;
import java.util.function.Predicate;

public final class Predicate.-CC {
    public static Predicate $default$and(Predicate predicate0, Predicate predicate1) {
        Objects.requireNonNull(predicate1);
        return new g(predicate0, predicate1, 0);
    }

    public static Predicate $default$negate(Predicate predicate0) {
        return new a(2, predicate0);
    }

    public static Predicate $default$or(Predicate predicate0, Predicate predicate1) {
        Objects.requireNonNull(predicate1);
        return new g(predicate0, predicate1, 1);
    }
}

