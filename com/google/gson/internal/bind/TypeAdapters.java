package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.c;
import com.google.gson.internal.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    static final class EnumTypeAdapter extends TypeAdapter {
        private final Map a;
        private final Map b;
        private final Map c;

        public EnumTypeAdapter(Class class0) {
            class a implements PrivilegedAction {
                final Class a;
                final EnumTypeAdapter b;

                a(Class class0) {
                    this.a = class0;
                    super();
                }

                public Field[] a() {
                    Field[] arr_field = this.a.getDeclaredFields();
                    ArrayList arrayList0 = new ArrayList(arr_field.length);
                    for(int v = 0; v < arr_field.length; ++v) {
                        Field field0 = arr_field[v];
                        if(field0.isEnumConstant()) {
                            arrayList0.add(field0);
                        }
                    }
                    Field[] arr_field1 = (Field[])arrayList0.toArray(new Field[0]);
                    AccessibleObject.setAccessible(arr_field1, true);
                    return arr_field1;
                }

                @Override
                public Object run() {
                    return this.a();
                }
            }

            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            try {
                Field[] arr_field = (Field[])AccessController.doPrivileged(new a(this, class0));
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    Enum enum0 = (Enum)field0.get(null);
                    String s = enum0.name();
                    String s1 = enum0.toString();
                    c c0 = (c)field0.getAnnotation(c.class);
                    if(c0 != null) {
                        s = c0.value();
                        String[] arr_s = c0.alternate();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            this.a.put(arr_s[v1], enum0);
                        }
                    }
                    this.a.put(s, enum0);
                    this.b.put(s1, enum0);
                    this.c.put(enum0, s);
                }
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
            }
            throw new AssertionError(illegalAccessException0);
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(com.google.gson.stream.a a0) throws IOException {
            return this.j(a0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            this.k(d0, ((Enum)object0));
        }

        public Enum j(com.google.gson.stream.a a0) throws IOException {
            if(a0.f0() == com.google.gson.stream.c.i) {
                a0.T();
                return null;
            }
            String s = a0.d0();
            Enum enum0 = (Enum)this.a.get(s);
            return enum0 == null ? ((Enum)this.b.get(s)) : enum0;
        }

        public void k(d d0, Enum enum0) throws IOException {
            d0.E0((enum0 == null ? null : ((String)this.c.get(enum0))));
        }
    }

    static class com.google.gson.internal.bind.TypeAdapters.a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.gson.stream.c.values().length];
            com.google.gson.internal.bind.TypeAdapters.a.a = arr_v;
            try {
                arr_v[com.google.gson.stream.c.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.gson.internal.bind.TypeAdapters.a.a[com.google.gson.stream.c.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.gson.internal.bind.TypeAdapters.a.a[com.google.gson.stream.c.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.gson.internal.bind.TypeAdapters.a.a[com.google.gson.stream.c.a.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.gson.internal.bind.TypeAdapters.a.a[com.google.gson.stream.c.c.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.gson.internal.bind.TypeAdapters.a.a[com.google.gson.stream.c.i.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final TypeAdapter A;
    public static final TypeAdapter B;
    public static final y C;
    public static final TypeAdapter D;
    public static final y E;
    public static final TypeAdapter F;
    public static final y G;
    public static final TypeAdapter H;
    public static final y I;
    public static final TypeAdapter J;
    public static final y K;
    public static final TypeAdapter L;
    public static final y M;
    public static final TypeAdapter N;
    public static final y O;
    public static final TypeAdapter P;
    public static final y Q;
    public static final TypeAdapter R;
    public static final y S;
    public static final TypeAdapter T;
    public static final y U;
    public static final TypeAdapter V;
    public static final y W;
    public static final y X;
    public static final TypeAdapter a;
    public static final y b;
    public static final TypeAdapter c;
    public static final y d;
    public static final TypeAdapter e;
    public static final TypeAdapter f;
    public static final y g;
    public static final TypeAdapter h;
    public static final y i;
    public static final TypeAdapter j;
    public static final y k;
    public static final TypeAdapter l;
    public static final y m;
    public static final TypeAdapter n;
    public static final y o;
    public static final TypeAdapter p;
    public static final y q;
    public static final TypeAdapter r;
    public static final y s;
    public static final TypeAdapter t;
    public static final TypeAdapter u;
    public static final TypeAdapter v;
    public static final TypeAdapter w;
    public static final y x;
    public static final TypeAdapter y;
    public static final TypeAdapter z;

    static {
        TypeAdapter typeAdapter0 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Class)object0));
            }

            public Class j(com.google.gson.stream.a a0) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void k(d d0, Class class0) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + class0.getName() + ". Forgot to register a type adapter?");
            }
        }.d();
        TypeAdapters.a = typeAdapter0;
        TypeAdapters.b = TypeAdapters.b(Class.class, typeAdapter0);
        TypeAdapter typeAdapter1 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((BitSet)object0));
            }

            public BitSet j(com.google.gson.stream.a a0) throws IOException {
                BitSet bitSet0 = new BitSet();
                a0.a();
                com.google.gson.stream.c c0 = a0.f0();
                int v = 0;
                while(c0 != com.google.gson.stream.c.b) {
                    boolean z = true;
                    switch(c0) {
                        case 1: 
                        case 2: {
                            int v1 = a0.x();
                            if(v1 == 0) {
                                z = false;
                            }
                            else if(v1 != 1) {
                                throw new t("Invalid bitset value " + v1 + ", expected 0 or 1; at path " + a0.o());
                            }
                            break;
                        }
                        case 3: {
                            z = a0.v();
                            break;
                        }
                        default: {
                            throw new t("Invalid bitset value type: " + c0 + "; at path " + a0.getPath());
                        }
                    }
                    if(z) {
                        bitSet0.set(v);
                    }
                    ++v;
                    c0 = a0.f0();
                }
                a0.i();
                return bitSet0;
            }

            public void k(d d0, BitSet bitSet0) throws IOException {
                d0.c();
                int v = bitSet0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    d0.l0(((long)bitSet0.get(v1)));
                }
                d0.i();
            }
        }.d();
        TypeAdapters.c = typeAdapter1;
        TypeAdapters.d = TypeAdapters.b(BitSet.class, typeAdapter1);
        com.google.gson.internal.bind.TypeAdapters.3 typeAdapters$30 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Boolean)object0));
            }

            public Boolean j(com.google.gson.stream.a a0) throws IOException {
                com.google.gson.stream.c c0 = a0.f0();
                if(c0 == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return c0 == com.google.gson.stream.c.f ? Boolean.valueOf(Boolean.parseBoolean(a0.d0())) : Boolean.valueOf(a0.v());
            }

            public void k(d d0, Boolean boolean0) throws IOException {
                d0.u0(boolean0);
            }
        };
        TypeAdapters.e = typeAdapters$30;
        TypeAdapters.f = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Boolean)object0));
            }

            public Boolean j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return Boolean.valueOf(a0.d0());
            }

            public void k(d d0, Boolean boolean0) throws IOException {
                d0.E0((boolean0 == null ? "null" : boolean0.toString()));
            }
        };
        TypeAdapters.g = TypeAdapters.c(Boolean.TYPE, Boolean.class, typeAdapters$30);
        com.google.gson.internal.bind.TypeAdapters.5 typeAdapters$50 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                int v;
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                try {
                    v = a0.x();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t(numberFormatException0);
                }
                if(v > 0xFF || v < 0xFFFFFF80) {
                    throw new t("Lossy conversion from " + v + " to byte; at path " + a0.o());
                }
                return (byte)v;
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.l0(((long)number0.byteValue()));
            }
        };
        TypeAdapters.h = typeAdapters$50;
        TypeAdapters.i = TypeAdapters.c(Byte.TYPE, Byte.class, typeAdapters$50);
        com.google.gson.internal.bind.TypeAdapters.6 typeAdapters$60 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                int v;
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                try {
                    v = a0.x();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t(numberFormatException0);
                }
                if(v > 0xFFFF || v < 0xFFFF8000) {
                    throw new t("Lossy conversion from " + v + " to short; at path " + a0.o());
                }
                return (short)v;
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.l0(((long)number0.shortValue()));
            }
        };
        TypeAdapters.j = typeAdapters$60;
        TypeAdapters.k = TypeAdapters.c(Short.TYPE, Short.class, typeAdapters$60);
        com.google.gson.internal.bind.TypeAdapters.7 typeAdapters$70 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                try {
                    return a0.x();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t(numberFormatException0);
                }
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.l0(((long)number0.intValue()));
            }
        };
        TypeAdapters.l = typeAdapters$70;
        TypeAdapters.m = TypeAdapters.c(Integer.TYPE, Integer.class, typeAdapters$70);
        TypeAdapter typeAdapter2 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((AtomicInteger)object0));
            }

            public AtomicInteger j(com.google.gson.stream.a a0) throws IOException {
                try {
                    return new AtomicInteger(a0.x());
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t(numberFormatException0);
                }
            }

            public void k(d d0, AtomicInteger atomicInteger0) throws IOException {
                d0.l0(((long)atomicInteger0.get()));
            }
        }.d();
        TypeAdapters.n = typeAdapter2;
        TypeAdapters.o = TypeAdapters.b(AtomicInteger.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((AtomicBoolean)object0));
            }

            public AtomicBoolean j(com.google.gson.stream.a a0) throws IOException {
                return new AtomicBoolean(a0.v());
            }

            public void k(d d0, AtomicBoolean atomicBoolean0) throws IOException {
                d0.L0(atomicBoolean0.get());
            }
        }.d();
        TypeAdapters.p = typeAdapter3;
        TypeAdapters.q = TypeAdapters.b(AtomicBoolean.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((AtomicIntegerArray)object0));
            }

            public AtomicIntegerArray j(com.google.gson.stream.a a0) throws IOException {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.p()) {
                    try {
                        arrayList0.add(a0.x());
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new t(numberFormatException0);
                    }
                }
                a0.i();
                int v = arrayList0.size();
                AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    atomicIntegerArray0.set(v1, ((int)(((Integer)arrayList0.get(v1)))));
                }
                return atomicIntegerArray0;
            }

            public void k(d d0, AtomicIntegerArray atomicIntegerArray0) throws IOException {
                d0.c();
                int v = atomicIntegerArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    d0.l0(((long)atomicIntegerArray0.get(v1)));
                }
                d0.i();
            }
        }.d();
        TypeAdapters.r = typeAdapter4;
        TypeAdapters.s = TypeAdapters.b(AtomicIntegerArray.class, typeAdapter4);
        TypeAdapters.t = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                try {
                    return a0.L();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t(numberFormatException0);
                }
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.l0(number0.longValue());
            }
        };
        TypeAdapters.u = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return (float)a0.w();
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                if(!(number0 instanceof Float)) {
                    number0 = number0.floatValue();
                }
                d0.x0(number0);
            }
        };
        TypeAdapters.v = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return a0.w();
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.f0(number0.doubleValue());
            }
        };
        com.google.gson.internal.bind.TypeAdapters.14 typeAdapters$140 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Character)object0));
            }

            public Character j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                String s = a0.d0();
                if(s.length() != 1) {
                    throw new t("Expecting character, got: " + s + "; at " + a0.o());
                }
                return Character.valueOf(s.charAt(0));
            }

            public void k(d d0, Character character0) throws IOException {
                d0.E0((character0 == null ? null : String.valueOf(character0)));
            }
        };
        TypeAdapters.w = typeAdapters$140;
        TypeAdapters.x = TypeAdapters.c(Character.TYPE, Character.class, typeAdapters$140);
        com.google.gson.internal.bind.TypeAdapters.15 typeAdapters$150 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((String)object0));
            }

            public String j(com.google.gson.stream.a a0) throws IOException {
                com.google.gson.stream.c c0 = a0.f0();
                if(c0 == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return c0 == com.google.gson.stream.c.h ? Boolean.toString(a0.v()) : a0.d0();
            }

            public void k(d d0, String s) throws IOException {
                d0.E0(s);
            }
        };
        TypeAdapters.y = typeAdapters$150;
        TypeAdapters.z = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((BigDecimal)object0));
            }

            public BigDecimal j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                String s = a0.d0();
                try {
                    return new BigDecimal(s);
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t("Failed parsing \'" + s + "\' as BigDecimal; at path " + a0.o(), numberFormatException0);
                }
            }

            public void k(d d0, BigDecimal bigDecimal0) throws IOException {
                d0.x0(bigDecimal0);
            }
        };
        TypeAdapters.A = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((BigInteger)object0));
            }

            public BigInteger j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                String s = a0.d0();
                try {
                    return new BigInteger(s);
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new t("Failed parsing \'" + s + "\' as BigInteger; at path " + a0.o(), numberFormatException0);
                }
            }

            public void k(d d0, BigInteger bigInteger0) throws IOException {
                d0.x0(bigInteger0);
            }
        };
        TypeAdapters.B = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((g)object0));
            }

            public g j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return new g(a0.d0());
            }

            public void k(d d0, g g0) throws IOException {
                d0.x0(g0);
            }
        };
        TypeAdapters.C = TypeAdapters.b(String.class, typeAdapters$150);
        com.google.gson.internal.bind.TypeAdapters.19 typeAdapters$190 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((StringBuilder)object0));
            }

            public StringBuilder j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return new StringBuilder(a0.d0());
            }

            public void k(d d0, StringBuilder stringBuilder0) throws IOException {
                d0.E0((stringBuilder0 == null ? null : stringBuilder0.toString()));
            }
        };
        TypeAdapters.D = typeAdapters$190;
        TypeAdapters.E = TypeAdapters.b(StringBuilder.class, typeAdapters$190);
        com.google.gson.internal.bind.TypeAdapters.20 typeAdapters$200 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((StringBuffer)object0));
            }

            public StringBuffer j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return new StringBuffer(a0.d0());
            }

            public void k(d d0, StringBuffer stringBuffer0) throws IOException {
                d0.E0((stringBuffer0 == null ? null : stringBuffer0.toString()));
            }
        };
        TypeAdapters.F = typeAdapters$200;
        TypeAdapters.G = TypeAdapters.b(StringBuffer.class, typeAdapters$200);
        com.google.gson.internal.bind.TypeAdapters.21 typeAdapters$210 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((URL)object0));
            }

            public URL j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                String s = a0.d0();
                return "null".equals(s) ? null : new URL(s);
            }

            public void k(d d0, URL uRL0) throws IOException {
                d0.E0((uRL0 == null ? null : uRL0.toExternalForm()));
            }
        };
        TypeAdapters.H = typeAdapters$210;
        TypeAdapters.I = TypeAdapters.b(URL.class, typeAdapters$210);
        com.google.gson.internal.bind.TypeAdapters.22 typeAdapters$220 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((URI)object0));
            }

            public URI j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                try {
                    String s = a0.d0();
                    return "null".equals(s) ? null : new URI(s);
                }
                catch(URISyntaxException uRISyntaxException0) {
                    throw new k(uRISyntaxException0);
                }
            }

            public void k(d d0, URI uRI0) throws IOException {
                d0.E0((uRI0 == null ? null : uRI0.toASCIIString()));
            }
        };
        TypeAdapters.J = typeAdapters$220;
        TypeAdapters.K = TypeAdapters.b(URI.class, typeAdapters$220);
        com.google.gson.internal.bind.TypeAdapters.23 typeAdapters$230 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((InetAddress)object0));
            }

            public InetAddress j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return InetAddress.getByName(a0.d0());
            }

            public void k(d d0, InetAddress inetAddress0) throws IOException {
                d0.E0((inetAddress0 == null ? null : inetAddress0.getHostAddress()));
            }
        };
        TypeAdapters.L = typeAdapters$230;
        TypeAdapters.M = TypeAdapters.e(InetAddress.class, typeAdapters$230);
        com.google.gson.internal.bind.TypeAdapters.24 typeAdapters$240 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((UUID)object0));
            }

            public UUID j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                String s = a0.d0();
                try {
                    return UUID.fromString(s);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new t("Failed parsing \'" + s + "\' as UUID; at path " + a0.o(), illegalArgumentException0);
                }
            }

            public void k(d d0, UUID uUID0) throws IOException {
                d0.E0((uUID0 == null ? null : uUID0.toString()));
            }
        };
        TypeAdapters.N = typeAdapters$240;
        TypeAdapters.O = TypeAdapters.b(UUID.class, typeAdapters$240);
        TypeAdapter typeAdapter5 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Currency)object0));
            }

            public Currency j(com.google.gson.stream.a a0) throws IOException {
                String s = a0.d0();
                try {
                    return Currency.getInstance(s);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new t("Failed parsing \'" + s + "\' as Currency; at path " + a0.o(), illegalArgumentException0);
                }
            }

            public void k(d d0, Currency currency0) throws IOException {
                d0.E0(currency0.getCurrencyCode());
            }
        }.d();
        TypeAdapters.P = typeAdapter5;
        TypeAdapters.Q = TypeAdapters.b(Currency.class, typeAdapter5);
        com.google.gson.internal.bind.TypeAdapters.26 typeAdapters$260 = new TypeAdapter() {
            private static final String a = "year";
            private static final String b = "month";
            private static final String c = "dayOfMonth";
            private static final String d = "hourOfDay";
            private static final String e = "minute";
            private static final String f = "second";

            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Calendar)object0));
            }

            public Calendar j(com.google.gson.stream.a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                a0.b();
                int v = 0;
                int v1 = 0;
                int v2 = 0;
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                while(a0.f0() != com.google.gson.stream.c.d) {
                    String s = a0.Q();
                    int v6 = a0.x();
                    if("year".equals(s)) {
                        v = v6;
                    }
                    else if("month".equals(s)) {
                        v1 = v6;
                    }
                    else if("dayOfMonth".equals(s)) {
                        v2 = v6;
                    }
                    else if("hourOfDay".equals(s)) {
                        v3 = v6;
                    }
                    else if("minute".equals(s)) {
                        v4 = v6;
                    }
                    else if("second".equals(s)) {
                        v5 = v6;
                    }
                }
                a0.j();
                return new GregorianCalendar(v, v1, v2, v3, v4, v5);
            }

            public void k(d d0, Calendar calendar0) throws IOException {
                if(calendar0 == null) {
                    d0.v();
                    return;
                }
                d0.e();
                d0.s("year");
                d0.l0(((long)calendar0.get(1)));
                d0.s("month");
                d0.l0(((long)calendar0.get(2)));
                d0.s("dayOfMonth");
                d0.l0(((long)calendar0.get(5)));
                d0.s("hourOfDay");
                d0.l0(((long)calendar0.get(11)));
                d0.s("minute");
                d0.l0(((long)calendar0.get(12)));
                d0.s("second");
                d0.l0(((long)calendar0.get(13)));
                d0.j();
            }
        };
        TypeAdapters.R = typeAdapters$260;
        TypeAdapters.S = TypeAdapters.d(Calendar.class, GregorianCalendar.class, typeAdapters$260);
        com.google.gson.internal.bind.TypeAdapters.27 typeAdapters$270 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Locale)object0));
            }

            public Locale j(com.google.gson.stream.a a0) throws IOException {
                String s = null;
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                StringTokenizer stringTokenizer0 = new StringTokenizer(a0.d0(), "_");
                String s1 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                String s2 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                if(stringTokenizer0.hasMoreElements()) {
                    s = stringTokenizer0.nextToken();
                }
                if(s2 == null && s == null) {
                    return new Locale(s1);
                }
                return s == null ? new Locale(s1, s2) : new Locale(s1, s2, s);
            }

            public void k(d d0, Locale locale0) throws IOException {
                d0.E0((locale0 == null ? null : locale0.toString()));
            }
        };
        TypeAdapters.T = typeAdapters$270;
        TypeAdapters.U = TypeAdapters.b(Locale.class, typeAdapters$270);
        com.google.gson.internal.bind.TypeAdapters.28 typeAdapters$280 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(com.google.gson.stream.a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.m(d0, ((j)object0));
            }

            public j j(com.google.gson.stream.a a0) throws IOException {
                if(a0 instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a)a0).d1();
                }
                com.google.gson.stream.c c0 = a0.f0();
                j j0 = this.l(a0, c0);
                if(j0 == null) {
                    return this.k(a0, c0);
                }
                ArrayDeque arrayDeque0 = new ArrayDeque();
                while(true) {
                    if(a0.p()) {
                        String s = j0 instanceof m ? a0.Q() : null;
                        com.google.gson.stream.c c1 = a0.f0();
                        j j1 = this.l(a0, c1);
                        boolean z = j1 != null;
                        if(j1 == null) {
                            j1 = this.k(a0, c1);
                        }
                        if(j0 instanceof com.google.gson.g) {
                            ((com.google.gson.g)j0).z(j1);
                        }
                        else {
                            ((m)j0).z(s, j1);
                        }
                        if(!z) {
                            continue;
                        }
                        arrayDeque0.addLast(j0);
                        j0 = j1;
                    }
                    else {
                        if(j0 instanceof com.google.gson.g) {
                            a0.i();
                        }
                        else {
                            a0.j();
                        }
                        if(arrayDeque0.isEmpty()) {
                            break;
                        }
                        j0 = (j)arrayDeque0.removeLast();
                    }
                }
                return j0;
            }

            private j k(com.google.gson.stream.a a0, com.google.gson.stream.c c0) throws IOException {
                switch(c0) {
                    case 1: {
                        return new p(new g(a0.d0()));
                    }
                    case 2: {
                        return new p(a0.d0());
                    }
                    case 3: {
                        return new p(Boolean.valueOf(a0.v()));
                    }
                    case 6: {
                        a0.T();
                        return l.a;
                    }
                    default: {
                        throw new IllegalStateException("Unexpected token: " + c0);
                    }
                }
            }

            private j l(com.google.gson.stream.a a0, com.google.gson.stream.c c0) throws IOException {
                switch(c0) {
                    case 4: {
                        a0.a();
                        return new com.google.gson.g();
                    }
                    case 5: {
                        a0.b();
                        return new m();
                    }
                    default: {
                        return null;
                    }
                }
            }

            public void m(d d0, j j0) throws IOException {
                if(j0 != null) {
                    if(j0.y()) {
                        p p0 = j0.o();
                        if(p0.C()) {
                            d0.x0(p0.q());
                            return;
                        }
                        if(p0.A()) {
                            d0.L0(p0.d());
                            return;
                        }
                        d0.E0(p0.t());
                        return;
                    }
                    if(j0.u()) {
                        d0.c();
                        for(Object object0: j0.l()) {
                            this.m(d0, ((j)object0));
                        }
                        d0.i();
                        return;
                    }
                    if(!j0.x()) {
                        throw new IllegalArgumentException("Couldn\'t write " + j0.getClass());
                    }
                    d0.e();
                    for(Object object1: j0.n().entrySet()) {
                        d0.s(((String)((Map.Entry)object1).getKey()));
                        this.m(d0, ((j)((Map.Entry)object1).getValue()));
                    }
                    d0.j();
                    return;
                }
                d0.v();
            }
        };
        TypeAdapters.V = typeAdapters$280;
        TypeAdapters.W = TypeAdapters.e(j.class, typeAdapters$280);
        TypeAdapters.X = new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                Class class0 = a0.f();
                if(Enum.class.isAssignableFrom(class0) && class0 != Enum.class) {
                    if(!class0.isEnum()) {
                        class0 = class0.getSuperclass();
                    }
                    return new EnumTypeAdapter(class0);
                }
                return null;
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static y a(com.google.gson.reflect.a a0, TypeAdapter typeAdapter0) {
        return new y() {
            // 去混淆评级： 低(20)
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                return a0.equals(a0) ? typeAdapter0 : null;
            }
        };
    }

    public static y b(Class class0, TypeAdapter typeAdapter0) {
        return new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                return a0.f() == class0 ? typeAdapter0 : null;
            }

            @Override
            public String toString() {
                return "Factory[type=" + class0.getName() + ",adapter=" + typeAdapter0 + "]";
            }
        };
    }

    public static y c(Class class0, Class class1, TypeAdapter typeAdapter0) {
        return new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                Class class0 = a0.f();
                return class0 == class0 || class0 == class1 ? typeAdapter0 : null;
            }

            @Override
            public String toString() {
                return "Factory[type=" + class1.getName() + "+" + class0.getName() + ",adapter=" + typeAdapter0 + "]";
            }
        };
    }

    public static y d(Class class0, Class class1, TypeAdapter typeAdapter0) {
        return new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                Class class0 = a0.f();
                return class0 == class0 || class0 == class1 ? typeAdapter0 : null;
            }

            @Override
            public String toString() {
                return "Factory[type=" + class0.getName() + "+" + class1.getName() + ",adapter=" + typeAdapter0 + "]";
            }
        };
    }

    public static y e(Class class0, TypeAdapter typeAdapter0) {
        return new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                Class class0 = a0.f();
                return !class0.isAssignableFrom(class0) ? null : new TypeAdapter() {
                    final com.google.gson.internal.bind.TypeAdapters.34 b;

                    @Override  // com.google.gson.TypeAdapter
                    public Object e(com.google.gson.stream.a a0) throws IOException {
                        Object object0 = com.google.gson.internal.bind.TypeAdapters.34.this.b.e(a0);
                        if(object0 != null && !class0.isInstance(object0)) {
                            throw new t("Expected a " + class0.getName() + " but was " + object0.getClass().getName() + "; at path " + a0.o());
                        }
                        return object0;
                    }

                    @Override  // com.google.gson.TypeAdapter
                    public void i(d d0, Object object0) throws IOException {
                        com.google.gson.internal.bind.TypeAdapters.34.this.b.i(d0, object0);
                    }
                };
            }

            @Override
            public String toString() {
                return "Factory[typeHierarchy=" + class0.getName() + ",adapter=" + typeAdapter0 + "]";
            }
        };
    }
}

