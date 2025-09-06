package androidx.compose.runtime.snapshots;

import B3.e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.ranges.s;
import kotlin.y;
import y4.l;

@s0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1726#2,3:458\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n311#1:458,3\n320#1:461,2\n*E\n"})
final class SubList implements e, List {
    @l
    private final SnapshotStateList a;
    private final int b;
    private int c;
    private int d;

    public SubList(@l SnapshotStateList snapshotStateList0, int v, int v1) {
        L.p(snapshotStateList0, "parentList");
        super();
        this.a = snapshotStateList0;
        this.b = v;
        this.c = snapshotStateList0.i();
        this.d = v1 - v;
    }

    @l
    public final SnapshotStateList a() {
        return this.a;
    }

    @Override
    public void add(int v, Object object0) {
        this.d();
        this.a.add(this.b + v, object0);
        this.d = this.size() + 1;
        this.c = this.a.i();
    }

    @Override
    public boolean add(Object object0) {
        this.d();
        this.a.add(this.b + this.size(), object0);
        this.d = this.size() + 1;
        this.c = this.a.i();
        return true;
    }

    @Override
    public boolean addAll(int v, @l Collection collection0) {
        L.p(collection0, "elements");
        this.d();
        boolean z = this.a.addAll(v + this.b, collection0);
        if(z) {
            this.d = this.size() + collection0.size();
            this.c = this.a.i();
        }
        return z;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.addAll(this.size(), collection0);
    }

    public int b() {
        return this.d;
    }

    public Object c(int v) {
        this.d();
        Object object0 = this.a.remove(this.b + v);
        this.d = this.size() - 1;
        this.c = this.a.i();
        return object0;
    }

    @Override
    public void clear() {
        if(this.size() > 0) {
            this.d();
            this.a.q(this.b, this.size() + this.b);
            this.d = 0;
            this.c = this.a.i();
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    private final void d() {
        if(this.a.i() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public Object get(int v) {
        this.d();
        SnapshotStateListKt.e(v, this.size());
        return this.a.get(this.b + v);
    }

    @Override
    public int indexOf(Object object0) {
        this.d();
        Iterator iterator0 = s.W1(this.b, this.size() + this.b).iterator();
        while(iterator0.hasNext()) {
            int v = ((T)iterator0).b();
            if(L.g(object0, this.a.get(v))) {
                return v - this.b;
            }
            if(false) {
                break;
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
        return this.listIterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        this.d();
        for(int v = this.b + this.size() - 1; v >= this.b; --v) {
            if(L.g(object0, this.a.get(v))) {
                return v - this.b;
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
        this.d();
        f l0$f0 = new f();
        l0$f0.a = v - 1;
        return new Object() {
            @l
            public Void a(Object object0) {
                SnapshotStateListKt.d();
                throw new y();
            }

            @Override
            public void add(Object object0) {
                this.a(object0);
            }

            @l
            public Void b() {
                SnapshotStateListKt.d();
                throw new y();
            }

            @l
            public Void c(Object object0) {
                SnapshotStateListKt.d();
                throw new y();
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b.size() - 1;
            }

            @Override
            public boolean hasPrevious() {
                return this.a >= 0;
            }

            @Override
            public Object next() {
                int v = this.a + 1;
                SnapshotStateListKt.e(v, this.b.size());
                this.a = v;
                return this.b.get(v);
            }

            @Override
            public int nextIndex() {
                return this.a + 1;
            }

            @Override
            public Object previous() {
                int v = this.a;
                SnapshotStateListKt.e(v, this.b.size());
                this.a = v - 1;
                return this.b.get(v);
            }

            @Override
            public int previousIndex() {
                return this.a;
            }

            @Override
            public void remove() {
                this.b();
            }

            @Override
            public void set(Object object0) {
                this.c(object0);
            }
        };
    }

    @Override
    public final Object remove(int v) {
        return this.c(v);
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        boolean z;
        L.p(collection0, "elements");
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(!this.remove(object0) && !z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.d();
        int v = this.a.r(collection0, this.b, this.size() + this.b);
        if(v > 0) {
            this.c = this.a.i();
            this.d = this.size() - v;
        }
        return v > 0;
    }

    @Override
    public Object set(int v, Object object0) {
        SnapshotStateListKt.e(v, this.size());
        this.d();
        Object object1 = this.a.set(v + this.b, object0);
        this.c = this.a.i();
        return object1;
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    @l
    public List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d();
        return new SubList(this.a, v + this.b, v1 + this.b);
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }
}

