package j$.util;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Consumer;

final class k implements z, Iterator {
    public final int a;
    private final Iterator b;

    public k(l l0) {
        this.a = 0;
        super();
        this.b = l0.a.iterator();
    }

    public k(r r0) {
        this.a = 1;
        super();
        this.b = r0.a.iterator();
    }

    @Override  // j$.util.z
    public final void forEachRemaining(Consumer consumer0) {
        if(this.a != 0) {
            o o0 = new o(consumer0);
            P.q(this.b, o0);
            return;
        }
        P.q(this.b, consumer0);
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public final Object next() {
        if(this.a != 0) {
            Object object0 = this.b.next();
            return new p(((Map.Entry)object0));
        }
        return this.b.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

