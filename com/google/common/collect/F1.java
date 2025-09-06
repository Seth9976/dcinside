package com.google.common.collect;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.primitives.l;
import j..util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.a;

@c
@C1
class f1 extends AbstractSet implements Serializable {
    @a
    private transient Object a;
    @a
    private transient int[] b;
    @e
    @a
    transient Object[] c;
    private transient int d;
    private transient int e;
    @e
    static final double f = 0.001;
    private static final int g = 9;

    f1() {
        this.x(3);
    }

    f1(int v) {
        this.x(v);
    }

    void A(int v, int v1) {
        int v5;
        Object object0 = this.F();
        int[] arr_v = this.E();
        Object[] arr_object = this.D();
        int v2 = this.size();
        if(v < v2 - 1) {
            Object object1 = arr_object[v2 - 1];
            arr_object[v] = object1;
            arr_object[v2 - 1] = null;
            arr_v[v] = arr_v[v2 - 1];
            arr_v[v2 - 1] = 0;
            int v3 = F2.d(object1) & v1;
            int v4 = g1.h(object0, v3);
            if(v4 == v2) {
                g1.i(object0, v3, v + 1);
                return;
            }
            while(true) {
                v5 = arr_v[v4 - 1];
                int v6 = v5 & v1;
                if(v6 == v2) {
                    break;
                }
                v4 = v6;
            }
            arr_v[v4 - 1] = v5 & ~v1 | v + 1 & v1;
            return;
        }
        arr_object[v] = null;
        arr_v[v] = 0;
    }

    @e
    boolean B() {
        return this.a == null;
    }

    @d
    private void C(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid size: " + v);
        }
        this.x(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.add(objectInputStream0.readObject());
        }
    }

    private Object[] D() {
        Object[] arr_object = this.c;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    private int[] E() {
        int[] arr_v = this.b;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private Object F() {
        Object object0 = this.a;
        Objects.requireNonNull(object0);
        return object0;
    }

    void G(int v) {
        this.b = Arrays.copyOf(this.E(), v);
        this.c = Arrays.copyOf(this.D(), v);
    }

    private void H(int v) {
        int[] arr_v = this.E();
        if(v > arr_v.length) {
            int v1 = Math.min(0x3FFFFFFF, Math.max(1, arr_v.length >>> 1) + arr_v.length | 1);
            if(v1 != arr_v.length) {
                this.G(v1);
            }
        }
    }

    @O1.a
    private int I(int v, int v1, int v2, int v3) {
        Object object0 = g1.a(v1);
        if(v3 != 0) {
            g1.i(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.F();
        int[] arr_v = this.E();
        for(int v4 = 0; v4 <= v; ++v4) {
            for(int v5 = g1.h(object1, v4); v5 != 0; v5 = v6 & v) {
                int v6 = arr_v[v5 - 1];
                int v7 = v6 & ~v | v4;
                int v8 = v7 & v1 - 1;
                int v9 = g1.h(object0, v8);
                g1.i(object0, v8, v5);
                arr_v[v5 - 1] = v7 & ~(v1 - 1) | v9 & v1 - 1;
            }
        }
        this.a = object0;
        this.M(v1 - 1);
        return v1 - 1;
    }

    private void J(int v, Object object0) {
        this.D()[v] = object0;
    }

    private void K(int v, int v1) {
        this.E()[v] = v1;
    }

    private void M(int v) {
        this.d = this.d & 0xFFFFFFE0 | 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F;
    }

    public void N() {
        if(this.B()) {
            return;
        }
        Set set0 = this.m();
        if(set0 != null) {
            Set set1 = this.k(this.size());
            set1.addAll(set0);
            this.a = set1;
            return;
        }
        int v = this.e;
        if(v < this.E().length) {
            this.G(v);
        }
        int v1 = g1.j(v);
        int v2 = this.r();
        if(v1 < v2) {
            this.I(v2, v1, 0, 0);
        }
    }

    @d
    private void O(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.size());
        for(Object object0: this) {
            objectOutputStream0.writeObject(object0);
        }
    }

    @Override
    @O1.a
    public boolean add(@d4 Object object0) {
        if(this.B()) {
            this.d();
        }
        Set set0 = this.m();
        if(set0 != null) {
            return set0.add(object0);
        }
        int[] arr_v = this.E();
        Object[] arr_object = this.D();
        int v = this.e;
        int v1 = F2.d(object0);
        int v2 = this.r();
        int v3 = v1 & v2;
        int v4 = g1.h(this.F(), v3);
        if(v4 == 0) {
            if(v + 1 > v2) {
                v2 = this.I(v2, g1.e(v2), v1, v);
                goto label_32;
            }
            g1.i(this.F(), v3, v + 1);
            goto label_32;
        }
        int v5 = v1 & ~v2;
        int v6 = 0;
        while(true) {
            int v7 = arr_v[v4 - 1];
            if((v7 & ~v2) == v5 && B.a(object0, arr_object[v4 - 1])) {
                return false;
            }
            int v8 = v7 & v2;
            ++v6;
            if(v8 == 0) {
                if(v6 >= 9) {
                    return this.g().add(object0);
                }
                if(v + 1 > v2) {
                    v2 = this.I(v2, g1.e(v2), v1, v);
                }
                else {
                    arr_v[v4 - 1] = v7 & ~v2 | v + 1 & v2;
                }
            label_32:
                this.H(v + 1);
                this.y(v, object0, v1, v2);
                this.e = v + 1;
                this.u();
                return true;
            }
            v4 = v8;
        }
    }

    int c(int v, int v1) {
        return v - 1;
    }

    @Override
    public void clear() {
        if(this.B()) {
            return;
        }
        this.u();
        Set set0 = this.m();
        if(set0 != null) {
            this.d = l.g(this.size(), 3, 0x3FFFFFFF);
            set0.clear();
            this.a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(this.D(), 0, this.e, null);
        g1.g(this.F());
        Arrays.fill(this.E(), 0, this.e, 0);
        this.e = 0;
    }

    @Override
    public boolean contains(@a Object object0) {
        if(this.B()) {
            return false;
        }
        Set set0 = this.m();
        if(set0 != null) {
            return set0.contains(object0);
        }
        int v = F2.d(object0);
        int v1 = this.r();
        int v2 = g1.h(this.F(), v & v1);
        if(v2 == 0) {
            return false;
        }
        do {
            int v3 = this.o(v2 - 1);
            if((v3 & ~v1) == (v & ~v1) && B.a(object0, this.n(v2 - 1))) {
                return true;
            }
            v2 = v3 & v1;
        }
        while(v2 != 0);
        return false;
    }

    @O1.a
    int d() {
        H.h0(this.B(), "Arrays already allocated");
        int v = this.d;
        int v1 = g1.j(v);
        this.a = g1.a(v1);
        this.M(v1 - 1);
        this.b = new int[v];
        this.c = new Object[v];
        return v;
    }

    @e
    @O1.a
    Set g() {
        Set set0 = this.k(this.r() + 1);
        for(int v = this.p(); v >= 0; v = this.q(v)) {
            set0.add(this.n(v));
        }
        this.a = set0;
        this.b = null;
        this.c = null;
        this.u();
        return set0;
    }

    public static f1 h() {
        return new f1();
    }

    public static f1 i(Collection collection0) {
        f1 f10 = f1.l(collection0.size());
        f10.addAll(collection0);
        return f10;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        class com.google.common.collect.f1.a implements Iterator {
            int a;
            int b;
            int c;
            final f1 d;

            com.google.common.collect.f1.a() {
                this.a = f10.d;
                this.b = f10.p();
                this.c = -1;
            }

            private void a() {
                if(f1.this.d != this.a) {
                    throw new ConcurrentModificationException();
                }
            }

            void b() {
                this.a += 0x20;
            }

            @Override
            public boolean hasNext() {
                return this.b >= 0;
            }

            @Override
            @d4
            public Object next() {
                this.a();
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.c = this.b;
                Object object0 = f1.this.n(this.b);
                this.b = f1.this.q(this.b);
                return object0;
            }

            @Override
            public void remove() {
                this.a();
                c1.e(this.c >= 0);
                this.b();
                Object object0 = f1.this.n(this.c);
                f1.this.remove(object0);
                this.b = f1.this.c(this.b, this.c);
                this.c = -1;
            }
        }

        Set set0 = this.m();
        return set0 != null ? set0.iterator() : new com.google.common.collect.f1.a(this);
    }

    @SafeVarargs
    public static f1 j(Object[] arr_object) {
        f1 f10 = f1.l(arr_object.length);
        Collections.addAll(f10, arr_object);
        return f10;
    }

    private Set k(int v) {
        return new LinkedHashSet(v, 1.0f);
    }

    public static f1 l(int v) {
        return new f1(v);
    }

    // 去混淆评级： 低(20)
    @e
    @a
    Set m() {
        return this.a instanceof Set ? ((Set)this.a) : null;
    }

    private Object n(int v) {
        return this.D()[v];
    }

    private int o(int v) {
        return this.E()[v];
    }

    // 去混淆评级： 低(20)
    int p() {
        return this.isEmpty() ? -1 : 0;
    }

    int q(int v) {
        return v + 1 < this.e ? v + 1 : -1;
    }

    private int r() {
        return (1 << (this.d & 0x1F)) - 1;
    }

    @Override
    @O1.a
    public boolean remove(@a Object object0) {
        if(this.B()) {
            return false;
        }
        Set set0 = this.m();
        if(set0 != null) {
            return set0.remove(object0);
        }
        int v = this.r();
        int v1 = g1.f(object0, null, v, this.F(), this.E(), this.D(), null);
        if(v1 == -1) {
            return false;
        }
        this.A(v1, v);
        --this.e;
        this.u();
        return true;
    }

    @Override
    public int size() {
        Set set0 = this.m();
        return set0 == null ? this.e : set0.size();
    }

    @Override
    public Object[] toArray() {
        if(this.B()) {
            return new Object[0];
        }
        Set set0 = this.m();
        return set0 == null ? Arrays.copyOf(this.D(), this.e) : set0.toArray();
    }

    @Override
    @O1.a
    public Object[] toArray(Object[] arr_object) {
        if(this.B()) {
            if(arr_object.length > 0) {
                arr_object[0] = null;
            }
            return arr_object;
        }
        Set set0 = this.m();
        return set0 == null ? Z3.n(this.D(), 0, this.e, arr_object) : set0.toArray(arr_object);
    }

    void u() {
        this.d += 0x20;
    }

    void x(int v) {
        H.e(v >= 0, "Expected size must be >= 0");
        this.d = l.g(v, 1, 0x3FFFFFFF);
    }

    void y(int v, @d4 Object object0, int v1, int v2) {
        this.K(v, v1 & ~v2);
        this.J(v, object0);
    }

    @e
    boolean z() {
        return this.m() != null;
    }
}

