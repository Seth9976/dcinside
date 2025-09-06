package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class d implements e, m {
    @l
    private final m a;
    private final int b;

    public d(@l m m0, int v) {
        L.p(m0, "sequence");
        super();
        this.a = m0;
        this.b = v;
        if(v < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + v + '.').toString());
        }
    }

    @Override  // kotlin.sequences.e
    @l
    public m a(int v) {
        int v1 = this.b + v;
        return v1 >= 0 ? new d(this.a, v1) : new d(this, v);
    }

    @Override  // kotlin.sequences.e
    @l
    public m b(int v) {
        int v1 = this.b;
        int v2 = v1 + v;
        return v2 < 0 ? new w(this, v) : new v(this.a, v1, v2);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;

            a(d d0) {
                this.a = d0.a.iterator();
                this.b = d0.b;
            }

            private final void a() {
                while(this.b > 0 && this.a.hasNext()) {
                    this.a.next();
                    --this.b;
                }
            }

            public final Iterator b() {
                return this.a;
            }

            public final int c() {
                return this.b;
            }

            public final void d(int v) {
                this.b = v;
            }

            @Override
            public boolean hasNext() {
                this.a();
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                this.a();
                return this.a.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

