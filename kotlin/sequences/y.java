package kotlin.sequences;

import A3.o;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class y implements m {
    @l
    private final m a;
    @l
    private final o b;

    public y(@l m m0, @l o o0) {
        L.p(m0, "sequence");
        L.p(o0, "transformer");
        super();
        this.a = m0;
        this.b = o0;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;
            final y c;

            a(y y0) {
                this.c = y0;
                super();
                this.a = y0.a.iterator();
            }

            public final int a() {
                return this.b;
            }

            public final Iterator b() {
                return this.a;
            }

            public final void c(int v) {
                this.b = v;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                o o0 = this.c.b;
                int v = this.b;
                this.b = v + 1;
                if(v < 0) {
                    u.Z();
                }
                Object object0 = this.a.next();
                return o0.invoke(v, object0);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

