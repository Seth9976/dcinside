package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.DoubleConsumer;

final class s0 extends t0 implements k2 {
    @Override  // j$.util.stream.t0, j$.util.stream.k2
    public final void accept(double f) {
        if(!this.a) {
            throw new NullPointerException();
        }
    }

    @Override
    public final void accept(Object object0) {
        x0.f(this, object0);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    @Override  // j$.util.stream.k2
    public final void p(Double double0) {
        x0.e(this, double0);
    }
}

