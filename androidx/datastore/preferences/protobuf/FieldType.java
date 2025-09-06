package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public enum FieldType {
    static enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean a;

        private Collection(boolean z) {
            this.a = z;
        }

        public boolean a() {
            return this.a;
        }
    }

    DOUBLE(0, Collection.b, JavaType.h),
    FLOAT(1, Collection.b, JavaType.g),
    INT64(2, Collection.b, JavaType.f),
    UINT64(3, Collection.b, JavaType.f),
    INT32(4, Collection.b, JavaType.e),
    FIXED64(5, Collection.b, JavaType.f),
    FIXED32(6, Collection.b, JavaType.e),
    BOOL(7, Collection.b, JavaType.i),
    STRING(8, Collection.b, JavaType.j),
    MESSAGE(9, Collection.b, JavaType.m),
    BYTES(10, Collection.b, JavaType.k),
    UINT32(11, Collection.b, JavaType.e),
    ENUM(12, Collection.b, JavaType.l),
    SFIXED32(13, Collection.b, JavaType.e),
    SFIXED64(14, Collection.b, JavaType.f),
    SINT32(15, Collection.b, JavaType.e),
    SINT64(16, Collection.b, JavaType.f),
    GROUP(17, Collection.b, JavaType.m),
    DOUBLE_LIST(18, Collection.c, JavaType.h),
    FLOAT_LIST(19, Collection.c, JavaType.g),
    INT64_LIST(20, Collection.c, JavaType.f),
    UINT64_LIST(21, Collection.c, JavaType.f),
    INT32_LIST(22, Collection.c, JavaType.e),
    FIXED64_LIST(23, Collection.c, JavaType.f),
    FIXED32_LIST(24, Collection.c, JavaType.e),
    BOOL_LIST(25, Collection.c, JavaType.i),
    STRING_LIST(26, Collection.c, JavaType.j),
    MESSAGE_LIST(27, Collection.c, JavaType.m),
    BYTES_LIST(28, Collection.c, JavaType.k),
    UINT32_LIST(29, Collection.c, JavaType.e),
    ENUM_LIST(30, Collection.c, JavaType.l),
    SFIXED32_LIST(0x1F, Collection.c, JavaType.e),
    SFIXED64_LIST(0x20, Collection.c, JavaType.f),
    SINT32_LIST(33, Collection.c, JavaType.e),
    SINT64_LIST(34, Collection.c, JavaType.f),
    DOUBLE_LIST_PACKED(35, Collection.d, JavaType.h),
    FLOAT_LIST_PACKED(36, Collection.d, JavaType.g),
    INT64_LIST_PACKED(37, Collection.d, JavaType.f),
    UINT64_LIST_PACKED(38, Collection.d, JavaType.f),
    INT32_LIST_PACKED(39, Collection.d, JavaType.e),
    FIXED64_LIST_PACKED(40, Collection.d, JavaType.f),
    FIXED32_LIST_PACKED(41, Collection.d, JavaType.e),
    BOOL_LIST_PACKED(42, Collection.d, JavaType.i),
    UINT32_LIST_PACKED(43, Collection.d, JavaType.e),
    ENUM_LIST_PACKED(44, Collection.d, JavaType.l),
    SFIXED32_LIST_PACKED(45, Collection.d, JavaType.e),
    SFIXED64_LIST_PACKED(46, Collection.d, JavaType.f),
    SINT32_LIST_PACKED(0x2F, Collection.d, JavaType.e),
    SINT64_LIST_PACKED(0x30, Collection.d, JavaType.f),
    GROUP_LIST(49, Collection.c, JavaType.m),
    MAP(50, Collection.e, JavaType.d);

    private static final FieldType[] W8;
    private static final Type[] X8;
    private static final FieldType[] Y8;
    private final JavaType a;
    private final int b;
    private final Collection c;
    private final Class d;
    private final boolean e;

    static {
        arr_fieldType[0] = FieldType.f;
        arr_fieldType[1] = FieldType.g;
        arr_fieldType[2] = FieldType.h;
        arr_fieldType[3] = FieldType.i;
        arr_fieldType[4] = FieldType.j;
        arr_fieldType[5] = FieldType.k;
        arr_fieldType[6] = FieldType.l;
        arr_fieldType[7] = FieldType.m;
        arr_fieldType[8] = FieldType.n;
        arr_fieldType[9] = FieldType.o;
        arr_fieldType[10] = FieldType.p;
        arr_fieldType[11] = FieldType.q;
        arr_fieldType[12] = FieldType.r;
        arr_fieldType[13] = FieldType.s;
        arr_fieldType[14] = FieldType.t;
        arr_fieldType[15] = FieldType.u;
        arr_fieldType[16] = FieldType.v;
        arr_fieldType[17] = FieldType.w;
        arr_fieldType[18] = FieldType.x;
        arr_fieldType[19] = FieldType.y;
        arr_fieldType[20] = FieldType.z;
        arr_fieldType[21] = FieldType.A;
        arr_fieldType[22] = FieldType.B;
        arr_fieldType[23] = FieldType.C;
        arr_fieldType[24] = FieldType.D;
        arr_fieldType[25] = FieldType.E;
        arr_fieldType[26] = FieldType.F;
        arr_fieldType[27] = FieldType.G;
        arr_fieldType[28] = FieldType.H;
        arr_fieldType[29] = FieldType.I;
        arr_fieldType[30] = FieldType.J;
        arr_fieldType[0x1F] = FieldType.K;
        arr_fieldType[0x20] = FieldType.L;
        arr_fieldType[33] = FieldType.M;
        arr_fieldType[34] = FieldType.N;
        arr_fieldType[35] = FieldType.O;
        arr_fieldType[36] = FieldType.P;
        arr_fieldType[37] = FieldType.Q;
        arr_fieldType[38] = FieldType.X;
        arr_fieldType[39] = FieldType.Y;
        arr_fieldType[40] = FieldType.Z;
        arr_fieldType[41] = FieldType.M8;
        arr_fieldType[42] = FieldType.N8;
        arr_fieldType[43] = FieldType.O8;
        arr_fieldType[44] = FieldType.P8;
        arr_fieldType[45] = FieldType.Q8;
        arr_fieldType[46] = FieldType.R8;
        arr_fieldType[0x2F] = FieldType.S8;
        arr_fieldType[0x30] = FieldType.T8;
        arr_fieldType[49] = FieldType.U8;
        arr_fieldType[50] = FieldType.V8;
        FieldType.Y8 = arr_fieldType;
        FieldType.X8 = new Type[0];
        FieldType[] arr_fieldType1 = (FieldType[])FieldType.Y8.clone();
        FieldType.W8 = new FieldType[arr_fieldType1.length];
        for(int v = 0; v < arr_fieldType1.length; ++v) {
            FieldType fieldType0 = arr_fieldType1[v];
            FieldType.W8[fieldType0.b] = fieldType0;
        }
    }

    private FieldType(int v1, Collection fieldType$Collection0, JavaType javaType0) {
        this.b = v1;
        this.c = fieldType$Collection0;
        this.a = javaType0;
        boolean z = true;
        switch(fieldType$Collection0) {
            case 1: {
                this.d = javaType0.a();
                break;
            }
            case 2: {
                this.d = javaType0.a();
                break;
            }
            default: {
                this.d = null;
            }
        }
        if(fieldType$Collection0 == Collection.b) {
            int v2 = androidx.datastore.preferences.protobuf.FieldType.1.b[javaType0.ordinal()];
            if(v2 == 1 || v2 == 2 || v2 == 3) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.e = z;
    }

    public static FieldType a(int v) {
        if(v >= 0) {
            return v >= FieldType.W8.length ? null : FieldType.W8[v];
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

    public JavaType c() {
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
            Type type0 = FieldType.b(class0);
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
                arr_type = FieldType.X8;
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
        return this.c == Collection.e;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.c == Collection.b;
    }

    public boolean isPacked() {
        return Collection.d.equals(this.c);
    }

    public boolean j(Field field0) {
        if(Collection.c.equals(this.c)) {
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
        Type type0 = FieldType.d(class0, (field0.getGenericType() instanceof ParameterizedType ? ((ParameterizedType)field0.getGenericType()).getActualTypeArguments() : FieldType.X8));
        return type0 instanceof Class ? this.d.isAssignableFrom(((Class)type0)) : true;
    }
}

