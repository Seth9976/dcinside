package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public enum g0 {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[A0.values().length];
            a.b = arr_v;
            try {
                arr_v[A0.k.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[A0.m.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[A0.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[b.values().length];
            a.a = arr_v1;
            try {
                arr_v1[b.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean a;

        private b(boolean z) {
            this.a = z;
        }

        public boolean a() {
            return this.a;
        }
    }

    DOUBLE(0, b.b, A0.h),
    FLOAT(1, b.b, A0.g),
    INT64(2, b.b, A0.f),
    UINT64(3, b.b, A0.f),
    INT32(4, b.b, A0.e),
    FIXED64(5, b.b, A0.f),
    FIXED32(6, b.b, A0.e),
    BOOL(7, b.b, A0.i),
    STRING(8, b.b, A0.j),
    MESSAGE(9, b.b, A0.m),
    BYTES(10, b.b, A0.k),
    UINT32(11, b.b, A0.e),
    ENUM(12, b.b, A0.l),
    SFIXED32(13, b.b, A0.e),
    SFIXED64(14, b.b, A0.f),
    SINT32(15, b.b, A0.e),
    SINT64(16, b.b, A0.f),
    GROUP(17, b.b, A0.m),
    DOUBLE_LIST(18, b.c, A0.h),
    FLOAT_LIST(19, b.c, A0.g),
    INT64_LIST(20, b.c, A0.f),
    UINT64_LIST(21, b.c, A0.f),
    INT32_LIST(22, b.c, A0.e),
    FIXED64_LIST(23, b.c, A0.f),
    FIXED32_LIST(24, b.c, A0.e),
    BOOL_LIST(25, b.c, A0.i),
    STRING_LIST(26, b.c, A0.j),
    MESSAGE_LIST(27, b.c, A0.m),
    BYTES_LIST(28, b.c, A0.k),
    UINT32_LIST(29, b.c, A0.e),
    ENUM_LIST(30, b.c, A0.l),
    SFIXED32_LIST(0x1F, b.c, A0.e),
    SFIXED64_LIST(0x20, b.c, A0.f),
    SINT32_LIST(33, b.c, A0.e),
    SINT64_LIST(34, b.c, A0.f),
    DOUBLE_LIST_PACKED(35, b.d, A0.h),
    FLOAT_LIST_PACKED(36, b.d, A0.g),
    INT64_LIST_PACKED(37, b.d, A0.f),
    UINT64_LIST_PACKED(38, b.d, A0.f),
    INT32_LIST_PACKED(39, b.d, A0.e),
    FIXED64_LIST_PACKED(40, b.d, A0.f),
    FIXED32_LIST_PACKED(41, b.d, A0.e),
    BOOL_LIST_PACKED(42, b.d, A0.i),
    UINT32_LIST_PACKED(43, b.d, A0.e),
    ENUM_LIST_PACKED(44, b.d, A0.l),
    SFIXED32_LIST_PACKED(45, b.d, A0.e),
    SFIXED64_LIST_PACKED(46, b.d, A0.f),
    SINT32_LIST_PACKED(0x2F, b.d, A0.e),
    SINT64_LIST_PACKED(0x30, b.d, A0.f),
    GROUP_LIST(49, b.c, A0.m),
    MAP(50, b.e, A0.d);

    private static final g0[] W8;
    private static final Type[] X8;
    private static final g0[] Y8;
    private final A0 a;
    private final int b;
    private final b c;
    private final Class d;
    private final boolean e;

    static {
        arr_g0[0] = g0.f;
        arr_g0[1] = g0.g;
        arr_g0[2] = g0.h;
        arr_g0[3] = g0.i;
        arr_g0[4] = g0.j;
        arr_g0[5] = g0.k;
        arr_g0[6] = g0.l;
        arr_g0[7] = g0.m;
        arr_g0[8] = g0.n;
        arr_g0[9] = g0.o;
        arr_g0[10] = g0.p;
        arr_g0[11] = g0.q;
        arr_g0[12] = g0.r;
        arr_g0[13] = g0.s;
        arr_g0[14] = g0.t;
        arr_g0[15] = g0.u;
        arr_g0[16] = g0.v;
        arr_g0[17] = g0.w;
        arr_g0[18] = g0.x;
        arr_g0[19] = g0.y;
        arr_g0[20] = g0.z;
        arr_g0[21] = g0.A;
        arr_g0[22] = g0.B;
        arr_g0[23] = g0.C;
        arr_g0[24] = g0.D;
        arr_g0[25] = g0.E;
        arr_g0[26] = g0.F;
        arr_g0[27] = g0.G;
        arr_g0[28] = g0.H;
        arr_g0[29] = g0.I;
        arr_g0[30] = g0.J;
        arr_g0[0x1F] = g0.K;
        arr_g0[0x20] = g0.L;
        arr_g0[33] = g0.M;
        arr_g0[34] = g0.N;
        arr_g0[35] = g0.O;
        arr_g0[36] = g0.P;
        arr_g0[37] = g0.Q;
        arr_g0[38] = g0.X;
        arr_g0[39] = g0.Y;
        arr_g0[40] = g0.Z;
        arr_g0[41] = g0.M8;
        arr_g0[42] = g0.N8;
        arr_g0[43] = g0.O8;
        arr_g0[44] = g0.P8;
        arr_g0[45] = g0.Q8;
        arr_g0[46] = g0.R8;
        arr_g0[0x2F] = g0.S8;
        arr_g0[0x30] = g0.T8;
        arr_g0[49] = g0.U8;
        arr_g0[50] = g0.V8;
        g0.Y8 = arr_g0;
        g0.X8 = new Type[0];
        g0[] arr_g01 = (g0[])g0.Y8.clone();
        g0.W8 = new g0[arr_g01.length];
        for(int v = 0; v < arr_g01.length; ++v) {
            g0 g00 = arr_g01[v];
            g0.W8[g00.b] = g00;
        }
    }

    private g0(int v1, b g0$b0, A0 a00) {
        this.b = v1;
        this.c = g0$b0;
        this.a = a00;
        boolean z = true;
        switch(g0$b0) {
            case 1: {
                this.d = a00.a();
                break;
            }
            case 2: {
                this.d = a00.a();
                break;
            }
            default: {
                this.d = null;
            }
        }
        if(g0$b0 == b.b) {
            int v2 = a.b[a00.ordinal()];
            if(v2 == 1 || v2 == 2 || v2 == 3) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.e = z;
    }

    public static g0 a(int v) {
        if(v >= 0) {
            return v >= g0.W8.length ? null : g0.W8[v];
        }
        return null;
    }

    private static Type b(Class class0) {
        Class class1;
        Type[] arr_type = class0.getGenericInterfaces();
        for(int v = 0; true; ++v) {
            class1 = List.class;
            if(v >= arr_type.length) {
                break;
            }
            Type type0 = arr_type[v];
            if(type0 instanceof ParameterizedType && class1.isAssignableFrom(((Class)((ParameterizedType)type0).getRawType()))) {
                return type0;
            }
        }
        Type type1 = class0.getGenericSuperclass();
        return !(type1 instanceof ParameterizedType) || !class1.isAssignableFrom(((Class)((ParameterizedType)type1).getRawType())) ? null : type1;
    }

    public A0 c() {
        return this.a;
    }

    private static Type d(Class class0, Type[] arr_type) {
    alab2:
        while(true) {
            Class class1 = List.class;
            int v = 0;
            if(class0 == class1) {
                break;
            }
            Type type0 = g0.b(class0);
            if(type0 instanceof ParameterizedType) {
                Type[] arr_type1 = ((ParameterizedType)type0).getActualTypeArguments();
            alab1:
                for(int v1 = 0; v1 < arr_type1.length; ++v1) {
                    Type type1 = arr_type1[v1];
                    if(type1 instanceof TypeVariable) {
                        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
                        if(arr_type.length != arr_typeVariable.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int v2 = 0;
                        while(v2 < arr_typeVariable.length) {
                            if(type1 == arr_typeVariable[v2]) {
                                arr_type1[v1] = arr_type[v2];
                                continue alab1;
                            }
                            ++v2;
                        }
                        throw new RuntimeException("Unable to find replacement for " + type1);
                    }
                }
                class0 = (Class)((ParameterizedType)type0).getRawType();
                arr_type = arr_type1;
            }
            else {
                arr_type = g0.X8;
                Class[] arr_class = class0.getInterfaces();
                while(v < arr_class.length) {
                    Class class2 = arr_class[v];
                    if(class1.isAssignableFrom(class2)) {
                        class0 = class2;
                        continue alab2;
                    }
                    ++v;
                }
                class0 = class0.getSuperclass();
            }
        }
        if(arr_type.length != 1) {
            throw new RuntimeException("Unable to identify parameter type for List<T>");
        }
        return arr_type[0];
    }

    public int e() {
        return this.b;
    }

    public boolean f() {
        return this.c.a();
    }

    public boolean g() {
        return this.c == b.e;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.c == b.b;
    }

    public boolean isPacked() {
        return b.d.equals(this.c);
    }

    public boolean j(Field field0) {
        if(b.c.equals(this.c)) {
            return this.k(field0);
        }
        Class class0 = field0.getType();
        return this.a.c().isAssignableFrom(class0);
    }

    private boolean k(Field field0) {
        Class class0 = field0.getType();
        if(!this.a.c().isAssignableFrom(class0)) {
            return false;
        }
        Type type0 = g0.d(class0, (field0.getGenericType() instanceof ParameterizedType ? ((ParameterizedType)field0.getGenericType()).getActualTypeArguments() : g0.X8));
        return type0 instanceof Class ? this.d.isAssignableFrom(((Class)type0)) : true;
    }
}

