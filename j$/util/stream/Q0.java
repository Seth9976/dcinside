package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.IntConsumer;

final class q0 extends t0 implements l2 {
    @Override  // j$.util.stream.t0, j$.util.stream.l2
    public final void accept(int v) {
        if(!this.a) {
            throw new NullPointerException();
        }
    }

    @Override
    public final void accept(Object object0) {
        x0.h(this, object0);
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    @Override  // j$.util.stream.l2
    public final void m(Integer integer0) {
        x0.g(this, integer0);
    }
}

