package j$.util.stream;

import j..util.P;
import j..util.Z;
import java.util.function.Consumer;

final class k1 extends l1 implements Z {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }
}

