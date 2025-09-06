package kotlin.collections.builders;

import B3.e;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.c;
import kotlin.collections.f;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class b extends f implements e, Serializable, List, RandomAccess {
    public static final class a extends f implements e, Serializable, List, RandomAccess {
        @s0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
        static final class kotlin.collections.builders.b.a.a implements B3.f, ListIterator {
            @l
            private final a a;
            private int b;
            private int c;
            private int d;

            public kotlin.collections.builders.b.a.a(@l a b$a0, int v) {
                L.p(b$a0, "list");
                super();
                this.a = b$a0;
                this.b = v;
                this.c = -1;
                this.d = b$a0.modCount;
            }

            private final void a() {
                if(this.a.e.modCount != this.d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override
            public void add(Object object0) {
                this.a();
                int v = this.b;
                this.b = v + 1;
                this.a.add(v, object0);
                this.c = -1;
                this.d = this.a.modCount;
            }

            @Override
            public boolean hasNext() {
                return this.b < this.a.c;
            }

            @Override
            public boolean hasPrevious() {
                return this.b > 0;
            }

            @Override
            public Object next() {
                this.a();
                if(this.b >= this.a.c) {
                    throw new NoSuchElementException();
                }
                int v = this.b;
                this.b = v + 1;
                this.c = v;
                return this.a.a[this.a.b + this.c];
            }

            @Override
            public int nextIndex() {
                return this.b;
            }

            @Override
            public Object previous() {
                this.a();
                int v = this.b;
                if(v <= 0) {
                    throw new NoSuchElementException();
                }
                this.b = v - 1;
                this.c = v - 1;
                return this.a.a[this.a.b + this.c];
            }

            @Override
            public int previousIndex() {
                return this.b - 1;
            }

            @Override
            public void remove() {
                this.a();
                int v = this.c;
                if(v == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.a.remove(v);
                this.b = this.c;
                this.c = -1;
                this.d = this.a.modCount;
            }

            @Override
            public void set(Object object0) {
                this.a();
                int v = this.c;
                if(v == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.a.set(v, object0);
            }
        }

        @l
        private Object[] a;
        private final int b;
        private int c;
        @m
        private final a d;
        @l
        private final b e;

        public a(@l Object[] arr_object, int v, int v1, @m a b$a0, @l b b0) {
            L.p(arr_object, "backing");
            L.p(b0, "root");
            super();
            this.a = arr_object;
            this.b = v;
            this.c = v1;
            this.d = b$a0;
            this.e = b0;
            this.modCount = b0.modCount;
        }

        @Override  // kotlin.collections.f
        public int a() {
            this.l();
            return this.c;
        }

        @Override  // kotlin.collections.f
        public void add(int v, Object object0) {
            this.m();
            this.l();
            c.a.c(v, this.c);
            this.k(this.b + v, object0);
        }

        @Override
        public boolean add(Object object0) {
            this.m();
            this.l();
            this.k(this.b + this.c, object0);
            return true;
        }

        @Override
        public boolean addAll(int v, @l Collection collection0) {
            L.p(collection0, "elements");
            this.m();
            this.l();
            c.a.c(v, this.c);
            int v1 = collection0.size();
            this.j(this.b + v, collection0, v1);
            return v1 > 0;
        }

        @Override
        public boolean addAll(@l Collection collection0) {
            L.p(collection0, "elements");
            this.m();
            this.l();
            int v = collection0.size();
            this.j(this.b + this.c, collection0, v);
            return v > 0;
        }

        @Override  // kotlin.collections.f
        public Object b(int v) {
            this.m();
            this.l();
            c.a.b(v, this.c);
            return this.r(this.b + v);
        }

        @Override
        public void clear() {
            this.m();
            this.l();
            this.u(this.b, this.c);
        }

        @Override
        public boolean equals(@m Object object0) {
            this.l();
            return object0 == this || object0 instanceof List && this.o(((List)object0));
        }

        @Override
        public Object get(int v) {
            this.l();
            c.a.b(v, this.c);
            return this.a[this.b + v];
        }

        @Override
        public int hashCode() {
            this.l();
            return kotlin.collections.builders.c.i(this.a, this.b, this.c);
        }

        @Override
        public int indexOf(Object object0) {
            this.l();
            for(int v = 0; v < this.c; ++v) {
                if(L.g(this.a[this.b + v], object0)) {
                    return v;
                }
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            this.l();
            return this.c == 0;
        }

        @Override
        @l
        public Iterator iterator() {
            return this.listIterator(0);
        }

        private final void j(int v, Collection collection0, int v1) {
            this.q();
            a b$a0 = this.d;
            if(b$a0 == null) {
                this.e.o(v, collection0, v1);
            }
            else {
                b$a0.j(v, collection0, v1);
            }
            this.a = this.e.a;
            this.c += v1;
        }

        private final void k(int v, Object object0) {
            this.q();
            a b$a0 = this.d;
            if(b$a0 == null) {
                this.e.p(v, object0);
            }
            else {
                b$a0.k(v, object0);
            }
            this.a = this.e.a;
            ++this.c;
        }

        private final void l() {
            if(this.e.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public int lastIndexOf(Object object0) {
            this.l();
            for(int v = this.c - 1; v >= 0; --v) {
                if(L.g(this.a[this.b + v], object0)) {
                    return v;
                }
            }
            return -1;
        }

        @Override
        @l
        public ListIterator listIterator() {
            return this.listIterator(0);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            this.l();
            c.a.c(v, this.c);
            return new kotlin.collections.builders.b.a.a(this, v);
        }

        private final void m() {
            if(this.p()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean o(List list0) {
            return kotlin.collections.builders.c.h(this.a, this.b, this.c, list0);
        }

        private final boolean p() {
            return this.e.c;
        }

        private final void q() {
            ++this.modCount;
        }

        private final Object r(int v) {
            this.q();
            Object object0 = this.d == null ? this.e.B(v) : this.d.r(v);
            --this.c;
            return object0;
        }

        @Override
        public boolean remove(Object object0) {
            this.m();
            this.l();
            int v = this.indexOf(object0);
            if(v >= 0) {
                this.remove(v);
            }
            return v >= 0;
        }

        @Override
        public boolean removeAll(@l Collection collection0) {
            L.p(collection0, "elements");
            this.m();
            this.l();
            return this.x(this.b, this.c, collection0, false) > 0;
        }

        @Override
        public boolean retainAll(@l Collection collection0) {
            L.p(collection0, "elements");
            this.m();
            this.l();
            return this.x(this.b, this.c, collection0, true) > 0;
        }

        @Override  // kotlin.collections.f
        public Object set(int v, Object object0) {
            this.m();
            this.l();
            c.a.b(v, this.c);
            Object[] arr_object = this.a;
            Object object1 = arr_object[this.b + v];
            arr_object[this.b + v] = object0;
            return object1;
        }

        @Override
        @l
        public List subList(int v, int v1) {
            c.a.d(v, v1, this.c);
            return new a(this.a, this.b + v, v1 - v, this, this.e);
        }

        @Override
        @l
        public Object[] toArray() {
            this.l();
            return kotlin.collections.l.l1(this.a, this.b, this.c + this.b);
        }

        @Override
        @l
        public Object[] toArray(@l Object[] arr_object) {
            L.p(arr_object, "array");
            this.l();
            int v = this.c;
            if(arr_object.length < v) {
                Object[] arr_object1 = this.a;
                Class class0 = arr_object.getClass();
                Object[] arr_object2 = Arrays.copyOfRange(arr_object1, this.b, v + this.b, class0);
                L.o(arr_object2, "copyOfRange(...)");
                return arr_object2;
            }
            kotlin.collections.l.B0(this.a, arr_object, 0, this.b, v + this.b);
            return u.n(this.c, arr_object);
        }

        @Override
        @l
        public String toString() {
            this.l();
            return kotlin.collections.builders.c.j(this.a, this.b, this.c, this);
        }

        private final void u(int v, int v1) {
            if(v1 > 0) {
                this.q();
            }
            a b$a0 = this.d;
            if(b$a0 == null) {
                this.e.C(v, v1);
            }
            else {
                b$a0.u(v, v1);
            }
            this.c -= v1;
        }

        private final int x(int v, int v1, Collection collection0, boolean z) {
            int v2 = this.d == null ? this.e.D(v, v1, collection0, z) : this.d.x(v, v1, collection0, z);
            if(v2 > 0) {
                this.q();
            }
            this.c -= v2;
            return v2;
        }

        private final Object y() {
            if(!this.p()) {
                throw new NotSerializableException("The list cannot be serialized while it is being built.");
            }
            return new h(this, 0);
        }
    }

    static final class kotlin.collections.builders.b.b {
        private kotlin.collections.builders.b.b() {
        }

        public kotlin.collections.builders.b.b(w w0) {
        }
    }

    @s0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
    static final class kotlin.collections.builders.b.c implements B3.f, ListIterator {
        @l
        private final b a;
        private int b;
        private int c;
        private int d;

        public kotlin.collections.builders.b.c(@l b b0, int v) {
            L.p(b0, "list");
            super();
            this.a = b0;
            this.b = v;
            this.c = -1;
            this.d = b0.modCount;
        }

        private final void a() {
            if(this.a.modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public void add(Object object0) {
            this.a();
            int v = this.b;
            this.b = v + 1;
            this.a.add(v, object0);
            this.c = -1;
            this.d = this.a.modCount;
        }

        @Override
        public boolean hasNext() {
            return this.b < this.a.b;
        }

        @Override
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override
        public Object next() {
            this.a();
            if(this.b >= this.a.b) {
                throw new NoSuchElementException();
            }
            int v = this.b;
            this.b = v + 1;
            this.c = v;
            return this.a.a[this.c];
        }

        @Override
        public int nextIndex() {
            return this.b;
        }

        @Override
        public Object previous() {
            this.a();
            int v = this.b;
            if(v <= 0) {
                throw new NoSuchElementException();
            }
            this.b = v - 1;
            this.c = v - 1;
            return this.a.a[this.c];
        }

        @Override
        public int previousIndex() {
            return this.b - 1;
        }

        @Override
        public void remove() {
            this.a();
            int v = this.c;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.a.remove(v);
            this.b = this.c;
            this.c = -1;
            this.d = this.a.modCount;
        }

        @Override
        public void set(Object object0) {
            this.a();
            int v = this.c;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.a.set(v, object0);
        }
    }

    @l
    private Object[] a;
    private int b;
    private boolean c;
    @l
    private static final kotlin.collections.builders.b.b d;
    @l
    private static final b e;

    static {
        b.d = new kotlin.collections.builders.b.b(null);
        b b0 = new b(0);
        b0.c = true;
        b.e = b0;
    }

    public b() {
        this(0, 1, null);
    }

    public b(int v) {
        this.a = kotlin.collections.builders.c.d(v);
    }

    public b(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    private final void A() {
        ++this.modCount;
    }

    private final Object B(int v) {
        this.A();
        Object[] arr_object = this.a;
        Object object0 = arr_object[v];
        kotlin.collections.l.B0(arr_object, arr_object, v, v + 1, this.b);
        kotlin.collections.builders.c.f(this.a, this.b - 1);
        --this.b;
        return object0;
    }

    private final void C(int v, int v1) {
        if(v1 > 0) {
            this.A();
        }
        kotlin.collections.l.B0(this.a, this.a, v, v + v1, this.b);
        kotlin.collections.builders.c.g(this.a, this.b - v1, this.b);
        this.b -= v1;
    }

    private final int D(int v, int v1, Collection collection0, boolean z) {
        int v2 = 0;
        int v3 = 0;
        while(v2 < v1) {
            int v4 = v + v2;
            if(collection0.contains(this.a[v4]) == z) {
                ++v2;
                this.a[v3 + v] = this.a[v4];
                ++v3;
            }
            else {
                ++v2;
            }
        }
        int v5 = v1 - v3;
        kotlin.collections.l.B0(this.a, this.a, v + v3, v1 + v, this.b);
        kotlin.collections.builders.c.g(this.a, this.b - v5, this.b);
        if(v5 > 0) {
            this.A();
        }
        this.b -= v5;
        return v5;
    }

    private final Object E() {
        if(!this.c) {
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }
        return new h(this, 0);
    }

    @Override  // kotlin.collections.f
    public int a() {
        return this.b;
    }

    @Override  // kotlin.collections.f
    public void add(int v, Object object0) {
        this.r();
        c.a.c(v, this.b);
        this.p(v, object0);
    }

    @Override
    public boolean add(Object object0) {
        this.r();
        this.p(this.b, object0);
        return true;
    }

    @Override
    public boolean addAll(int v, @l Collection collection0) {
        L.p(collection0, "elements");
        this.r();
        c.a.c(v, this.b);
        int v1 = collection0.size();
        this.o(v, collection0, v1);
        return v1 > 0;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.r();
        int v = collection0.size();
        this.o(this.b, collection0, v);
        return v > 0;
    }

    @Override  // kotlin.collections.f
    public Object b(int v) {
        this.r();
        c.a.b(v, this.b);
        return this.B(v);
    }

    @Override
    public void clear() {
        this.r();
        this.C(0, this.b);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof List && this.u(((List)object0));
    }

    @Override
    public Object get(int v) {
        c.a.b(v, this.b);
        return this.a[v];
    }

    @Override
    public int hashCode() {
        return kotlin.collections.builders.c.i(this.a, 0, this.b);
    }

    @Override
    public int indexOf(Object object0) {
        for(int v = 0; v < this.b; ++v) {
            if(L.g(this.a[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.b == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        for(int v = this.b - 1; v >= 0; --v) {
            if(L.g(this.a[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    @l
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        c.a.c(v, this.b);
        return new kotlin.collections.builders.b.c(this, v);
    }

    private final void o(int v, Collection collection0, int v1) {
        this.A();
        this.z(v, v1);
        Iterator iterator0 = collection0.iterator();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object[] arr_object = this.a;
            Object object0 = iterator0.next();
            arr_object[v + v2] = object0;
        }
    }

    private final void p(int v, Object object0) {
        this.A();
        this.z(v, 1);
        this.a[v] = object0;
    }

    @l
    public final List q() {
        this.r();
        this.c = true;
        return this.b <= 0 ? b.e : this;
    }

    private final void r() {
        if(this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean remove(Object object0) {
        this.r();
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
        }
        return v >= 0;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.r();
        return this.D(0, this.b, collection0, false) > 0;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.r();
        return this.D(0, this.b, collection0, true) > 0;
    }

    @Override  // kotlin.collections.f
    public Object set(int v, Object object0) {
        this.r();
        c.a.b(v, this.b);
        Object[] arr_object = this.a;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    @Override
    @l
    public List subList(int v, int v1) {
        c.a.d(v, v1, this.b);
        return new a(this.a, v, v1 - v, null, this);
    }

    @Override
    @l
    public Object[] toArray() {
        return kotlin.collections.l.l1(this.a, 0, this.b);
    }

    @Override
    @l
    public Object[] toArray(@l Object[] arr_object) {
        L.p(arr_object, "array");
        int v = this.b;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOfRange(this.a, 0, v, arr_object.getClass());
            L.o(arr_object1, "copyOfRange(...)");
            return arr_object1;
        }
        kotlin.collections.l.B0(this.a, arr_object, 0, 0, v);
        return u.n(this.b, arr_object);
    }

    @Override
    @l
    public String toString() {
        return kotlin.collections.builders.c.j(this.a, 0, this.b, this);
    }

    private final boolean u(List list0) {
        return kotlin.collections.builders.c.h(this.a, 0, this.b, list0);
    }

    private final void x(int v) {
        if(v < 0) {
            throw new OutOfMemoryError();
        }
        Object[] arr_object = this.a;
        if(v > arr_object.length) {
            this.a = kotlin.collections.builders.c.e(this.a, c.a.e(arr_object.length, v));
        }
    }

    private final void y(int v) {
        this.x(this.b + v);
    }

    private final void z(int v, int v1) {
        this.y(v1);
        kotlin.collections.l.B0(this.a, this.a, v + v1, v, this.b);
        this.b += v1;
    }
}

