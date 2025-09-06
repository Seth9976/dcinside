package j$.util.function;

import j..com.android.tools.r8.a;
import java.util.function.LongConsumer;

public final class f implements LongConsumer {
    public final LongConsumer a;
    public final LongConsumer b;

    public f(LongConsumer longConsumer0, LongConsumer longConsumer1) {
        this.a = longConsumer0;
        this.b = longConsumer1;
    }

    @Override
    public final void accept(long v) {
        this.a.accept(v);
        this.b.accept(v);
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }
}

