package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

@b(emulated = true, serializable = true)
@C1
final class p4 extends Q2 {
    static class a extends a3 {
        private final transient Q2 h;
        private final transient Object[] i;
        private final transient int j;
        private final transient int k;

        a(Q2 q20, Object[] arr_object, int v, int v1) {
            this.h = q20;
            this.i = arr_object;
            this.j = v;
            this.k = v1;
        }

        @Override  // com.google.common.collect.K2
        int b(Object[] arr_object, int v) {
            return this.a().b(arr_object, v);
        }

        @Override  // com.google.common.collect.K2
        public boolean contains(@o3.a Object object0) {
            if(object0 instanceof Map.Entry) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                return object2 != null && object2.equals(this.h.get(object1));
            }
            return false;
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return true;
        }

        @Override  // com.google.common.collect.a3
        public u5 i() {
            return this.a().i();
        }

        @Override  // com.google.common.collect.a3
        public Iterator iterator() {
            return this.i();
        }

        @Override  // com.google.common.collect.a3
        @c
        @d
        Object k() {
            return super.k();
        }

        @Override
        public int size() {
            return this.k;
        }

        @Override  // com.google.common.collect.a3
        O2 z() {
            class com.google.common.collect.p4.a.a extends O2 {
                final a e;

                public Map.Entry U(int v) {
                    H.C(v, a.this.k);
                    Object[] arr_object = a.this.i;
                    Object object0 = arr_object[a.this.j + v * 2];
                    Objects.requireNonNull(object0);
                    Object[] arr_object1 = a.this.i;
                    Object object1 = arr_object1[v * 2 + (a.this.j ^ 1)];
                    Objects.requireNonNull(object1);
                    return new AbstractMap.SimpleImmutableEntry(object0, object1);
                }

                @Override
                public Object get(int v) {
                    return this.U(v);
                }

                @Override  // com.google.common.collect.K2
                public boolean h() {
                    return true;
                }

                @Override  // com.google.common.collect.O2
                @d
                Object k() {
                    return super.k();
                }

                @Override
                public int size() {
                    return a.this.k;
                }
            }

            return new com.google.common.collect.p4.a.a(this);
        }
    }

    static final class com.google.common.collect.p4.b extends a3 {
        private final transient Q2 h;
        private final transient O2 i;

        com.google.common.collect.p4.b(Q2 q20, O2 o20) {
            this.h = q20;
            this.i = o20;
        }

        @Override  // com.google.common.collect.a3
        public O2 a() {
            return this.i;
        }

        @Override  // com.google.common.collect.K2
        int b(Object[] arr_object, int v) {
            return this.a().b(arr_object, v);
        }

        @Override  // com.google.common.collect.K2
        public boolean contains(@o3.a Object object0) {
            return this.h.get(object0) != null;
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return true;
        }

        @Override  // com.google.common.collect.a3
        public u5 i() {
            return this.a().i();
        }

        @Override  // com.google.common.collect.a3
        public Iterator iterator() {
            return this.i();
        }

        @Override  // com.google.common.collect.a3
        @c
        @d
        Object k() {
            return super.k();
        }

        @Override
        public int size() {
            return this.h.size();
        }
    }

    static final class com.google.common.collect.p4.c extends O2 {
        private final transient Object[] e;
        private final transient int f;
        private final transient int g;

        com.google.common.collect.p4.c(Object[] arr_object, int v, int v1) {
            this.e = arr_object;
            this.f = v;
            this.g = v1;
        }

        @Override
        public Object get(int v) {
            H.C(v, this.g);
            Object object0 = this.e[v * 2 + this.f];
            Objects.requireNonNull(object0);
            return object0;
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return true;
        }

        @Override  // com.google.common.collect.O2
        Object k() {
            return super.k();
        }

        @Override
        public int size() {
            return this.g;
        }
    }

    @o3.a
    private final transient Object g;
    @e
    final transient Object[] h;
    private final transient int i;
    private static final byte j = -1;
    private static final int k = 0x80;
    private static final int l = 0x8000;
    private static final int m = 0xFF;
    private static final int n = 0xFFFF;
    static final Q2 o;
    @d
    private static final long p;

    static {
        p4.o = new p4(null, new Object[0], 0);
    }

    private p4(@o3.a Object object0, Object[] arr_object, int v) {
        this.g = object0;
        this.h = arr_object;
        this.i = v;
    }

    @Override  // com.google.common.collect.Q2
    @c
    @d
    Object L() {
        return super.L();
    }

    static p4 M(int v, Object[] arr_object) {
        return p4.N(v, arr_object, null);
    }

    static p4 N(int v, Object[] arr_object, com.google.common.collect.Q2.b q2$b0) {
        if(v == 0) {
            return (p4)p4.o;
        }
        if(v == 1) {
            Object object0 = arr_object[0];
            Objects.requireNonNull(object0);
            Object object1 = arr_object[1];
            Objects.requireNonNull(object1);
            c1.a(object0, object1);
            return new p4(null, arr_object, 1);
        }
        H.d0(v, arr_object.length >> 1);
        Object object2 = p4.O(arr_object, v, a3.p(v), 0);
        if(object2 instanceof Object[]) {
            com.google.common.collect.Q2.b.a q2$b$a0 = (com.google.common.collect.Q2.b.a)((Object[])object2)[2];
            if(q2$b0 == null) {
                throw q2$b$a0.a();
            }
            q2$b0.e = q2$b$a0;
            Object object3 = ((Object[])object2)[0];
            int v1 = (int)(((Integer)((Object[])object2)[1]));
            return new p4(object3, Arrays.copyOf(arr_object, v1 * 2), v1);
        }
        return new p4(object2, arr_object, v);
    }

    @o3.a
    private static Object O(Object[] arr_object, int v, int v1, int v2) {
        com.google.common.collect.Q2.b.a q2$b$a0 = null;
        if(v == 1) {
            Object object0 = arr_object[v2];
            Objects.requireNonNull(object0);
            Object object1 = arr_object[v2 ^ 1];
            Objects.requireNonNull(object1);
            c1.a(object0, object1);
            return null;
        }
        if(v1 <= 0x80) {
            byte[] arr_b = new byte[v1];
            Arrays.fill(arr_b, -1);
            int v4 = 0;
            for(int v3 = 0; v3 < v; ++v3) {
                int v5 = v3 * 2 + v2;
                int v6 = v4 * 2 + v2;
                Object object2 = arr_object[v5];
                Objects.requireNonNull(object2);
                Object object3 = arr_object[v5 ^ 1];
                Objects.requireNonNull(object3);
                c1.a(object2, object3);
                for(int v7 = F2.c(object2.hashCode()); true; v7 = v8 + 1) {
                    int v8 = v7 & v1 - 1;
                    int v9 = arr_b[v8] & 0xFF;
                    if(v9 == 0xFF) {
                        arr_b[v8] = (byte)v6;
                        if(v4 < v3) {
                            arr_object[v6] = object2;
                            arr_object[v6 ^ 1] = object3;
                        }
                        ++v4;
                        break;
                    }
                    if(object2.equals(arr_object[v9])) {
                        Object object4 = arr_object[v9 ^ 1];
                        Objects.requireNonNull(object4);
                        q2$b$a0 = new com.google.common.collect.Q2.b.a(object2, object3, object4);
                        arr_object[v9 ^ 1] = object3;
                        break;
                    }
                }
            }
            return v4 != v ? new Object[]{arr_b, v4, q2$b$a0} : arr_b;
        }
        if(v1 <= 0x8000) {
            short[] arr_v = new short[v1];
            Arrays.fill(arr_v, -1);
            int v11 = 0;
            for(int v10 = 0; v10 < v; ++v10) {
                int v12 = v10 * 2 + v2;
                int v13 = v11 * 2 + v2;
                Object object5 = arr_object[v12];
                Objects.requireNonNull(object5);
                Object object6 = arr_object[v12 ^ 1];
                Objects.requireNonNull(object6);
                c1.a(object5, object6);
                for(int v14 = F2.c(object5.hashCode()); true; v14 = v15 + 1) {
                    int v15 = v14 & v1 - 1;
                    int v16 = arr_v[v15] & 0xFFFF;
                    if(v16 == 0xFFFF) {
                        arr_v[v15] = (short)v13;
                        if(v11 < v10) {
                            arr_object[v13] = object5;
                            arr_object[v13 ^ 1] = object6;
                        }
                        ++v11;
                        break;
                    }
                    if(object5.equals(arr_object[v16])) {
                        Object object7 = arr_object[v16 ^ 1];
                        Objects.requireNonNull(object7);
                        q2$b$a0 = new com.google.common.collect.Q2.b.a(object5, object6, object7);
                        arr_object[v16 ^ 1] = object6;
                        break;
                    }
                }
            }
            return v11 != v ? new Object[]{arr_v, v11, q2$b$a0} : arr_v;
        }
        int[] arr_v1 = new int[v1];
        Arrays.fill(arr_v1, -1);
        int v18 = 0;
        for(int v17 = 0; v17 < v; ++v17) {
            int v19 = v17 * 2 + v2;
            int v20 = v18 * 2 + v2;
            Object object8 = arr_object[v19];
            Objects.requireNonNull(object8);
            Object object9 = arr_object[v19 ^ 1];
            Objects.requireNonNull(object9);
            c1.a(object8, object9);
            for(int v21 = F2.c(object8.hashCode()); true; v21 = v22 + 1) {
                int v22 = v21 & v1 - 1;
                int v23 = arr_v1[v22];
                if(v23 == -1) {
                    arr_v1[v22] = v20;
                    if(v18 < v17) {
                        arr_object[v20] = object8;
                        arr_object[v20 ^ 1] = object9;
                    }
                    ++v18;
                    break;
                }
                if(object8.equals(arr_object[v23])) {
                    Object object10 = arr_object[v23 ^ 1];
                    Objects.requireNonNull(object10);
                    q2$b$a0 = new com.google.common.collect.Q2.b.a(object8, object9, object10);
                    arr_object[v23 ^ 1] = object9;
                    break;
                }
            }
        }
        return v18 != v ? new Object[]{arr_v1, v18, q2$b$a0} : arr_v1;
    }

    @o3.a
    static Object P(Object[] arr_object, int v, int v1, int v2) {
        Object object0 = p4.O(arr_object, v, v1, v2);
        if(object0 instanceof Object[]) {
            throw ((com.google.common.collect.Q2.b.a)((Object[])object0)[2]).a();
        }
        return object0;
    }

    @o3.a
    static Object S(@o3.a Object object0, Object[] arr_object, int v, int v1, @o3.a Object object1) {
        Object object2 = null;
        if(object1 == null) {
            return null;
        }
        if(v == 1) {
            Object object3 = arr_object[v1];
            Objects.requireNonNull(object3);
            if(object3.equals(object1)) {
                object2 = arr_object[v1 ^ 1];
                Objects.requireNonNull(object2);
            }
            return object2;
        }
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof byte[]) {
            int v2 = ((byte[])object0).length - 1;
            for(int v3 = F2.c(object1.hashCode()); true; v3 = v4 + 1) {
                int v4 = v3 & v2;
                int v5 = ((byte[])object0)[v4] & 0xFF;
                if(v5 == 0xFF) {
                    return null;
                }
                if(object1.equals(arr_object[v5])) {
                    return arr_object[v5 ^ 1];
                }
            }
        }
        if(object0 instanceof short[]) {
            int v6 = ((short[])object0).length - 1;
            for(int v7 = F2.c(object1.hashCode()); true; v7 = v8 + 1) {
                int v8 = v7 & v6;
                int v9 = ((short[])object0)[v8] & 0xFFFF;
                if(v9 == 0xFFFF) {
                    return null;
                }
                if(object1.equals(arr_object[v9])) {
                    return arr_object[v9 ^ 1];
                }
            }
        }
        int v10 = ((int[])object0).length - 1;
        for(int v11 = F2.c(object1.hashCode()); true; v11 = v12 + 1) {
            int v12 = v11 & v10;
            int v13 = ((int[])object0)[v12];
            if(v13 == -1) {
                return null;
            }
            if(object1.equals(arr_object[v13])) {
                return arr_object[v13 ^ 1];
            }
        }
    }

    @Override  // com.google.common.collect.Q2
    @o3.a
    public Object get(@o3.a Object object0) {
        Object object1 = p4.S(this.g, this.h, this.i, 0, object0);
        return object1 == null ? null : object1;
    }

    @Override  // com.google.common.collect.Q2
    a3 h() {
        return new a(this, this.h, 0, this.i);
    }

    @Override  // com.google.common.collect.Q2
    a3 i() {
        return new com.google.common.collect.p4.b(this, new com.google.common.collect.p4.c(this.h, 0, this.i));
    }

    @Override  // com.google.common.collect.Q2
    K2 j() {
        return new com.google.common.collect.p4.c(this.h, 1, this.i);
    }

    @Override  // com.google.common.collect.Q2
    boolean q() {
        return false;
    }

    @Override
    public int size() {
        return this.i;
    }
}

