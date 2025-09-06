package com.google.common.collect;

import J1.c;
import P1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.primitives.l;
import j..util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.a;

@c
@C1
class e1 extends AbstractMap implements Serializable {
    class d extends AbstractSet {
        final e1 a;

        @Override
        public void clear() {
            e1.this.clear();
        }

        @Override
        public boolean contains(@a Object object0) {
            Map map0 = e1.this.C();
            if(map0 != null) {
                return map0.entrySet().contains(object0);
            }
            if(object0 instanceof Map.Entry) {
                Object object1 = ((Map.Entry)object0).getKey();
                int v = e1.this.J(object1);
                return v != -1 && B.a(e1.this.i0(v), ((Map.Entry)object0).getValue());
            }
            return false;
        }

        @Override
        public Iterator iterator() {
            return e1.this.E();
        }

        @Override
        public boolean remove(@a Object object0) {
            Map map0 = e1.this.C();
            if(map0 != null) {
                return map0.entrySet().remove(object0);
            }
            if(!(object0 instanceof Map.Entry) || e1.this.P()) {
                return false;
            }
            int v = e1.this.H();
            int v1 = g1.f(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue(), v, e1.this.X(), e1.this.V(), e1.this.W(), e1.this.Y());
            if(v1 == -1) {
                return false;
            }
            e1.this.O(v1, v);
            e1.e(e1.this);
            e1.this.I();
            return true;
        }

        @Override
        public int size() {
            return e1.this.size();
        }
    }

    abstract class e implements Iterator {
        int a;
        int b;
        int c;
        final e1 d;

        private e() {
            this.a = e10.e;
            this.b = e10.F();
            this.c = -1;
        }

        e(com.google.common.collect.e1.a e1$a0) {
        }

        private void a() {
            if(e1.this.e != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        @d4
        abstract Object b(int arg1);

        void c() {
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
            Object object0 = this.b(this.b);
            this.b = e1.this.G(this.b);
            return object0;
        }

        @Override
        public void remove() {
            this.a();
            c1.e(this.c >= 0);
            this.c();
            Object object0 = e1.this.M(this.c);
            e1.this.remove(object0);
            this.b = e1.this.r(this.b, this.c);
            this.c = -1;
        }
    }

    class f extends AbstractSet {
        final e1 a;

        @Override
        public void clear() {
            e1.this.clear();
        }

        @Override
        public boolean contains(@a Object object0) {
            return e1.this.containsKey(object0);
        }

        @Override
        public Iterator iterator() {
            return e1.this.N();
        }

        @Override
        public boolean remove(@a Object object0) {
            Map map0 = e1.this.C();
            return map0 == null ? e1.this.U(object0) != e1.j : map0.keySet().remove(object0);
        }

        @Override
        public int size() {
            return e1.this.size();
        }
    }

    final class g extends com.google.common.collect.g {
        @d4
        private final Object a;
        private int b;
        final e1 c;

        g(int v) {
            this.a = e10.M(v);
            this.b = v;
        }

        private void e() {
            if(this.b == -1 || this.b >= e1.this.size()) {
                this.b = e1.this.J(this.a);
            }
            else {
                Object object0 = e1.this.M(this.b);
                if(!B.a(this.a, object0)) {
                    this.b = e1.this.J(this.a);
                }
            }
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object getKey() {
            return this.a;
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object getValue() {
            Map map0 = e1.this.C();
            if(map0 != null) {
                return W3.a(map0.get(this.a));
            }
            this.e();
            return this.b == -1 ? null : e1.this.i0(this.b);
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object setValue(@d4 Object object0) {
            Map map0 = e1.this.C();
            if(map0 != null) {
                return W3.a(map0.put(this.a, object0));
            }
            this.e();
            int v = this.b;
            if(v == -1) {
                e1.this.put(this.a, object0);
                return null;
            }
            Object object1 = e1.this.i0(v);
            e1.this.g0(this.b, object0);
            return object1;
        }
    }

    class h extends AbstractCollection {
        final e1 a;

        @Override
        public void clear() {
            e1.this.clear();
        }

        @Override
        public Iterator iterator() {
            return e1.this.j0();
        }

        @Override
        public int size() {
            return e1.this.size();
        }
    }

    @a
    private transient Object a;
    @J1.e
    @a
    transient int[] b;
    @J1.e
    @a
    transient Object[] c;
    @J1.e
    @a
    transient Object[] d;
    private transient int e;
    private transient int f;
    @b
    @a
    private transient Set g;
    @b
    @a
    private transient Set h;
    @b
    @a
    private transient Collection i;
    private static final Object j = null;
    @J1.e
    static final double k = 0.001;
    private static final int l = 9;

    static {
        e1.j = new Object();
    }

    e1() {
        this.K(3);
    }

    e1(int v) {
        this.K(v);
    }

    Collection A() {
        return new h(this);
    }

    public static e1 B(int v) {
        return new e1(v);
    }

    // 去混淆评级： 低(20)
    @J1.e
    @a
    Map C() {
        return this.a instanceof Map ? ((Map)this.a) : null;
    }

    private int D(int v) {
        return this.V()[v];
    }

    Iterator E() {
        class com.google.common.collect.e1.b extends e {
            final e1 e;

            com.google.common.collect.e1.b() {
                super(null);
            }

            @Override  // com.google.common.collect.e1$e
            Object b(int v) {
                return this.d(v);
            }

            Map.Entry d(int v) {
                return new g(e1.this, v);
            }
        }

        Map map0 = this.C();
        return map0 != null ? map0.entrySet().iterator() : new com.google.common.collect.e1.b(this);
    }

    // 去混淆评级： 低(20)
    int F() {
        return this.isEmpty() ? -1 : 0;
    }

    int G(int v) {
        return v + 1 < this.f ? v + 1 : -1;
    }

    private int H() {
        return (1 << (this.e & 0x1F)) - 1;
    }

    void I() {
        this.e += 0x20;
    }

    private int J(@a Object object0) {
        if(this.P()) {
            return -1;
        }
        int v = F2.d(object0);
        int v1 = this.H();
        int v2 = g1.h(this.X(), v & v1);
        if(v2 == 0) {
            return -1;
        }
        do {
            int v3 = this.D(v2 - 1);
            if((v3 & ~v1) == (v & ~v1) && B.a(object0, this.M(v2 - 1))) {
                return v2 - 1;
            }
            v2 = v3 & v1;
        }
        while(v2 != 0);
        return -1;
    }

    void K(int v) {
        H.e(v >= 0, "Expected size must be >= 0");
        this.e = l.g(v, 1, 0x3FFFFFFF);
    }

    void L(int v, @d4 Object object0, @d4 Object object1, int v1, int v2) {
        this.c0(v, v1 & ~v2);
        this.f0(v, object0);
        this.g0(v, object1);
    }

    private Object M(int v) {
        return this.W()[v];
    }

    Iterator N() {
        class com.google.common.collect.e1.a extends e {
            final e1 e;

            com.google.common.collect.e1.a() {
                super(null);
            }

            @Override  // com.google.common.collect.e1$e
            @d4
            Object b(int v) {
                return e1.this.M(v);
            }
        }

        Map map0 = this.C();
        return map0 != null ? map0.keySet().iterator() : new com.google.common.collect.e1.a(this);
    }

    void O(int v, int v1) {
        int v5;
        Object object0 = this.X();
        int[] arr_v = this.V();
        Object[] arr_object = this.W();
        Object[] arr_object1 = this.Y();
        int v2 = this.size();
        if(v < v2 - 1) {
            Object object1 = arr_object[v2 - 1];
            arr_object[v] = object1;
            arr_object1[v] = arr_object1[v2 - 1];
            arr_object[v2 - 1] = null;
            arr_object1[v2 - 1] = null;
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
        arr_object1[v] = null;
        arr_v[v] = 0;
    }

    @J1.e
    boolean P() {
        return this.a == null;
    }

    @J1.d
    private void S(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid size: " + v);
        }
        this.K(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.put(objectInputStream0.readObject(), objectInputStream0.readObject());
        }
    }

    private Object U(@a Object object0) {
        if(this.P()) {
            return e1.j;
        }
        int v = this.H();
        int v1 = g1.f(object0, null, v, this.X(), this.V(), this.W(), null);
        if(v1 == -1) {
            return e1.j;
        }
        Object object1 = this.i0(v1);
        this.O(v1, v);
        --this.f;
        this.I();
        return object1;
    }

    private int[] V() {
        int[] arr_v = this.b;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private Object[] W() {
        Object[] arr_object = this.c;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    private Object X() {
        Object object0 = this.a;
        Objects.requireNonNull(object0);
        return object0;
    }

    private Object[] Y() {
        Object[] arr_object = this.d;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    void Z(int v) {
        this.b = Arrays.copyOf(this.V(), v);
        this.c = Arrays.copyOf(this.W(), v);
        this.d = Arrays.copyOf(this.Y(), v);
    }

    private void a0(int v) {
        int[] arr_v = this.V();
        if(v > arr_v.length) {
            int v1 = Math.min(0x3FFFFFFF, Math.max(1, arr_v.length >>> 1) + arr_v.length | 1);
            if(v1 != arr_v.length) {
                this.Z(v1);
            }
        }
    }

    @O1.a
    private int b0(int v, int v1, int v2, int v3) {
        Object object0 = g1.a(v1);
        if(v3 != 0) {
            g1.i(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.X();
        int[] arr_v = this.V();
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
        this.e0(v1 - 1);
        return v1 - 1;
    }

    private void c0(int v, int v1) {
        this.V()[v] = v1;
    }

    @Override
    public void clear() {
        if(this.P()) {
            return;
        }
        this.I();
        Map map0 = this.C();
        if(map0 != null) {
            this.e = l.g(this.size(), 3, 0x3FFFFFFF);
            map0.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(this.W(), 0, this.f, null);
        Arrays.fill(this.Y(), 0, this.f, null);
        g1.g(this.X());
        Arrays.fill(this.V(), 0, this.f, 0);
        this.f = 0;
    }

    @Override
    public boolean containsKey(@a Object object0) {
        Map map0 = this.C();
        return map0 == null ? this.J(object0) != -1 : map0.containsKey(object0);
    }

    @Override
    public boolean containsValue(@a Object object0) {
        Map map0 = this.C();
        if(map0 != null) {
            return map0.containsValue(object0);
        }
        for(int v = 0; v < this.f; ++v) {
            if(B.a(object0, this.i0(v))) {
                return true;
            }
        }
        return false;
    }

    static int e(e1 e10) {
        int v = e10.f;
        e10.f = v - 1;
        return v;
    }

    private void e0(int v) {
        this.e = this.e & 0xFFFFFFE0 | 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F;
    }

    @Override
    public Set entrySet() {
        Set set0 = this.h;
        if(set0 == null) {
            set0 = this.x();
            this.h = set0;
        }
        return set0;
    }

    private void f0(int v, Object object0) {
        this.W()[v] = object0;
    }

    private void g0(int v, Object object0) {
        this.Y()[v] = object0;
    }

    @Override
    @a
    public Object get(@a Object object0) {
        Map map0 = this.C();
        if(map0 != null) {
            return map0.get(object0);
        }
        int v = this.J(object0);
        if(v == -1) {
            return null;
        }
        this.q(v);
        return this.i0(v);
    }

    public void h0() {
        if(this.P()) {
            return;
        }
        Map map0 = this.C();
        if(map0 != null) {
            Map map1 = this.y(this.size());
            map1.putAll(map0);
            this.a = map1;
            return;
        }
        int v = this.f;
        if(v < this.V().length) {
            this.Z(v);
        }
        int v1 = g1.j(v);
        int v2 = this.H();
        if(v1 < v2) {
            this.b0(v2, v1, 0, 0);
        }
    }

    private Object i0(int v) {
        return this.Y()[v];
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    Iterator j0() {
        class com.google.common.collect.e1.c extends e {
            final e1 e;

            com.google.common.collect.e1.c() {
                super(null);
            }

            @Override  // com.google.common.collect.e1$e
            @d4
            Object b(int v) {
                return e1.this.i0(v);
            }
        }

        Map map0 = this.C();
        return map0 != null ? map0.values().iterator() : new com.google.common.collect.e1.c(this);
    }

    @J1.d
    private void k0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.size());
        Iterator iterator0 = this.E();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            objectOutputStream0.writeObject(((Map.Entry)object0).getKey());
            objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
        }
    }

    @Override
    public Set keySet() {
        Set set0 = this.g;
        if(set0 == null) {
            set0 = this.z();
            this.g = set0;
        }
        return set0;
    }

    @Override
    @O1.a
    @a
    public Object put(@d4 Object object0, @d4 Object object1) {
        int v5;
        if(this.P()) {
            this.s();
        }
        Map map0 = this.C();
        if(map0 != null) {
            return map0.put(object0, object1);
        }
        int[] arr_v = this.V();
        Object[] arr_object = this.W();
        Object[] arr_object1 = this.Y();
        int v = this.f;
        int v1 = F2.d(object0);
        int v2 = this.H();
        int v3 = v1 & v2;
        int v4 = g1.h(this.X(), v3);
        if(v4 == 0) {
            if(v + 1 > v2) {
                v5 = this.b0(v2, g1.e(v2), v1, v);
                goto label_37;
            }
            g1.i(this.X(), v3, v + 1);
            v5 = v2;
            goto label_37;
        }
        int v6 = 0;
        while(true) {
            int v7 = arr_v[v4 - 1];
            if((v7 & ~v2) == (v1 & ~v2) && B.a(object0, arr_object[v4 - 1])) {
                Object object2 = arr_object1[v4 - 1];
                arr_object1[v4 - 1] = object1;
                this.q(v4 - 1);
                return object2;
            }
            int v8 = v7 & v2;
            ++v6;
            if(v8 == 0) {
                if(v6 >= 9) {
                    return this.u().put(object0, object1);
                }
                if(v + 1 > v2) {
                    v5 = this.b0(v2, g1.e(v2), v1, v);
                }
                else {
                    arr_v[v4 - 1] = v7 & ~v2 | v + 1 & v2;
                    v5 = v2;
                }
            label_37:
                this.a0(v + 1);
                this.L(v, object0, object1, v1, v5);
                this.f = v + 1;
                this.I();
                return null;
            }
            v4 = v8;
        }
    }

    void q(int v) {
    }

    int r(int v, int v1) {
        return v - 1;
    }

    @Override
    @O1.a
    @a
    public Object remove(@a Object object0) {
        Map map0 = this.C();
        if(map0 != null) {
            return map0.remove(object0);
        }
        Object object1 = this.U(object0);
        return object1 == e1.j ? null : object1;
    }

    @O1.a
    int s() {
        H.h0(this.P(), "Arrays already allocated");
        int v = this.e;
        int v1 = g1.j(v);
        this.a = g1.a(v1);
        this.e0(v1 - 1);
        this.b = new int[v];
        this.c = new Object[v];
        this.d = new Object[v];
        return v;
    }

    @Override
    public int size() {
        Map map0 = this.C();
        return map0 == null ? this.f : map0.size();
    }

    @J1.e
    @O1.a
    Map u() {
        Map map0 = this.y(this.H() + 1);
        for(int v = this.F(); v >= 0; v = this.G(v)) {
            map0.put(this.M(v), this.i0(v));
        }
        this.a = map0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.I();
        return map0;
    }

    @Override
    public Collection values() {
        Collection collection0 = this.i;
        if(collection0 == null) {
            collection0 = this.A();
            this.i = collection0;
        }
        return collection0;
    }

    public static e1 w() {
        return new e1();
    }

    Set x() {
        return new d(this);
    }

    Map y(int v) {
        return new LinkedHashMap(v, 1.0f);
    }

    Set z() {
        return new f(this);
    }
}

