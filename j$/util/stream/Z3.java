package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.Z;
import java.util.function.Consumer;

final class z3 extends A3 implements Z {
    @Override  // j$.util.stream.C3
    protected final Spliterator a(Spliterator spliterator0, long v, long v1, long v2, long v3) {
        return new z3(((Z)spliterator0), v, v1, v2, v3);  // 初始化器: Lj$/util/stream/C3;-><init>(Lj$/util/Spliterator;JJJJ)V
    }

    @Override  // j$.util.stream.A3
    protected final Object b() {
        return new G0(1);
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }
}

