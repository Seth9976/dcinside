package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.LongConsumer;

final class h3 extends i3 implements LongConsumer {
    final long[] c;

    h3(int v) {
        this.c = new long[v];
    }

    @Override
    public final void accept(long v) {
        int v1 = this.b;
        this.b = v1 + 1;
        this.c[v1] = v;
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    @Override  // j$.util.stream.i3
    public final void b(Object object0, long v) {
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            ((LongConsumer)object0).accept(this.c[v1]);
        }
    }
}

