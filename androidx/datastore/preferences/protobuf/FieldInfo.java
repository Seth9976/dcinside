package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

final class FieldInfo implements Comparable {
    public static final class Builder {
        private Field a;
        private FieldType b;
        private int c;
        private Field d;
        private int e;
        private boolean f;
        private boolean g;
        private OneofInfo h;
        private Class i;
        private Object j;
        private EnumVerifier k;
        private Field l;

        private Builder() {
        }

        Builder(androidx.datastore.preferences.protobuf.FieldInfo.1 fieldInfo$10) {
        }

        public FieldInfo a() {
            OneofInfo oneofInfo0 = this.h;
            if(oneofInfo0 != null) {
                return FieldInfo.f(this.c, this.b, oneofInfo0, this.i, this.g, this.k);
            }
            Object object0 = this.j;
            if(object0 != null) {
                return FieldInfo.e(this.a, this.c, object0, this.k);
            }
            Field field0 = this.d;
            if(field0 != null) {
                return this.f ? FieldInfo.j(this.a, this.c, this.b, field0, this.e, this.g, this.k) : FieldInfo.i(this.a, this.c, this.b, field0, this.e, this.g, this.k);
            }
            EnumVerifier internal$EnumVerifier0 = this.k;
            if(internal$EnumVerifier0 != null) {
                return this.l == null ? FieldInfo.d(this.a, this.c, this.b, internal$EnumVerifier0) : FieldInfo.h(this.a, this.c, this.b, internal$EnumVerifier0, this.l);
            }
            return this.l == null ? FieldInfo.c(this.a, this.c, this.b, this.g) : FieldInfo.g(this.a, this.c, this.b, this.l);
        }

        public Builder b(Field field0) {
            this.l = field0;
            return this;
        }

        public Builder c(boolean z) {
            this.g = z;
            return this;
        }

        public Builder d(EnumVerifier internal$EnumVerifier0) {
            this.k = internal$EnumVerifier0;
            return this;
        }

        public Builder e(Field field0) {
            if(this.h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.a = field0;
            return this;
        }

        public Builder f(int v) {
            this.c = v;
            return this;
        }

        public Builder g(Object object0) {
            this.j = object0;
            return this;
        }

        public Builder h(OneofInfo oneofInfo0, Class class0) {
            if(this.a != null || this.d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.h = oneofInfo0;
            this.i = class0;
            return this;
        }

        public Builder i(Field field0, int v) {
            this.d = (Field)Internal.e(field0, "presenceField");
            this.e = v;
            return this;
        }

        public Builder j(boolean z) {
            this.f = z;
            return this;
        }

        public Builder k(FieldType fieldType0) {
            this.b = fieldType0;
            return this;
        }
    }

    private final Field a;
    private final FieldType b;
    private final Class c;
    private final int d;
    private final Field e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final OneofInfo i;
    private final Field j;
    private final Class k;
    private final Object l;
    private final EnumVerifier m;

    private FieldInfo(Field field0, int v, FieldType fieldType0, Class class0, Field field1, int v1, boolean z, boolean z1, OneofInfo oneofInfo0, Class class1, Object object0, EnumVerifier internal$EnumVerifier0, Field field2) {
        this.a = field0;
        this.b = fieldType0;
        this.c = class0;
        this.d = v;
        this.e = field1;
        this.f = v1;
        this.g = z;
        this.h = z1;
        this.i = oneofInfo0;
        this.k = class1;
        this.l = object0;
        this.m = internal$EnumVerifier0;
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

    public static Builder D() {
        return new Builder(null);
    }

    private static void a(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + v);
        }
    }

    public int b(FieldInfo fieldInfo0) {
        return this.d - fieldInfo0.d;
    }

    public static FieldInfo c(Field field0, int v, FieldType fieldType0, boolean z) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        Internal.e(fieldType0, "fieldType");
        if(fieldType0 == FieldType.G || fieldType0 == FieldType.U8) {
            throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
        }
        return new FieldInfo(field0, v, fieldType0, null, null, 0, false, z, null, null, null, null, null);
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((FieldInfo)object0));
    }

    public static FieldInfo d(Field field0, int v, FieldType fieldType0, EnumVerifier internal$EnumVerifier0) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        return new FieldInfo(field0, v, fieldType0, null, null, 0, false, false, null, null, null, internal$EnumVerifier0, null);
    }

    public static FieldInfo e(Field field0, int v, Object object0, EnumVerifier internal$EnumVerifier0) {
        Internal.e(object0, "mapDefaultEntry");
        FieldInfo.a(v);
        Internal.e(field0, "field");
        return new FieldInfo(field0, v, FieldType.V8, null, null, 0, false, true, null, null, object0, internal$EnumVerifier0, null);
    }

    public static FieldInfo f(int v, FieldType fieldType0, OneofInfo oneofInfo0, Class class0, boolean z, EnumVerifier internal$EnumVerifier0) {
        FieldInfo.a(v);
        Internal.e(fieldType0, "fieldType");
        Internal.e(oneofInfo0, "oneof");
        Internal.e(class0, "oneofStoredType");
        if(!fieldType0.i()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + v + " is of type " + fieldType0);
        }
        return new FieldInfo(null, v, fieldType0, null, null, 0, false, z, oneofInfo0, class0, null, internal$EnumVerifier0, null);
    }

    public static FieldInfo g(Field field0, int v, FieldType fieldType0, Field field1) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        Internal.e(fieldType0, "fieldType");
        if(fieldType0 == FieldType.G || fieldType0 == FieldType.U8) {
            throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
        }
        return new FieldInfo(field0, v, fieldType0, null, null, 0, false, false, null, null, null, null, field1);
    }

    public static FieldInfo h(Field field0, int v, FieldType fieldType0, EnumVerifier internal$EnumVerifier0, Field field1) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        return new FieldInfo(field0, v, fieldType0, null, null, 0, false, false, null, null, null, internal$EnumVerifier0, field1);
    }

    public static FieldInfo i(Field field0, int v, FieldType fieldType0, Field field1, int v1, boolean z, EnumVerifier internal$EnumVerifier0) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        Internal.e(fieldType0, "fieldType");
        Internal.e(field1, "presenceField");
        if(field1 != null && !FieldInfo.B(v1)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v1);
        }
        return new FieldInfo(field0, v, fieldType0, null, field1, v1, false, z, null, null, null, internal$EnumVerifier0, null);
    }

    public static FieldInfo j(Field field0, int v, FieldType fieldType0, Field field1, int v1, boolean z, EnumVerifier internal$EnumVerifier0) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        Internal.e(fieldType0, "fieldType");
        Internal.e(field1, "presenceField");
        if(field1 != null && !FieldInfo.B(v1)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v1);
        }
        return new FieldInfo(field0, v, fieldType0, null, field1, v1, true, z, null, null, null, internal$EnumVerifier0, null);
    }

    public static FieldInfo k(Field field0, int v, FieldType fieldType0, Class class0) {
        FieldInfo.a(v);
        Internal.e(field0, "field");
        Internal.e(fieldType0, "fieldType");
        Internal.e(class0, "messageClass");
        return new FieldInfo(field0, v, fieldType0, class0, null, 0, false, false, null, null, null, null, null);
    }

    public Field l() {
        return this.j;
    }

    public EnumVerifier m() {
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

    public OneofInfo u() {
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

    public FieldType z() {
        return this.b;
    }
}

