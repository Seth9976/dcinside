package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

public final class c {
    public static final class b extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final boolean[] g(int v) {
            return new boolean[v];
        }
    }

    public static final class com.fasterxml.jackson.databind.util.c.c extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final byte[] g(int v) {
            return new byte[v];
        }
    }

    public static final class d extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final double[] g(int v) {
            return new double[v];
        }
    }

    public static final class e extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final float[] g(int v) {
            return new float[v];
        }
    }

    public static final class f extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final int[] g(int v) {
            return new int[v];
        }
    }

    public static final class g extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final long[] g(int v) {
            return new long[v];
        }
    }

    public static final class h extends B {
        @Override  // com.fasterxml.jackson.databind.util.B
        public Object a(int v) {
            return this.g(v);
        }

        public final short[] g(int v) {
            return new short[v];
        }
    }

    private b a;
    private com.fasterxml.jackson.databind.util.c.c b;
    private h c;
    private f d;
    private g e;
    private e f;
    private d g;

    public c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static HashSet a(Object[] arr_object) {
        if(arr_object != null) {
            HashSet hashSet0 = new HashSet(arr_object.length);
            for(int v = 0; v < arr_object.length; ++v) {
                hashSet0.add(arr_object[v]);
            }
            return hashSet0;
        }
        return new HashSet();
    }

    public static Object b(Object object0) {
        static final class a {
            final Class a;
            final int b;
            final Object c;

            a(Class class0, int v, Object object0) {
                this.a = class0;
                this.b = v;
                this.c = object0;
                super();
            }

            @Override
            public boolean equals(Object object0) {
                if(object0 == this) {
                    return true;
                }
                if(!com.fasterxml.jackson.databind.util.h.R(object0, this.a)) {
                    return false;
                }
                if(Array.getLength(object0) != this.b) {
                    return false;
                }
                for(int v = 0; v < this.b; ++v) {
                    Object object1 = Array.get(this.c, v);
                    Object object2 = Array.get(object0, v);
                    if(object1 != object2 && object1 != null && !object1.equals(object2)) {
                        return false;
                    }
                }
                return true;
            }
        }

        int v = Array.getLength(object0);
        return new a(object0.getClass(), v, object0);
    }

    public b c() {
        if(this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public com.fasterxml.jackson.databind.util.c.c d() {
        if(this.b == null) {
            this.b = new com.fasterxml.jackson.databind.util.c.c();
        }
        return this.b;
    }

    public d e() {
        if(this.g == null) {
            this.g = new d();
        }
        return this.g;
    }

    public e f() {
        if(this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    public f g() {
        if(this.d == null) {
            this.d = new f();
        }
        return this.d;
    }

    public g h() {
        if(this.e == null) {
            this.e = new g();
        }
        return this.e;
    }

    public h i() {
        if(this.c == null) {
            this.c = new h();
        }
        return this.c;
    }

    public static Object[] j(Object[] arr_object, Object object0) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(arr_object[v] == object0) {
                if(v == 0) {
                    return arr_object;
                }
                Object[] arr_object1 = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), arr_object.length);
                System.arraycopy(arr_object, 0, arr_object1, 1, v);
                arr_object1[0] = object0;
                int v1 = arr_object.length - (v + 1);
                if(v1 > 0) {
                    System.arraycopy(arr_object, v + 1, arr_object1, v + 1, v1);
                }
                return arr_object1;
            }
        }
        Object[] arr_object2 = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), arr_object.length + 1);
        if(arr_object.length > 0) {
            System.arraycopy(arr_object, 0, arr_object2, 1, arr_object.length);
        }
        arr_object2[0] = object0;
        return arr_object2;
    }
}

