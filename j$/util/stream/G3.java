package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.IntConsumer;

final class g3 extends i3 implements IntConsumer {
    final int[] c;

    g3(int v) {
        this.c = new int[v];
    }

    @Override
    public final void accept(int v) {
        int v1 = this.b;
        this.b = v1 + 1;
        this.c[v1] = v;
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    @Override  // j$.util.stream.i3
    public final void b(Object object0, long v) {
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            ((IntConsumer)object0).accept(this.c[v1]);
        }
    }
}

