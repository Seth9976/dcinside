package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.P;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class k implements m {
    @l
    private final m a;

    public k(@l m m0) {
        L.p(m0, "sequence");
        super();
        this.a = m0;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;

            a(k k0) {
                this.a = k0.a.iterator();
            }

            public final int a() {
                return this.b;
            }

            public final Iterator b() {
                return this.a;
            }

            public P c() {
                int v = this.b;
                this.b = v + 1;
                if(v < 0) {
                    u.Z();
                }
                Object object0 = this.a.next();
                return new P(v, object0);
            }

            public final void d(int v) {
                this.b = v;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.c();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

