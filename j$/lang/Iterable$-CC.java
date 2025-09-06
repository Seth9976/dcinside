package j$.lang;

import j..util.Objects;
import java.util.function.Consumer;

public final class Iterable.-CC {
    public static void $default$forEach(Iterable iterable0, Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        for(Object object0: iterable0) {
            consumer0.accept(object0);
        }
    }
}

