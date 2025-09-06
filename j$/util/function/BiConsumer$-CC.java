package j$.util.function;

import j..util.Objects;
import j..util.concurrent.t;
import java.util.function.BiConsumer;

public final class BiConsumer.-CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer0, BiConsumer biConsumer1) {
        Objects.requireNonNull(biConsumer1);
        return new t(1, biConsumer0, biConsumer1);
    }
}

