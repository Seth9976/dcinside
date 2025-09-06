package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.L;
import y4.l;

final class h0 extends f {
    @l
    private final List a;

    public h0(@l List list0) {
        L.p(list0, "delegate");
        super();
        this.a = list0;
    }

    @Override  // kotlin.collections.f
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.f
    public void add(int v, Object object0) {
        int v1 = C.e1(this, v);
        this.a.add(v1, object0);
    }

    @Override  // kotlin.collections.f
    public Object b(int v) {
        int v1 = C.c1(this, v);
        return this.a.remove(v1);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object get(int v) {
        int v1 = C.c1(this, v);
        return this.a.get(v1);
    }

    @Override
    @l
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    @l
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        public static final class a implements B3.f, ListIterator {
            private final ListIterator a;
            final h0 b;

            a(h0 h00, int v) {
                this.b = h00;
                super();
                this.a = h00.a.listIterator(C.e1(h00, v));
            }

            public final ListIterator a() {
                return this.a;
            }

            @Override
            public void add(Object object0) {
                this.a.add(object0);
                this.a.previous();
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
                this.a.remove();
            }

            @Override
            public void set(Object object0) {
                this.a.set(object0);
            }
        }

        return new a(this, v);
    }

    @Override  // kotlin.collections.f
    public Object set(int v, Object object0) {
        int v1 = C.c1(this, v);
        return this.a.set(v1, object0);
    }
}

