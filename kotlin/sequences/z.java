package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class z implements m {
    @l
    private final m a;
    @l
    private final Function1 b;

    public z(@l m m0, @l Function1 function10) {
        L.p(m0, "sequence");
        L.p(function10, "transformer");
        super();
        this.a = m0;
        this.b = function10;
    }

    @l
    public final m e(@l Function1 function10) {
        L.p(function10, "iterator");
        return new i(this.a, this.b, function10);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private final Iterator a;
            final z b;

            a(z z0) {
                this.b = z0;
                super();
                this.a = z0.a.iterator();
            }

            public final Iterator a() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                Function1 function10 = this.b.b;
                Object object0 = this.a.next();
                return function10.invoke(object0);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

