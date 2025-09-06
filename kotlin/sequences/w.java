package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class w implements e, m {
    @l
    private final m a;
    private final int b;

    public w(@l m m0, int v) {
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
        int v1 = this.b;
        return v >= v1 ? p.g() : new v(this.a, v, v1);
    }

    @Override  // kotlin.sequences.e
    @l
    public m b(int v) {
        return v < this.b ? new w(this.a, v) : this;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private int a;
            private final Iterator b;

            a(w w0) {
                this.a = w0.b;
                this.b = w0.a.iterator();
            }

            public final Iterator a() {
                return this.b;
            }

            public final int b() {
                return this.a;
            }

            public final void c(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a > 0 && this.b.hasNext();
            }

            @Override
            public Object next() {
                int v = this.a;
                if(v == 0) {
                    throw new NoSuchElementException();
                }
                this.a = v - 1;
                return this.b.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

