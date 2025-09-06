package j$.util.stream;

import j..util.Spliterator;
import j..util.T;
import java.util.function.IntFunction;

final class f4 extends C implements g4 {
    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        return (J0)new i4(this, b0, spliterator0, intFunction0).invoke();
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        return c3.ORDERED.q(b0.K()) ? this.P(b0, spliterator0, new W(25)).spliterator() : new k4(((T)b0.Y(spliterator0)), 0);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        return new e4(this, n20, false);
    }

    @Override  // j$.util.stream.g4
    public final h4 j(B0 b00, boolean z) {
        return new e4(this, b00, z);
    }
}

