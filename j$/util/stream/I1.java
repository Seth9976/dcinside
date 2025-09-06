package j$.util.stream;

import j..util.P;
import j..util.T;
import java.util.function.Consumer;

final class i1 extends l1 implements T {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.f(this, consumer0);
    }
}

