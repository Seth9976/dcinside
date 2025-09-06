package j$.util.stream;

import j..util.P;
import j..util.W;
import java.util.function.Consumer;

final class j1 extends l1 implements W {
    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.b(this, consumer0);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.g(this, consumer0);
    }
}

