package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class f implements m {
    @l
    private final m a;
    @l
    private final Function1 b;

    public f(@l m m0, @l Function1 function10) {
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
            final f d;

            a(f f0) {
                this.d = f0;
                super();
                this.a = f0.a.iterator();
                this.b = -1;
            }

            private final void a() {
                while(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    if(!((Boolean)this.d.b.invoke(object0)).booleanValue()) {
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

            public final int b() {
                return this.b;
            }

            public final Iterator c() {
                return this.a;
            }

            public final Object d() {
                return this.c;
            }

            public final void f(int v) {
                this.b = v;
            }

            public final void g(Object object0) {
                this.c = object0;
            }

            @Override
            public boolean hasNext() {
                if(this.b == -1) {
                    this.a();
                }
                return this.b == 1 || this.a.hasNext();
            }

            @Override
            public Object next() {
                if(this.b == -1) {
                    this.a();
                }
                if(this.b == 1) {
                    Object object0 = this.c;
                    this.c = null;
                    this.b = 0;
                    return object0;
                }
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

