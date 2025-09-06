package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.LongConsumer;

final class r0 extends t0 implements m2 {
    @Override  // j$.util.stream.t0, j$.util.stream.m2
    public final void accept(long v) {
        if(!this.a) {
            throw new NullPointerException();
        }
    }

    @Override
    public final void accept(Object object0) {
        x0.j(this, object0);
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    @Override  // j$.util.stream.m2
    public final void j(Long long0) {
        x0.i(this, long0);
    }
}

