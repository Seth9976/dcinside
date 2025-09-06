package kotlin.sequences;

import A3.o;
import java.util.Iterator;
import kotlin.jvm.internal.L;

public final class l implements m {
    @y4.l
    private final m a;
    @y4.l
    private final m b;
    @y4.l
    private final o c;

    public l(@y4.l m m0, @y4.l m m1, @y4.l o o0) {
        L.p(m0, "sequence1");
        L.p(m1, "sequence2");
        L.p(o0, "transform");
        super();
        this.a = m0;
        this.b = m1;
        this.c = o0;
    }

    @Override  // kotlin.sequences.m
    @y4.l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private final Iterator b;
            final l c;

            a(l l0) {
                this.c = l0;
                super();
                this.a = l0.a.iterator();
                this.b = l0.b.iterator();
            }

            public final Iterator a() {
                return this.a;
            }

            public final Iterator b() {
                return this.b;
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean hasNext() {
                return this.a.hasNext() && this.b.hasNext();
            }

            @Override
            public Object next() {
                o o0 = this.c.c;
                Object object0 = this.a.next();
                Object object1 = this.b.next();
                return o0.invoke(object0, object1);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

