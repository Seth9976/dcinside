package kotlin.sequences;

import A3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class j implements m {
    @l
    private final a a;
    @l
    private final Function1 b;

    public j(@l a a0, @l Function1 function10) {
        L.p(a0, "getInitialValue");
        L.p(function10, "getNextValue");
        super();
        this.a = a0;
        this.b = function10;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class kotlin.sequences.j.a implements B3.a, Iterator {
            private Object a;
            private int b;
            final j c;

            kotlin.sequences.j.a(j j0) {
                this.c = j0;
                super();
                this.b = -2;
            }

            private final void a() {
                Object object0;
                if(this.b == -2) {
                    object0 = this.c.a.invoke();
                }
                else {
                    Object object1 = this.a;
                    L.m(object1);
                    object0 = this.c.b.invoke(object1);
                }
                this.a = object0;
                this.b = object0 == null ? 0 : 1;
            }

            public final Object b() {
                return this.a;
            }

            public final int c() {
                return this.b;
            }

            public final void d(Object object0) {
                this.a = object0;
            }

            public final void f(int v) {
                this.b = v;
            }

            @Override
            public boolean hasNext() {
                if(this.b < 0) {
                    this.a();
                }
                return this.b == 1;
            }

            @Override
            public Object next() {
                if(this.b < 0) {
                    this.a();
                }
                if(this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object object0 = this.a;
                L.n(object0, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.b = -1;
                return object0;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new kotlin.sequences.j.a(this);
    }
}

