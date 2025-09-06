package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import io.realm.internal.c.b;
import io.realm.internal.c;
import j..util.DesugarCollections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public abstract class f1 {
    static final class a extends c {
        private final Table e;

        a(Table table0) {
            super(null, false);
            this.e = table0;
        }

        @Override  // io.realm.internal.c
        protected c c(boolean z) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override  // io.realm.internal.c
        protected void d(c c0, c c1) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override  // io.realm.internal.c
        public void e(c c0) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override  // io.realm.internal.c
        public b f(String s) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support \'getColumnDetails\'");
        }

        @Override  // io.realm.internal.c
        public long g(String s) {
            return this.e.F(s);
        }
    }

    static final class io.realm.f1.b {
        final RealmFieldType a;
        final RealmFieldType b;
        final boolean c;

        io.realm.f1.b(RealmFieldType realmFieldType0, @h RealmFieldType realmFieldType1, boolean z) {
            this.a = realmFieldType0;
            this.b = realmFieldType1;
            this.c = z;
        }
    }

    public interface io.realm.f1.c {
        void a(G arg1);
    }

    final h1 a;
    final io.realm.a b;
    final Table c;
    final c d;
    static final Map e;
    static final Map f;
    static final Map g;
    static final Map h;

    static {
        HashMap hashMap0 = new HashMap();
        io.realm.f1.b f1$b0 = new io.realm.f1.b(RealmFieldType.STRING, RealmFieldType.STRING_LIST, true);
        hashMap0.put(String.class, f1$b0);
        Class class0 = Short.TYPE;
        RealmFieldType realmFieldType0 = RealmFieldType.INTEGER;
        hashMap0.put(class0, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, false));
        io.realm.f1.b f1$b1 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, true);
        hashMap0.put(Short.class, f1$b1);
        Class class1 = Integer.TYPE;
        hashMap0.put(class1, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, false));
        io.realm.f1.b f1$b2 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, true);
        hashMap0.put(Integer.class, f1$b2);
        Class class2 = Long.TYPE;
        hashMap0.put(class2, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, false));
        io.realm.f1.b f1$b3 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, true);
        hashMap0.put(Long.class, f1$b3);
        Class class3 = Float.TYPE;
        hashMap0.put(class3, new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, false));
        io.realm.f1.b f1$b4 = new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, true);
        hashMap0.put(Float.class, f1$b4);
        Class class4 = Double.TYPE;
        hashMap0.put(class4, new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, false));
        io.realm.f1.b f1$b5 = new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, true);
        hashMap0.put(Double.class, f1$b5);
        Class class5 = Boolean.TYPE;
        hashMap0.put(class5, new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, false));
        io.realm.f1.b f1$b6 = new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, true);
        hashMap0.put(Boolean.class, f1$b6);
        Class class6 = Byte.TYPE;
        hashMap0.put(class6, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, false));
        io.realm.f1.b f1$b7 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_LIST, true);
        hashMap0.put(Byte.class, f1$b7);
        io.realm.f1.b f1$b8 = new io.realm.f1.b(RealmFieldType.BINARY, RealmFieldType.BINARY_LIST, true);
        hashMap0.put(byte[].class, f1$b8);
        io.realm.f1.b f1$b9 = new io.realm.f1.b(RealmFieldType.DATE, RealmFieldType.DATE_LIST, true);
        hashMap0.put(Date.class, f1$b9);
        io.realm.f1.b f1$b10 = new io.realm.f1.b(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_LIST, true);
        hashMap0.put(ObjectId.class, f1$b10);
        io.realm.f1.b f1$b11 = new io.realm.f1.b(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_LIST, true);
        hashMap0.put(Decimal128.class, f1$b11);
        io.realm.f1.b f1$b12 = new io.realm.f1.b(RealmFieldType.UUID, RealmFieldType.UUID_LIST, true);
        hashMap0.put(UUID.class, f1$b12);
        io.realm.f1.b f1$b13 = new io.realm.f1.b(RealmFieldType.MIXED, RealmFieldType.MIXED_LIST, true);
        hashMap0.put(G0.class, f1$b13);
        f1.e = DesugarCollections.unmodifiableMap(hashMap0);
        HashMap hashMap1 = new HashMap();
        io.realm.f1.b f1$b14 = new io.realm.f1.b(RealmFieldType.STRING, RealmFieldType.STRING_TO_STRING_MAP, true);
        hashMap1.put(String.class, f1$b14);
        hashMap1.put(class0, new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        io.realm.f1.b f1$b15 = new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, true);
        hashMap1.put(Short.class, f1$b15);
        hashMap1.put(class1, new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        io.realm.f1.b f1$b16 = new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, true);
        hashMap1.put(Integer.class, f1$b16);
        hashMap1.put(class2, new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        io.realm.f1.b f1$b17 = new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, true);
        hashMap1.put(Long.class, f1$b17);
        hashMap1.put(class3, new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.STRING_TO_FLOAT_MAP, false));
        io.realm.f1.b f1$b18 = new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.STRING_TO_FLOAT_MAP, true);
        hashMap1.put(Float.class, f1$b18);
        hashMap1.put(class4, new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.STRING_TO_DOUBLE_MAP, false));
        io.realm.f1.b f1$b19 = new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.STRING_TO_DOUBLE_MAP, true);
        hashMap1.put(Double.class, f1$b19);
        hashMap1.put(class5, new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.STRING_TO_BOOLEAN_MAP, false));
        io.realm.f1.b f1$b20 = new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.STRING_TO_BOOLEAN_MAP, true);
        hashMap1.put(Boolean.class, f1$b20);
        hashMap1.put(class6, new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        io.realm.f1.b f1$b21 = new io.realm.f1.b(realmFieldType0, RealmFieldType.STRING_TO_INTEGER_MAP, true);
        hashMap1.put(Byte.class, f1$b21);
        io.realm.f1.b f1$b22 = new io.realm.f1.b(RealmFieldType.BINARY, RealmFieldType.STRING_TO_BINARY_MAP, true);
        hashMap1.put(byte[].class, f1$b22);
        io.realm.f1.b f1$b23 = new io.realm.f1.b(RealmFieldType.DATE, RealmFieldType.STRING_TO_DATE_MAP, true);
        hashMap1.put(Date.class, f1$b23);
        io.realm.f1.b f1$b24 = new io.realm.f1.b(RealmFieldType.OBJECT_ID, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true);
        hashMap1.put(ObjectId.class, f1$b24);
        io.realm.f1.b f1$b25 = new io.realm.f1.b(RealmFieldType.DECIMAL128, RealmFieldType.STRING_TO_DECIMAL128_MAP, true);
        hashMap1.put(Decimal128.class, f1$b25);
        io.realm.f1.b f1$b26 = new io.realm.f1.b(RealmFieldType.UUID, RealmFieldType.STRING_TO_UUID_MAP, true);
        hashMap1.put(UUID.class, f1$b26);
        io.realm.f1.b f1$b27 = new io.realm.f1.b(RealmFieldType.MIXED, RealmFieldType.STRING_TO_MIXED_MAP, true);
        hashMap1.put(G0.class, f1$b27);
        f1.f = DesugarCollections.unmodifiableMap(hashMap1);
        HashMap hashMap2 = new HashMap();
        io.realm.f1.b f1$b28 = new io.realm.f1.b(RealmFieldType.STRING, RealmFieldType.STRING_SET, true);
        hashMap2.put(String.class, f1$b28);
        hashMap2.put(class0, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, false));
        io.realm.f1.b f1$b29 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, true);
        hashMap2.put(Short.class, f1$b29);
        hashMap2.put(class1, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, false));
        io.realm.f1.b f1$b30 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, true);
        hashMap2.put(Integer.class, f1$b30);
        hashMap2.put(class2, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, false));
        io.realm.f1.b f1$b31 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, true);
        hashMap2.put(Long.class, f1$b31);
        hashMap2.put(class3, new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.FLOAT_SET, false));
        io.realm.f1.b f1$b32 = new io.realm.f1.b(RealmFieldType.FLOAT, RealmFieldType.FLOAT_SET, true);
        hashMap2.put(Float.class, f1$b32);
        hashMap2.put(class4, new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_SET, false));
        io.realm.f1.b f1$b33 = new io.realm.f1.b(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_SET, true);
        hashMap2.put(Double.class, f1$b33);
        hashMap2.put(class5, new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_SET, false));
        io.realm.f1.b f1$b34 = new io.realm.f1.b(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_SET, true);
        hashMap2.put(Boolean.class, f1$b34);
        hashMap2.put(class6, new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, false));
        io.realm.f1.b f1$b35 = new io.realm.f1.b(realmFieldType0, RealmFieldType.INTEGER_SET, true);
        hashMap2.put(Byte.class, f1$b35);
        io.realm.f1.b f1$b36 = new io.realm.f1.b(RealmFieldType.BINARY, RealmFieldType.BINARY_SET, true);
        hashMap2.put(byte[].class, f1$b36);
        io.realm.f1.b f1$b37 = new io.realm.f1.b(RealmFieldType.DATE, RealmFieldType.DATE_SET, true);
        hashMap2.put(Date.class, f1$b37);
        io.realm.f1.b f1$b38 = new io.realm.f1.b(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_SET, true);
        hashMap2.put(ObjectId.class, f1$b38);
        io.realm.f1.b f1$b39 = new io.realm.f1.b(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_SET, true);
        hashMap2.put(Decimal128.class, f1$b39);
        io.realm.f1.b f1$b40 = new io.realm.f1.b(RealmFieldType.UUID, RealmFieldType.UUID_SET, true);
        hashMap2.put(UUID.class, f1$b40);
        io.realm.f1.b f1$b41 = new io.realm.f1.b(RealmFieldType.MIXED, RealmFieldType.MIXED_SET, true);
        hashMap2.put(G0.class, f1$b41);
        f1.g = DesugarCollections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        io.realm.f1.b f1$b42 = new io.realm.f1.b(RealmFieldType.OBJECT, null, false);
        hashMap3.put(d1.class, f1$b42);
        io.realm.f1.b f1$b43 = new io.realm.f1.b(RealmFieldType.LIST, null, false);
        hashMap3.put(T0.class, f1$b43);
        io.realm.f1.b f1$b44 = new io.realm.f1.b(RealmFieldType.STRING_TO_LINK_MAP, null, false);
        hashMap3.put(R0.class, f1$b44);
        io.realm.f1.b f1$b45 = new io.realm.f1.b(RealmFieldType.LINK_SET, null, false);
        hashMap3.put(i1.class, f1$b45);
        f1.h = DesugarCollections.unmodifiableMap(hashMap3);
    }

    f1(io.realm.a a0, h1 h10, Table table0, c c0) {
        this.a = h10;
        this.b = a0;
        this.c = table0;
        this.d = c0;
    }

    public boolean A() {
        return this.c.a0();
    }

    public boolean B(String s) {
        long v = this.q(s);
        return this.c.Z(v);
    }

    public boolean C(String s) {
        this.m(s);
        return s.equals(OsObjectStore.c(this.b.e, this.p()));
    }

    boolean D(RealmFieldType realmFieldType0) {
        return realmFieldType0 == RealmFieldType.OBJECT || realmFieldType0 == RealmFieldType.LIST;
    }

    public boolean E(String s) {
        long v = this.q(s);
        return !this.c.Z(v);
    }

    public abstract f1 F(String arg1);

    public abstract f1 G(String arg1);

    public abstract f1 H();

    public abstract f1 I(String arg1, String arg2);

    public abstract f1 J(String arg1);

    public void K(boolean z) {
        this.L(z, false);
    }

    public void L(boolean z, boolean z1) {
        if(this.z()) {
            throw new IllegalStateException("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: " + this.p());
        }
        if(!this.c.r0(z, z1) && z) {
            throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
        }
    }

    public abstract f1 M(String arg1, boolean arg2);

    public abstract f1 N(String arg1, boolean arg2);

    public abstract f1 O(io.realm.f1.c arg1);

    f1 a(String s, RealmFieldType realmFieldType0, f1 f10) {
        String s1 = Table.T(f10.p());
        Table table0 = this.b.f0().getTable(s1);
        this.c.d(realmFieldType0, s, table0);
        return this;
    }

    f1 b(String s, RealmFieldType realmFieldType0, boolean z, boolean z1, boolean z2) {
        long v = this.c.b(realmFieldType0, s, !z2);
        if(z1) {
            this.c.f(v);
        }
        if(z) {
            OsObjectStore.e(this.b.e, this.p(), s);
        }
        return this;
    }

    public abstract f1 c(String arg1, Class arg2, L[] arg3);

    public abstract f1 d(String arg1);

    public abstract f1 e(String arg1);

    public abstract f1 f(String arg1, f1 arg2);

    public abstract f1 g(String arg1, Class arg2);

    public abstract f1 h(String arg1, f1 arg2);

    public abstract f1 i(String arg1, Class arg2);

    public abstract f1 j(String arg1, f1 arg2);

    public abstract f1 k(String arg1, f1 arg2);

    public abstract f1 l(String arg1, Class arg2);

    void m(String s) {
        if(this.c.F(s) == -1L) {
            throw new IllegalArgumentException("Field name doesn\'t exist on object \'" + this.p() + "\': " + s);
        }
    }

    static void n(String s) {
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if(s.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain \'.\'");
        }
        if(s.length() > 0x3F) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    long o(String s) {
        long v = this.d.g(s);
        if(v < 0L) {
            throw new IllegalArgumentException("Field does not exist: " + s);
        }
        return v;
    }

    public String p() {
        return this.c.C();
    }

    long q(String s) {
        long v = this.c.F(s);
        if(v == -1L) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field name \'%s\' does not exist on schema for \'%s\'", s, this.p()));
        }
        return v;
    }

    long r(String s) {
        return this.d.g(s);
    }

    public Set s() {
        Set set0 = new LinkedHashSet(((int)this.c.E()));
        String[] arr_s = this.c.H();
        for(int v = 0; v < arr_s.length; ++v) {
            set0.add(arr_s[v]);
        }
        return set0;
    }

    public RealmFieldType t(String s) {
        long v = this.q(s);
        return this.c.I(v);
    }

    public String u() {
        String s = OsObjectStore.c(this.b.e, this.p());
        if(s == null) {
            throw new IllegalStateException(this.p() + " doesn\'t have a primary key.");
        }
        return s;
    }

    abstract String v(String arg1);

    Table w() {
        return this.c;
    }

    public boolean x(String s) {
        return this.c.F(s) != -1L;
    }

    public boolean y(String s) {
        f1.n(s);
        this.m(s);
        long v = this.c.F(s);
        return this.c.X(v);
    }

    public boolean z() {
        return OsObjectStore.c(this.b.e, this.p()) != null;
    }
}

