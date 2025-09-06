package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class v implements e, m {
    @l
    private final m a;
    private final int b;
    private final int c;

    public v(@l m m0, int v, int v1) {
        L.p(m0, "sequence");
        super();
        this.a = m0;
        this.b = v;
        this.c = v1;
        if(v < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + v).toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + v1).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + v1 + " < " + v).toString());
        }
    }

    @Override  // kotlin.sequences.e
    @l
    public m a(int v) {
        return v >= this.f() ? p.g() : new v(this.a, this.b + v, this.c);
    }

    @Override  // kotlin.sequences.e
    @l
    public m b(int v) {
        return v < this.f() ? new v(this.a, this.b, v + this.b) : this;
    }

    private final int f() {
        return this.c - this.b;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;
            final v c;

            a(v v0) {
                this.c = v0;
                super();
                this.a = v0.a.iterator();
            }

            private final void a() {
                while(this.b < this.c.b && this.a.hasNext()) {
                    this.a.next();
                    ++this.b;
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
                return this.b < this.c.c && this.a.hasNext();
            }

            @Override
            public Object next() {
                this.a();
                if(this.b >= this.c.c) {
                    throw new NoSuchElementException();
                }
                ++this.b;
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

