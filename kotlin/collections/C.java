package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@h0(version = "1.1")
@s0({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n360#2,7:171\n388#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
public abstract class c extends a implements B3.a, List {
    public static final class kotlin.collections.c.a {
        private kotlin.collections.c.a() {
        }

        public kotlin.collections.c.a(w w0) {
        }

        public final void a(int v, int v1, int v2) {
            if(v < 0 || v1 > v2) {
                throw new IndexOutOfBoundsException("startIndex: " + v + ", endIndex: " + v1 + ", size: " + v2);
            }
            if(v > v1) {
                throw new IllegalArgumentException("startIndex: " + v + " > endIndex: " + v1);
            }
        }

        public final void b(int v, int v1) {
            if(v < 0 || v >= v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void c(int v, int v1) {
            if(v < 0 || v > v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void d(int v, int v1, int v2) {
            if(v < 0 || v1 > v2) {
                throw new IndexOutOfBoundsException("fromIndex: " + v + ", toIndex: " + v1 + ", size: " + v2);
            }
            if(v > v1) {
                throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
            }
        }

        public final int e(int v, int v1) {
            int v2 = v + (v >> 1) - v1 >= 0 ? v + (v >> 1) : v1;
            if(v2 - 0x7FFFFFF7 > 0) {
                return v1 <= 0x7FFFFFF7 ? 0x7FFFFFF7 : 0x7FFFFFFF;
            }
            return v2;
        }

        public final boolean f(@l Collection collection0, @l Collection collection1) {
            L.p(collection0, "c");
            L.p(collection1, "other");
            if(collection0.size() != collection1.size()) {
                return false;
            }
            Iterator iterator0 = collection1.iterator();
            for(Object object0: collection0) {
                Object object1 = iterator0.next();
                if(!L.g(object0, object1)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public final int g(@l Collection collection0) {
            L.p(collection0, "c");
            int v = 1;
            for(Object object0: collection0) {
                v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
            }
            return v;
        }
    }

    class b implements B3.a, Iterator {
        private int a;
        final c b;

        protected final int a() {
            return this.a;
        }

        protected final void b(int v) {
            this.a = v;
        }

        @Override
        public boolean hasNext() {
            return this.a < c.this.size();
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int v = this.a;
            this.a = v + 1;
            return c.this.get(v);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    class kotlin.collections.c.c extends b implements B3.a, ListIterator {
        final c c;

        public kotlin.collections.c.c(int v) {
            c.a.c(v, c0.size());
            this.b(v);
        }

        @Override
        public void add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            return this.a() > 0;
        }

        @Override
        public int nextIndex() {
            return this.a();
        }

        @Override
        public Object previous() {
            if(!this.hasPrevious()) {
                throw new NoSuchElementException();
            }
            this.b(this.a() - 1);
            return c.this.get(this.a());
        }

        @Override
        public int previousIndex() {
            return this.a() - 1;
        }

        @Override
        public void set(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static final class d extends c implements RandomAccess {
        @l
        private final c c;
        private final int d;
        private int e;

        public d(@l c c0, int v, int v1) {
            L.p(c0, "list");
            super();
            this.c = c0;
            this.d = v;
            c.a.d(v, v1, c0.size());
            this.e = v1 - v;
        }

        @Override  // kotlin.collections.c
        public int a() {
            return this.e;
        }

        @Override  // kotlin.collections.c
        public Object get(int v) {
            c.a.b(v, this.e);
            return this.c.get(this.d + v);
        }
    }

    @l
    public static final kotlin.collections.c.a a = null;
    private static final int b = 0x7FFFFFF7;

    static {
        c.a = new kotlin.collections.c.a(null);
    }

    @Override  // kotlin.collections.a
    public abstract int a();

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof List ? c.a.f(this, ((Collection)object0)) : false;
    }

    @Override
    public abstract Object get(int arg1);

    @Override
    public int hashCode() {
        return c.a.g(this);
    }

    @Override
    public int indexOf(Object object0) {
        int v = 0;
        for(Object object1: this) {
            if(!L.g(object1, object0)) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @Override  // kotlin.collections.a
    @l
    public Iterator iterator() {
        return new b(this);
    }

    @Override
    public int lastIndexOf(Object object0) {
        ListIterator listIterator0 = this.listIterator(this.size());
        while(listIterator0.hasPrevious()) {
            if(L.g(listIterator0.previous(), object0)) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    @l
    public ListIterator listIterator() {
        return new kotlin.collections.c.c(this, 0);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        return new kotlin.collections.c.c(this, v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    @l
    public List subList(int v, int v1) {
        return new d(this, v, v1);
    }
}

