package j$.util.stream;

import j..util.Spliterator;
import j..util.T;
import java.util.function.IntFunction;

final class d4 extends C {
    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        return (J0)new j4(this, b0, spliterator0, intFunction0).invoke();
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        return c3.ORDERED.q(b0.K()) ? this.P(b0, spliterator0, new W(24)).spliterator() : new k4(((T)b0.Y(spliterator0)), 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        n2 n21 = new c4(n20);  // 初始化器: Lj$/util/stream/g2;-><init>(Lj$/util/stream/n2;)V
        n21.b = true;
        return n21;
    }
}

