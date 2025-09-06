package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class h implements m {
    @l
    private final m a;
    private final boolean b;
    @l
    private final Function1 c;

    public h(@l m m0, boolean z, @l Function1 function10) {
        L.p(m0, "sequence");
        L.p(function10, "predicate");
        super();
        this.a = m0;
        this.b = z;
        this.c = function10;
    }

    public h(m m0, boolean z, Function1 function10, int v, w w0) {
        if((v & 2) != 0) {
            z = true;
        }
        this(m0, z, function10);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;
            private Object c;
            final h d;

            a(h h0) {
                this.d = h0;
                super();
                this.a = h0.a.iterator();
                this.b = -1;
            }

            private final void a() {
                while(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    if(((Boolean)this.d.c.invoke(object0)).booleanValue() == this.d.b) {
                        this.c = object0;
                        this.b = 1;
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                this.b = 0;
            }

            public final Iterator b() {
                return this.a;
            }

            public final Object c() {
                return this.c;
            }

            public final int d() {
                return this.b;
            }

            public final void f(Object object0) {
                this.c = object0;
            }

            public final void g(int v) {
                this.b = v;
            }

            @Override
            public boolean hasNext() {
                if(this.b == -1) {
                    this.a();
                }
                return this.b == 1;
            }

            @Override
            public Object next() {
                if(this.b == -1) {
                    this.a();
                }
                if(this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object object0 = this.c;
                this.c = null;
                this.b = -1;
                return object0;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

