package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class i implements m {
    static final class a {
        @l
        public static final a a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;

        static {
            a.a = new a();
        }
    }

    @l
    private final m a;
    @l
    private final Function1 b;
    @l
    private final Function1 c;

    public i(@l m m0, @l Function1 function10, @l Function1 function11) {
        L.p(m0, "sequence");
        L.p(function10, "transformer");
        L.p(function11, "iterator");
        super();
        this.a = m0;
        this.b = function10;
        this.c = function11;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class b implements B3.a, Iterator {
            private final Iterator a;
            private Iterator b;
            private int c;
            final i d;

            b(i i0) {
                this.d = i0;
                super();
                this.a = i0.a.iterator();
            }

            private final boolean a() {
                if(this.b != null && this.b.hasNext()) {
                    this.c = 1;
                    return true;
                }
                while(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    Iterator iterator0 = (Iterator)this.d.c.invoke(this.d.b.invoke(object0));
                    if(iterator0.hasNext()) {
                        this.b = iterator0;
                        this.c = 1;
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                this.c = 2;
                this.b = null;
                return false;
            }

            public final Iterator b() {
                return this.b;
            }

            public final Iterator c() {
                return this.a;
            }

            public final int d() {
                return this.c;
            }

            public final void f(Iterator iterator0) {
                this.b = iterator0;
            }

            public final void g(int v) {
                this.c = v;
            }

            @Override
            public boolean hasNext() {
                int v = this.c;
                if(v == 1) {
                    return true;
                }
                return v == 2 ? false : this.a();
            }

            @Override
            public Object next() {
                switch(this.c) {
                    case 0: {
                        if(!this.a()) {
                            throw new NoSuchElementException();
                        }
                        break;
                    }
                    case 2: {
                        throw new NoSuchElementException();
                    }
                }
                this.c = 0;
                Iterator iterator0 = this.b;
                L.m(iterator0);
                return iterator0.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new b(this);
    }
}

