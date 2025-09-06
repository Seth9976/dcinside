package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.LongConsumer;

public final class e0 implements LongConsumer {
    public final n2 a;

    public e0(n2 n20) {
        this.a = n20;
    }

    @Override
    public final void accept(long v) {
        this.a.accept(v);
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }
}

