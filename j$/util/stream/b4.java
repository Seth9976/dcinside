package j$.util.stream;

import j..util.Spliterator;
import j..util.Z;
import java.util.function.IntFunction;

final class b4 extends k0 implements g4 {
    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        return (J0)new i4(this, b0, spliterator0, intFunction0).invoke();
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        return c3.ORDERED.q(b0.K()) ? this.P(b0, spliterator0, new W(23)).spliterator() : new m4(((Z)b0.Y(spliterator0)), 0);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        return new a4(this, n20, false);
    }

    @Override  // j$.util.stream.g4
    public final h4 j(B0 b00, boolean z) {
        return new a4(this, b00, z);
    }
}

