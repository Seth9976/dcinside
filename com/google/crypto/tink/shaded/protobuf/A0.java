package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;

@y
final class a0 implements Comparable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[g0.values().length];
            a.a = arr_v;
            try {
                arr_v[g0.o.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[g0.w.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[g0.G.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[g0.U8.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b {
        private Field a;
        private g0 b;
        private int c;
        private Field d;
        private int e;
        private boolean f;
        private boolean g;
        private g1 h;
        private Class i;
        private Object j;
        private e k;
        private Field l;

        private b() {
        }

        b(a a0$a0) {
        }

        public a0 a() {
            g1 g10 = this.h;
            if(g10 != null) {
                return a0.f(this.c, this.b, g10, this.i, this.g, this.k);
            }
            Object object0 = this.j;
            if(object0 != null) {
                return a0.e(this.a, this.c, object0, this.k);
            }
            Field field0 = this.d;
            if(field0 != null) {
                return this.f ? a0.j(this.a, this.c, this.b, field0, this.e, this.g, this.k) : a0.i(this.a, this.c, this.b, field0, this.e, this.g, this.k);
            }
            e t0$e0 = this.k;
            if(t0$e0 != null) {
                return this.l == null ? a0.d(this.a, this.c, this.b, t0$e0) : a0.h(this.a, this.c, this.b, t0$e0, this.l);
            }
            return this.l == null ? a0.c(this.a, this.c, this.b, this.g) : a0.g(this.a, this.c, this.b, this.l);
        }

        public b b(Field field0) {
            this.l = field0;
            return this;
        }

        public b c(boolean z) {
            this.g = z;
            return this;
        }

        public b d(e t0$e0) {
            this.k = t0$e0;
            return this;
        }

        public b e(Field field0) {
            if(this.h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.a = field0;
            return this;
        }

        public b f(int v) {
            this.c = v;
            return this;
        }

        public b g(Object object0) {
            this.j = object0;
            return this;
        }

        public b h(g1 g10, Class class0) {
            if(this.a != null || this.d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.h = g10;
            this.i = class0;
            return this;
        }

        public b i(Field field0, int v) {
            this.d = (Field)t0.e(field0, "presenceField");
            this.e = v;
            return this;
        }

        public b j(boolean z) {
            this.f = z;
            return this;
        }

        public b k(g0 g00) {
            this.b = g00;
            return this;
        }
    }

    private final Field a;
    private final g0 b;
    private final Class c;
    private final int d;
    private final Field e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final g1 i;
    private final Field j;
    private final Class k;
    private final Object l;
    private final e m;

    private a0(Field field0, int v, g0 g00, Class class0, Field field1, int v1, boolean z, boolean z1, g1 g10, Class class1, Object object0, e t0$e0, Field field2) {
        this.a = field0;
        this.b = g00;
        this.c = class0;
        this.d = v;
        this.e = field1;
        this.f = v1;
        this.g = z;
        this.h = z1;
        this.i = g10;
        this.k = class1;
        this.l = object0;
        this.m = t0$e0;
        this.j = field2;
    }

    public boolean A() {
        return this.h;
    }

    private static boolean B(int v) {
        return v != 0 && (v & v - 1) == 0;
    }

    public boolean C() {
        return this.g;
    }

    public static b D() {
        return new b(null);
    }

    private static void a(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + v);
        }
    }

    public int b(a0 a00) {
        return this.d - a00.d;
    }

    public static a0 c(Field field0, int v, g0 g00, boolean z) {
        a0.a(v);
        t0.e(field0, "field");
        t0.e(g00, "fieldType");
        if(g00 == g0.G || g00 == g0.U8) {
            throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
        }
        return new a0(field0, v, g00, null, null, 0, false, z, null, null, null, null, null);
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((a0)object0));
    }

    public static a0 d(Field field0, int v, g0 g00, e t0$e0) {
        a0.a(v);
        t0.e(field0, "field");
        return new a0(field0, v, g00, null, null, 0, false, false, null, null, null, t0$e0, null);
    }

    public static a0 e(Field field0, int v, Object object0, e t0$e0) {
        t0.e(object0, "mapDefaultEntry");
        a0.a(v);
        t0.e(field0, "field");
        return new a0(field0, v, g0.V8, null, null, 0, false, true, null, null, object0, t0$e0, null);
    }

    public static a0 f(int v, g0 g00, g1 g10, Class class0, boolean z, e t0$e0) {
        a0.a(v);
        t0.e(g00, "fieldType");
        t0.e(g10, "oneof");
        t0.e(class0, "oneofStoredType");
        if(!g00.i()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + v + " is of type " + g00);
        }
        return new a0(null, v, g00, null, null, 0, false, z, g10, class0, null, t0$e0, null);
    }

    public static a0 g(Field field0, int v, g0 g00, Field field1) {
        a0.a(v);
        t0.e(field0, "field");
        t0.e(g00, "fieldType");
        if(g00 == g0.G || g00 == g0.U8) {
            throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
        }
        return new a0(field0, v, g00, null, null, 0, false, false, null, null, null, null, field1);
    }

    public static a0 h(Field field0, int v, g0 g00, e t0$e0, Field field1) {
        a0.a(v);
        t0.e(field0, "field");
        return new a0(field0, v, g00, null, null, 0, false, false, null, null, null, t0$e0, field1);
    }

    public static a0 i(Field field0, int v, g0 g00, Field field1, int v1, boolean z, e t0$e0) {
        a0.a(v);
        t0.e(field0, "field");
        t0.e(g00, "fieldType");
        t0.e(field1, "presenceField");
        if(field1 != null && !a0.B(v1)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v1);
        }
        return new a0(field0, v, g00, null, field1, v1, false, z, null, null, null, t0$e0, null);
    }

    public static a0 j(Field field0, int v, g0 g00, Field field1, int v1, boolean z, e t0$e0) {
        a0.a(v);
        t0.e(field0, "field");
        t0.e(g00, "fieldType");
        t0.e(field1, "presenceField");
        if(field1 != null && !a0.B(v1)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v1);
        }
        return new a0(field0, v, g00, null, field1, v1, true, z, null, null, null, t0$e0, null);
    }

    public static a0 k(Field field0, int v, g0 g00, Class class0) {
        a0.a(v);
        t0.e(field0, "field");
        t0.e(g00, "fieldType");
        t0.e(class0, "messageClass");
        return new a0(field0, v, g00, class0, null, 0, false, false, null, null, null, null, null);
    }

    public Field l() {
        return this.j;
    }

    public e m() {
        return this.m;
    }

    public Field n() {
        return this.a;
    }

    public int p() {
        return this.d;
    }

    public Class r() {
        return this.c;
    }

    public Object s() {
        return this.l;
    }

    public Class t() {
        switch(this.b) {
            case 1: 
            case 2: {
                return this.a == null ? this.k : this.a.getType();
            }
            case 3: 
            case 4: {
                return this.c;
            }
            default: {
                return null;
            }
        }
    }

    public g1 u() {
        return this.i;
    }

    public Class v() {
        return this.k;
    }

    public Field w() {
        return this.e;
    }

    public int y() {
        return this.f;
    }

    public g0 z() {
        return this.b;
    }
}

