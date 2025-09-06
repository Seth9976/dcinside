package kotlin.streams.jdk8;

import java.util.function.Supplier;
import kotlin.sequences.m;

public final class a implements Supplier {
    public final m a;

    public a(m m0) {
        this.a = m0;
    }

    @Override
    public final Object get() {
        return b.g(this.a);
    }
}

