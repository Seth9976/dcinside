package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.L;
import y4.l;

class i0 extends c {
    @l
    private final List c;

    public i0(@l List list0) {
        L.p(list0, "delegate");
        super();
        this.c = list0;
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.c.size();
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        int v1 = C.c1(this, v);
        return this.c.get(v1);
    }

    @Override  // kotlin.collections.c
    @l
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Override  // kotlin.collections.c
    @l
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override  // kotlin.collections.c
    @l
    public ListIterator listIterator(int v) {
        public static final class a implements B3.a, ListIterator {
            private final ListIterator a;
            final i0 b;

            a(i0 i00, int v) {
                this.b = i00;
                super();
                this.a = i00.c.listIterator(C.e1(i00, v));
            }

            public final ListIterator a() {
                return this.a;
            }

            @Override
            public void add(Object object0) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override
            public boolean hasNext() {
                return this.a.hasPrevious();
            }

            @Override
            public boolean hasPrevious() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.a.previous();
            }

            @Override
            public int nextIndex() {
                int v = this.a.previousIndex();
                return C.d1(this.b, v);
            }

            @Override
            public Object previous() {
                return this.a.next();
            }

            @Override
            public int previousIndex() {
                int v = this.a.nextIndex();
                return C.d1(this.b, v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override
            public void set(Object object0) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this, v);
    }
}

