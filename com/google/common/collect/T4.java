package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.a;

@b(emulated = true, serializable = true)
@C1
final class t4 extends k3 {
    @e
    final transient O2 k;
    static final t4 l;

    static {
        t4.l = new t4(O2.A(), c4.K());
    }

    t4(O2 o20, Comparator comparator0) {
        super(comparator0);
        this.k = o20;
    }

    @Override  // com.google.common.collect.k3
    k3 B0(Object object0, boolean z, Object object1, boolean z1) {
        return this.E0(object0, z).g0(object1, z1);
    }

    @Override  // com.google.common.collect.k3
    k3 E0(Object object0, boolean z) {
        return this.I0(this.K0(object0, z), this.size());
    }

    t4 I0(int v, int v1) {
        if(v == 0 && v1 == this.size()) {
            return this;
        }
        return v >= v1 ? k3.a0(this.h) : new t4(this.k.R(v, v1), this.h);
    }

    int J0(Object object0, boolean z) {
        Object object1 = H.E(object0);
        int v = Collections.binarySearch(this.k, object1, this.comparator());
        if(v >= 0) {
            return z ? v + 1 : v;
        }
        return ~v;
    }

    int K0(Object object0, boolean z) {
        Object object1 = H.E(object0);
        int v = Collections.binarySearch(this.k, object1, this.comparator());
        if(v >= 0) {
            return z ? v : v + 1;
        }
        return ~v;
    }

    private int M0(Object object0) throws ClassCastException {
        return Collections.binarySearch(this.k, object0, this.N0());
    }

    Comparator N0() {
        return this.h;
    }

    @Override  // com.google.common.collect.k3
    k3 X() {
        Comparator comparator0 = Collections.reverseOrder(this.h);
        return this.isEmpty() ? k3.a0(comparator0) : new t4(this.k.O(), comparator0);
    }

    @Override  // com.google.common.collect.k3
    @c
    public u5 Y() {
        return this.k.O().i();
    }

    @Override  // com.google.common.collect.a3
    public O2 a() {
        return this.k;
    }

    @Override  // com.google.common.collect.K2
    int b(Object[] arr_object, int v) {
        return this.k.b(arr_object, v);
    }

    @Override  // com.google.common.collect.K2
    @a
    Object[] c() {
        return this.k.c();
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object ceiling(Object object0) {
        int v = this.K0(object0, true);
        return v == this.size() ? null : this.k.get(v);
    }

    @Override  // com.google.common.collect.K2
    public boolean contains(@a Object object0) {
        if(object0 != null) {
            try {
                if(this.M0(object0) >= 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        if(collection0 instanceof S3) {
            collection0 = ((S3)collection0).f();
        }
        if(H4.b(this.comparator(), collection0) && collection0.size() > 1) {
            u5 u50 = this.i();
            Iterator iterator0 = collection0.iterator();
            if(!u50.hasNext()) {
                return false;
            }
            Object object0 = iterator0.next();
            Object object1 = u50.next();
            try {
                while(true) {
                    int v = this.G0(object1, object0);
                    if(v < 0) {
                        if(!u50.hasNext()) {
                            return false;
                        }
                        object1 = u50.next();
                    }
                    else {
                        if(v != 0) {
                            break;
                        }
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        object0 = iterator0.next();
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
            return false;
        }
        return super.containsAll(collection0);
    }

    @Override  // com.google.common.collect.K2
    int d() {
        return this.k.d();
    }

    @Override  // com.google.common.collect.k3
    @c
    public Iterator descendingIterator() {
        return this.Y();
    }

    @Override  // com.google.common.collect.a3
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Set)) {
            return false;
        }
        if(this.size() != ((Set)object0).size()) {
            return false;
        }
        if(this.isEmpty()) {
            return true;
        }
        if(H4.b(this.h, ((Set)object0))) {
            Iterator iterator0 = ((Set)object0).iterator();
            try {
                u5 u50 = this.i();
                do {
                    if(!u50.hasNext()) {
                        return true;
                    }
                    Object object1 = u50.next();
                    Object object2 = iterator0.next();
                }
                while(object2 != null && this.G0(object1, object2) == 0);
            }
            catch(ClassCastException | NoSuchElementException unused_ex) {
            }
            return false;
        }
        return this.containsAll(((Set)object0));
    }

    @Override  // com.google.common.collect.k3
    public Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.k.get(0);
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object floor(Object object0) {
        int v = this.J0(object0, true);
        return v - 1 == -1 ? null : this.k.get(v - 1);
    }

    @Override  // com.google.common.collect.K2
    int g() {
        return this.k.g();
    }

    @Override  // com.google.common.collect.k3
    k3 g0(Object object0, boolean z) {
        return this.I0(0, this.J0(object0, z));
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return this.k.h();
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object higher(Object object0) {
        int v = this.K0(object0, false);
        return v == this.size() ? null : this.k.get(v);
    }

    @Override  // com.google.common.collect.k3
    public u5 i() {
        return this.k.i();
    }

    @Override  // com.google.common.collect.k3
    int indexOf(@a Object object0) {
        if(object0 == null) {
            return -1;
        }
        try {
            int v = Collections.binarySearch(this.k, object0, this.N0());
            if(v >= 0) {
                return v;
            }
        }
        catch(ClassCastException unused_ex) {
        }
        return -1;
    }

    @Override  // com.google.common.collect.k3
    public Iterator iterator() {
        return this.i();
    }

    @Override  // com.google.common.collect.k3
    @c
    @d
    Object k() {
        return super.k();
    }

    @Override  // com.google.common.collect.k3
    public Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.k.get(this.size() - 1);
    }

    @Override  // com.google.common.collect.k3
    @a
    public Object lower(Object object0) {
        int v = this.J0(object0, false);
        return v - 1 == -1 ? null : this.k.get(v - 1);
    }

    @Override
    public int size() {
        return this.k.size();
    }
}

