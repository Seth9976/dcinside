package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.DoubleConsumer;

final class f3 extends i3 implements DoubleConsumer {
    final double[] c;

    f3(int v) {
        this.c = new double[v];
    }

    @Override
    public final void accept(double f) {
        int v = this.b;
        this.b = v + 1;
        this.c[v] = f;
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    @Override  // j$.util.stream.i3
    final void b(Object object0, long v) {
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            ((DoubleConsumer)object0).accept(this.c[v1]);
        }
    }
}

