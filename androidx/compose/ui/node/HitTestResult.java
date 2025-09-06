package androidx.compose.ui.node;

import B3.a;
import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.List.-CC;
import j..util.List;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n194#1:341,2\n*E\n"})
public final class HitTestResult implements a, List, java.util.List {
    final class HitTestResultIterator implements a, ListIterator {
        private int a;
        private final int b;
        private final int c;
        final HitTestResult d;

        public HitTestResultIterator(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        public HitTestResultIterator(int v, int v1, int v2, int v3, w w0) {
            if((v3 & 1) != 0) {
                v = 0;
            }
            if((v3 & 2) != 0) {
                v1 = 0;
            }
            if((v3 & 4) != 0) {
                v2 = hitTestResult0.size();
            }
            this(v, v1, v2);
        }

        public final int a() {
            return this.a;
        }

        @Override
        public void add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public final void d(int v) {
            this.a = v;
        }

        @Override
        public boolean hasNext() {
            return this.a < this.c;
        }

        @Override
        public boolean hasPrevious() {
            return this.a > this.b;
        }

        @Override
        public Object next() {
            Object[] arr_object = HitTestResult.this.a;
            int v = this.a;
            this.a = v + 1;
            return arr_object[v];
        }

        @Override
        public int nextIndex() {
            return this.a - this.b;
        }

        @Override
        public Object previous() {
            int v = this.a - 1;
            this.a = v;
            return HitTestResult.this.a[v];
        }

        @Override
        public int previousIndex() {
            return this.a - this.b - 1;
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

    @s0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n272#1:341,2\n*E\n"})
    final class SubList implements a, List, java.util.List {
        private final int a;
        private final int b;
        final HitTestResult c;

        public SubList(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final int a() {
            return this.b;
        }

        @Override
        public void add(int v, Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int b() {
            return this.a;
        }

        public int c() {
            return this.b - this.a;
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean contains(Object object0) {
            return this.indexOf(object0) != -1;
        }

        @Override
        public boolean containsAll(@l Collection collection0) {
            L.p(collection0, "elements");
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // j$.util.Collection
        public void forEach(Consumer consumer0) {
            Iterable.-CC.$default$forEach(this, consumer0);
        }

        @Override
        public Object get(int v) {
            return HitTestResult.this.a[v + this.a];
        }

        @Override
        public int indexOf(Object object0) {
            int v = this.a;
            int v1 = this.b;
            if(v <= v1) {
                while(true) {
                    if(L.g(HitTestResult.this.a[v], object0)) {
                        return v - this.a;
                    }
                    if(v == v1) {
                        break;
                    }
                    ++v;
                }
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return this.size() == 0;
        }

        @Override
        @l
        public Iterator iterator() {
            return new HitTestResultIterator(HitTestResult.this, this.a, this.a, this.b);
        }

        @Override
        public int lastIndexOf(Object object0) {
            int v = this.b;
            int v1 = this.a;
            if(v1 <= v) {
                while(true) {
                    if(L.g(HitTestResult.this.a[v], object0)) {
                        return v - this.a;
                    }
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            return -1;
        }

        @Override
        @l
        public ListIterator listIterator() {
            return new HitTestResultIterator(HitTestResult.this, this.a, this.a, this.b);
        }

        @Override
        @l
        public ListIterator listIterator(int v) {
            return new HitTestResultIterator(HitTestResult.this, v + this.a, this.a, this.b);
        }

        @Override  // j$.util.Collection
        public Stream parallelStream() {
            return Collection.-CC.$default$parallelStream(this);
        }

        @Override
        public java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(this.parallelStream());
        }

        @Override
        public Object remove(int v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean remove(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean removeAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.Collection
        public boolean removeIf(Predicate predicate0) {
            return Collection.-CC.$default$removeIf(this, predicate0);
        }

        @Override  // j$.util.List
        public void replaceAll(UnaryOperator unaryOperator0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean retainAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object set(int v, Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final int size() {
            return this.c();
        }

        @Override  // j$.util.List
        public void sort(Comparator comparator0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override  // j$.util.List
        public Spliterator spliterator() {
            return List.-CC.$default$spliterator(this);
        }

        @Override
        public java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(this.spliterator());
        }

        @Override  // j$.util.Collection
        public Stream stream() {
            return Collection.-CC.$default$stream(this);
        }

        @Override
        public java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(this.stream());
        }

        @Override
        @l
        public java.util.List subList(int v, int v1) {
            return new SubList(HitTestResult.this, v + this.a, this.a + v1);
        }

        @Override
        public Object[] toArray() {
            return v.a(this);
        }

        @Override  // j$.util.Collection
        public Object[] toArray(IntFunction intFunction0) {
            return Collection.-CC.$default$toArray(this, intFunction0);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            L.p(arr_object, "array");
            return v.b(this, arr_object);
        }
    }

    @l
    private Object[] a;
    @l
    private long[] b;
    private int c;
    private int d;

    public HitTestResult() {
        this.a = new Object[16];
        this.b = new long[16];
        this.c = -1;
    }

    public final void a() {
        this.c = this.size() - 1;
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        this.c = -1;
        this.o();
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    private final void g() {
        Object[] arr_object = this.a;
        if(this.c >= arr_object.length) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 16);
            L.o(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
            long[] arr_v = Arrays.copyOf(this.b, arr_object.length + 16);
            L.o(arr_v, "copyOf(this, newSize)");
            this.b = arr_v;
        }
    }

    @Override
    public Object get(int v) {
        return this.a[v];
    }

    private final long h() {
        long v = 0x7F80000000000000L;
        int v1 = this.c + 1;
        int v2 = u.J(this);
        if(v1 <= v2) {
            while(true) {
                long v3 = DistanceAndInLayer.c(this.b[v1]);
                if(DistanceAndInLayer.b(v3, v) < 0) {
                    v = v3;
                }
                if(DistanceAndInLayer.f(v) < 0.0f && DistanceAndInLayer.i(v)) {
                    return v;
                }
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return v;
    }

    public int i() {
        return this.d;
    }

    @Override
    public int indexOf(Object object0) {
        int v = u.J(this);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(L.g(this.a[v1], object0)) {
                    return v1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public final boolean j() {
        long v = this.h();
        return DistanceAndInLayer.f(v) < 0.0f && DistanceAndInLayer.i(v);
    }

    public final void k(Object object0, boolean z, @l A3.a a0) {
        L.p(a0, "childHitTest");
        this.l(object0, -1.0f, z, a0);
    }

    public final void l(Object object0, float f, boolean z, @l A3.a a0) {
        L.p(a0, "childHitTest");
        int v = this.c;
        this.c = v + 1;
        this.g();
        int v1 = this.c;
        this.a[v1] = object0;
        this.b[v1] = HitTestResultKt.a(f, z);
        this.o();
        a0.invoke();
        this.c = v;
    }

    @Override
    public int lastIndexOf(Object object0) {
        for(int v = u.J(this); -1 < v; --v) {
            if(L.g(this.a[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    @l
    public ListIterator listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override
    @l
    public ListIterator listIterator(int v) {
        return new HitTestResultIterator(this, v, 0, 0, 6, null);
    }

    public final boolean m(float f, boolean z) {
        return this.c == u.J(this) ? true : DistanceAndInLayer.b(this.h(), HitTestResultKt.a(f, z)) > 0;
    }

    private final void o() {
        int v = this.c + 1;
        int v1 = u.J(this);
        if(v <= v1) {
            while(true) {
                this.a[v] = null;
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        this.d = this.c + 1;
    }

    public final void p(@l A3.a a0) {
        L.p(a0, "block");
        int v = this.c;
        a0.invoke();
        this.c = v;
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    public final void q(Object object0, float f, boolean z, @l A3.a a0) {
        L.p(a0, "childHitTest");
        if(this.c == u.J(this)) {
            this.l(object0, f, z, a0);
            if(this.c + 1 == u.J(this)) {
                this.o();
            }
            return;
        }
        long v = this.h();
        int v1 = this.c;
        this.c = u.J(this);
        this.l(object0, f, z, a0);
        if(this.c + 1 < u.J(this) && DistanceAndInLayer.b(v, this.h()) > 0) {
            int v2 = this.c + 1;
            kotlin.collections.l.B0(this.a, this.a, v1 + 1, v2, this.size());
            kotlin.collections.l.A0(this.b, this.b, v1 + 1, v2, this.size());
            this.c = this.size() + v1 - this.c - 1;
        }
        this.o();
        this.c = v1;
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Collection
    public boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    @Override  // j$.util.List
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.i();
    }

    @Override  // j$.util.List
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.List
    public Spliterator spliterator() {
        return List.-CC.$default$spliterator(this);
    }

    @Override
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(this.stream());
    }

    @Override
    @l
    public java.util.List subList(int v, int v1) {
        return new SubList(this, v, v1);
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override  // j$.util.Collection
    public Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }
}

