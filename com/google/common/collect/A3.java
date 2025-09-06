package com.google.common.collect;

import J1.b;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.j2objc.annotations.RetainedWith;
import j..util.Objects;
import j..util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

@b(emulated = true, serializable = true)
@C1
public abstract class a3 extends K2 implements Set {
    public static class a extends com.google.common.collect.K2.a {
        @e
        @o3.a
        Object[] e;
        private int f;

        public a() {
            super(4);
        }

        a(int v) {
            super(v);
            this.e = new Object[a3.p(v)];
        }

        @Override  // com.google.common.collect.K2$a
        @O1.a
        public com.google.common.collect.K2.b a(Object object0) {
            return this.j(object0);
        }

        @Override  // com.google.common.collect.K2$a
        @O1.a
        public com.google.common.collect.K2.b b(Object[] arr_object) {
            return this.k(arr_object);
        }

        @Override  // com.google.common.collect.K2$a
        @O1.a
        public com.google.common.collect.K2.b c(Iterable iterable0) {
            return this.l(iterable0);
        }

        @Override  // com.google.common.collect.K2$b
        @O1.a
        public com.google.common.collect.K2.b d(Iterator iterator0) {
            return this.m(iterator0);
        }

        @Override  // com.google.common.collect.K2$b
        public K2 e() {
            return this.o();
        }

        @Override  // com.google.common.collect.K2$a
        @O1.a
        public com.google.common.collect.K2.a g(Object object0) {
            return this.j(object0);
        }

        @O1.a
        public a j(Object object0) {
            H.E(object0);
            if(this.e != null && a3.p(this.c) <= this.e.length) {
                this.n(object0);
                return this;
            }
            this.e = null;
            super.g(object0);
            return this;
        }

        @O1.a
        public a k(Object[] arr_object) {
            if(this.e != null) {
                for(int v = 0; v < arr_object.length; ++v) {
                    this.j(arr_object[v]);
                }
                return this;
            }
            super.b(arr_object);
            return this;
        }

        @O1.a
        public a l(Iterable iterable0) {
            H.E(iterable0);
            if(this.e != null) {
                for(Object object0: iterable0) {
                    this.j(object0);
                }
                return this;
            }
            super.c(iterable0);
            return this;
        }

        @O1.a
        public a m(Iterator iterator0) {
            H.E(iterator0);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                this.j(object0);
            }
            return this;
        }

        private void n(Object object0) {
            Objects.requireNonNull(this.e);
            int v = this.e.length - 1;
            int v1 = object0.hashCode();
            for(int v2 = F2.c(v1); true; v2 = v3 + 1) {
                int v3 = v2 & v;
                Object[] arr_object = this.e;
                Object object1 = arr_object[v3];
                if(object1 == null) {
                    arr_object[v3] = object0;
                    this.f += v1;
                    super.g(object0);
                    return;
                }
                if(object1.equals(object0)) {
                    return;
                }
            }
        }

        public a3 o() {
            a3 a30;
            int v = this.c;
            switch(v) {
                case 0: {
                    return a3.B();
                }
                case 1: {
                    Object object0 = this.b[0];
                    Objects.requireNonNull(object0);
                    return a3.C(object0);
                }
                default: {
                    if(this.e == null || a3.p(v) != this.e.length) {
                        a30 = a3.q(this.c, this.b);
                        this.c = a30.size();
                    }
                    else {
                        a30 = new r4((a3.I(this.c, this.b.length) ? Arrays.copyOf(this.b, this.c) : this.b), this.f, this.e, this.e.length - 1, this.c);
                    }
                    this.d = true;
                    this.e = null;
                    return a30;
                }
            }
        }

        @O1.a
        a p(a a3$a0) {
            if(this.e != null) {
                for(int v = 0; v < a3$a0.c; ++v) {
                    Object object0 = a3$a0.b[v];
                    Objects.requireNonNull(object0);
                    this.j(object0);
                }
                return this;
            }
            this.h(a3$a0.b, a3$a0.c);
            return this;
        }
    }

    @d
    static class com.google.common.collect.a3.b implements Serializable {
        final Object[] a;
        private static final long b;

        com.google.common.collect.a3.b(Object[] arr_object) {
            this.a = arr_object;
        }

        Object a() {
            return a3.y(this.a);
        }
    }

    @P1.b
    @RetainedWith
    @o3.a
    private transient O2 c;
    static final int d = 0x40000000;
    private static final double e = 0.7;
    private static final int f = 0x2CCCCCCC;
    private static final long g = 0xDECAFL;

    boolean A() {
        return false;
    }

    public static a3 B() {
        return r4.n;
    }

    public static a3 C(Object object0) {
        return new E4(object0);
    }

    public static a3 D(Object object0, Object object1) {
        return a3.q(2, new Object[]{object0, object1});
    }

    public static a3 E(Object object0, Object object1, Object object2) {
        return a3.q(3, new Object[]{object0, object1, object2});
    }

    public static a3 F(Object object0, Object object1, Object object2, Object object3) {
        return a3.q(4, new Object[]{object0, object1, object2, object3});
    }

    public static a3 G(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return a3.q(5, new Object[]{object0, object1, object2, object3, object4});
    }

    @SafeVarargs
    public static a3 H(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        H.e(arr_object.length <= 0x7FFFFFF9, "the total number of elements must fit in an int");
        Object[] arr_object1 = new Object[arr_object.length + 6];
        arr_object1[0] = object0;
        arr_object1[1] = object1;
        arr_object1[2] = object2;
        arr_object1[3] = object3;
        arr_object1[4] = object4;
        arr_object1[5] = object5;
        System.arraycopy(arr_object, 0, arr_object1, 6, arr_object.length);
        return a3.q(arr_object.length + 6, arr_object1);
    }

    private static boolean I(int v, int v1) {
        return v < (v1 >> 1) + (v1 >> 2);
    }

    @G2
    static Collector J() {
        return a1.u0();
    }

    @Override  // com.google.common.collect.K2
    public O2 a() {
        O2 o20 = this.c;
        if(o20 == null) {
            o20 = this.z();
            this.c = o20;
        }
        return o20;
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof a3) || !this.A() || !((a3)object0).A() || this.hashCode() == object0.hashCode() ? D4.g(this, object0) : false;
    }

    @Override
    public int hashCode() {
        return D4.k(this);
    }

    @Override  // com.google.common.collect.K2
    public abstract u5 i();

    @Override  // com.google.common.collect.K2
    public Iterator iterator() {
        return this.i();
    }

    @d
    private void j(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override  // com.google.common.collect.K2
    @d
    Object k() {
        return new com.google.common.collect.a3.b(this.toArray());
    }

    public static a n() {
        return new a();
    }

    public static a o(int v) {
        c1.b(v, "expectedSize");
        return new a(v);
    }

    @e
    static int p(int v) {
        int v1 = Math.max(v, 2);
        boolean z = true;
        if(v1 < 0x2CCCCCCC) {
            int v2;
            for(v2 = Integer.highestOneBit(v1 - 1) << 1; ((double)v2) * 0.7 < ((double)v1); v2 <<= 1) {
            }
            return v2;
        }
        if(v1 >= 0x40000000) {
            z = false;
        }
        H.e(z, "collection too large");
        return 0x40000000;
    }

    private static a3 q(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return a3.B();
            }
            case 1: {
                Object object3 = arr_object[0];
                Objects.requireNonNull(object3);
                return a3.C(object3);
            }
            default: {
                int v1 = a3.p(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = Z3.a(arr_object[v2], v2);
                    int v5 = object0.hashCode();
                    for(int v6 = F2.c(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    Object object2 = arr_object[0];
                    Objects.requireNonNull(object2);
                    return new E4(object2);
                }
                if(a3.p(v4) < v1 / 2) {
                    return a3.q(v4, arr_object);
                }
                if(a3.I(v4, arr_object.length)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new r4(arr_object, v3, arr_object1, v1 - 1, v4);
            }
        }
    }

    // 去混淆评级： 低(20)
    public static a3 r(Iterable iterable0) {
        return iterable0 instanceof Collection ? a3.u(((Collection)iterable0)) : a3.x(iterable0.iterator());
    }

    public static a3 u(Collection collection0) {
        if(collection0 instanceof a3 && !(collection0 instanceof SortedSet) && !((a3)collection0).h()) {
            return (a3)collection0;
        }
        Object[] arr_object = collection0.toArray();
        return a3.q(arr_object.length, arr_object);
    }

    public static a3 x(Iterator iterator0) {
        if(!iterator0.hasNext()) {
            return a3.B();
        }
        Object object0 = iterator0.next();
        return iterator0.hasNext() ? new a().j(object0).m(iterator0).o() : a3.C(object0);
    }

    public static a3 y(Object[] arr_object) {
        switch(arr_object.length) {
            case 0: {
                return a3.B();
            }
            case 1: {
                return a3.C(arr_object[0]);
            }
            default: {
                Object[] arr_object1 = (Object[])arr_object.clone();
                return a3.q(arr_object.length, arr_object1);
            }
        }
    }

    O2 z() {
        return O2.l(this.toArray());
    }
}

