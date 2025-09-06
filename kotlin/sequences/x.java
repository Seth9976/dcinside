package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class x implements m {
    @l
    private final m a;
    @l
    private final Function1 b;

    public x(@l m m0, @l Function1 function10) {
        L.p(m0, "sequence");
        L.p(function10, "predicate");
        super();
        this.a = m0;
        this.b = function10;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            private int b;
            private Object c;
            final x d;

            a(x x0) {
                this.d = x0;
                super();
                this.a = x0.a.iterator();
                this.b = -1;
            }

            private final void a() {
                if(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    if(((Boolean)this.d.b.invoke(object0)).booleanValue()) {
                        this.b = 1;
                        this.c = object0;
                        return;
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

