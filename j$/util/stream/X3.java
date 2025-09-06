package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.T;
import java.util.function.Consumer;

final class x3 extends A3 implements T {
    @Override  // j$.util.stream.C3
    protected final Spliterator a(Spliterator spliterator0, long v, long v1, long v2, long v3) {
        return new x3(((T)spliterator0), v, v1, v2, v3);  // 初始化器: Lj$/util/stream/C3;-><init>(Lj$/util/Spliterator;JJJJ)V
    }

    @Override  // j$.util.stream.A3
    protected final Object b() {
        return new C0(1);
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.f(this, consumer0);
    }
}

