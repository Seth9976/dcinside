package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.a.b;
import com.bykv.vk.openvk.preload.a.b.f;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.g;
import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.j;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.a.l;
import com.bykv.vk.openvk.preload.a.n;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
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

public final class m {
    static final class a extends r {
        private final Map a;
        private final Map b;

        public a(Class class0) {
            this.a = new HashMap();
            this.b = new HashMap();
            try {
                Enum[] arr_enum = (Enum[])class0.getEnumConstants();
                for(int v = 0; v < arr_enum.length; ++v) {
                    Enum enum0 = arr_enum[v];
                    String s = enum0.name();
                    b b0 = (b)class0.getField(s).getAnnotation(b.class);
                    if(b0 != null) {
                        s = b0.a();
                        String[] arr_s = b0.b();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            this.a.put(arr_s[v1], enum0);
                        }
                    }
                    this.a.put(s, enum0);
                    this.b.put(enum0, s);
                }
                return;
            }
            catch(NoSuchFieldException noSuchFieldException0) {
            }
            throw new AssertionError(noSuchFieldException0);
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
            if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                a0.j();
                return null;
            }
            String s = a0.h();
            return (Enum)this.a.get(s);
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final void a(c c0, Object object0) throws IOException {
            c0.b((((Enum)object0) == null ? null : ((String)this.b.get(((Enum)object0)))));
        }
    }

    public static final r A;
    public static final s B;
    public static final s C;
    private static r D;
    private static r E;
    private static r F;
    private static r G;
    private static r H;
    private static r I;
    private static r J;
    private static r K;
    private static r L;
    private static r M;
    private static r N;
    private static r O;
    private static r P;
    private static r Q;
    private static r R;
    private static r S;
    private static r T;
    private static r U;
    private static r V;
    private static r W;
    private static r X;
    public static final s a;
    public static final s b;
    public static final r c;
    public static final s d;
    public static final s e;
    public static final s f;
    public static final s g;
    public static final s h;
    public static final s i;
    public static final s j;
    public static final r k;
    public static final s l;
    public static final s m;
    public static final r n;
    public static final r o;
    public static final s p;
    public static final s q;
    public static final s r;
    public static final s s;
    public static final s t;
    public static final s u;
    public static final s v;
    public static final s w;
    public static final s x;
    public static final s y;
    public static final s z;

    static {
        r r0 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class)object0).getName() + ". Forgot to register a type adapter?");
            }
        }.a();
        m.D = r0;
        m.a = m.a(Class.class, r0);
        r r1 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.12.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.d();
                int v = ((BitSet)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    c0.a(((long)((BitSet)object0).get(v1)));
                }
                c0.e();
            }

            private static BitSet b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                BitSet bitSet0 = new BitSet();
                a0.a();
                com.bykv.vk.openvk.preload.a.d.b b0 = a0.f();
                int v = 0;
                while(b0 != com.bykv.vk.openvk.preload.a.d.b.b) {
                    boolean z = true;
                    switch(com.bykv.vk.openvk.preload.a.b.a.m.30.a[b0.ordinal()]) {
                        case 1: {
                            if(a0.m() == 0) {
                                z = false;
                                break;
                            }
                            break;
                        }
                        case 2: {
                            z = a0.i();
                            break;
                        }
                        case 3: {
                            String s = a0.h();
                            try {
                                if(Integer.parseInt(s) == 0) {
                                    z = false;
                                    break;
                                }
                                break;
                            }
                            catch(NumberFormatException unused_ex) {
                                throw new p("Error: Expecting: bitset number value (1, 0), Found: " + s);
                            }
                            z = false;
                            break;
                        }
                        default: {
                            throw new p("Invalid bitset value type: " + b0);
                        }
                    }
                    if(z) {
                        bitSet0.set(v);
                    }
                    ++v;
                    b0 = a0.f();
                }
                a0.b();
                return bitSet0;
            }
        }.a();
        m.E = r1;
        m.b = m.a(BitSet.class, r1);
        m.F = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b b0 = a0.f();
                if(b0 == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return b0 == com.bykv.vk.openvk.preload.a.d.b.f ? Boolean.valueOf(Boolean.parseBoolean(a0.h())) : Boolean.valueOf(a0.i());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Boolean)object0));
            }
        };
        m.c = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return Boolean.valueOf(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((Boolean)object0) == null ? "null" : ((Boolean)object0).toString()));
            }
        };
        m.d = m.a(Boolean.TYPE, Boolean.class, m.F);
        com.bykv.vk.openvk.preload.a.b.a.m.32 m$320 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.32.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return (byte)a0.m();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        m.G = m$320;
        m.e = m.a(Byte.TYPE, Byte.class, m$320);
        com.bykv.vk.openvk.preload.a.b.a.m.33 m$330 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.33.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return (short)a0.m();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        m.H = m$330;
        m.f = m.a(Short.TYPE, Short.class, m$330);
        com.bykv.vk.openvk.preload.a.b.a.m.34 m$340 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.34.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return a0.m();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        m.I = m$340;
        m.g = m.a(Integer.TYPE, Integer.class, m$340);
        r r2 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.35.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((long)((AtomicInteger)object0).get()));
            }

            private static AtomicInteger b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                try {
                    return new AtomicInteger(a0.m());
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        }.a();
        m.J = r2;
        m.h = m.a(AtomicInteger.class, r2);
        r r3 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return new AtomicBoolean(a0.i());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.d(((AtomicBoolean)object0).get());
            }
        }.a();
        m.K = r3;
        m.i = m.a(AtomicBoolean.class, r3);
        r r4 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.2.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.d();
                int v = ((AtomicIntegerArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    c0.a(((long)((AtomicIntegerArray)object0).get(v1)));
                }
                c0.e();
            }

            private static AtomicIntegerArray b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.e()) {
                    try {
                        arrayList0.add(a0.m());
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new p(numberFormatException0);
                    }
                }
                a0.b();
                int v = arrayList0.size();
                AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    atomicIntegerArray0.set(v1, ((int)(((Integer)arrayList0.get(v1)))));
                }
                return atomicIntegerArray0;
            }
        }.a();
        m.L = r4;
        m.j = m.a(AtomicIntegerArray.class, r4);
        m.k = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.3.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return a0.l();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return (float)a0.k();
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }
        };
        new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return a0.k();
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }
        };
        com.bykv.vk.openvk.preload.a.b.a.m.6 m$60 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b b0 = a0.f();
                switch(com.bykv.vk.openvk.preload.a.b.a.m.30.a[b0.ordinal()]) {
                    case 1: 
                    case 3: {
                        return new f(a0.h());
                    }
                    case 4: {
                        a0.j();
                        return null;
                    }
                    default: {
                        throw new p("Expecting number, got: " + b0);
                    }
                }
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((Number)object0));
            }
        };
        m.M = m$60;
        m.l = m.a(Number.class, m$60);
        com.bykv.vk.openvk.preload.a.b.a.m.7 m$70 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                String s = a0.h();
                if(s.length() != 1) {
                    throw new p("Expecting character, got: " + s);
                }
                return Character.valueOf(s.charAt(0));
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((Character)object0) == null ? null : String.valueOf(((Character)object0))));
            }
        };
        m.N = m$70;
        m.m = m.a(Character.TYPE, Character.class, m$70);
        m.O = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b b0 = a0.f();
                if(b0 == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return b0 == com.bykv.vk.openvk.preload.a.d.b.h ? Boolean.toString(a0.i()) : a0.h();
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b(((String)object0));
            }
        };
        m.n = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.9.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((BigDecimal)object0));
            }

            private static BigDecimal b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return new BigDecimal(a0.h());
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        m.o = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.10.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.a(((BigInteger)object0));
            }

            private static BigInteger b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    return new BigInteger(a0.h());
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new p(numberFormatException0);
                }
            }
        };
        m.p = m.a(String.class, m.O);
        com.bykv.vk.openvk.preload.a.b.a.m.11 m$110 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return new StringBuilder(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((StringBuilder)object0) == null ? null : ((StringBuilder)object0).toString()));
            }
        };
        m.P = m$110;
        m.q = m.a(StringBuilder.class, m$110);
        com.bykv.vk.openvk.preload.a.b.a.m.13 m$130 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return new StringBuffer(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((StringBuffer)object0) == null ? null : ((StringBuffer)object0).toString()));
            }
        };
        m.Q = m$130;
        m.r = m.a(StringBuffer.class, m$130);
        com.bykv.vk.openvk.preload.a.b.a.m.14 m$140 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                String s = a0.h();
                return "null".equals(s) ? null : new URL(s);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((URL)object0) == null ? null : ((URL)object0).toExternalForm()));
            }
        };
        m.R = m$140;
        m.s = m.a(URL.class, m$140);
        com.bykv.vk.openvk.preload.a.b.a.m.15 m$150 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return com.bykv.vk.openvk.preload.a.b.a.m.15.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((URI)object0) == null ? null : ((URI)object0).toASCIIString()));
            }

            private static URI b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                try {
                    String s = a0.h();
                    return "null".equals(s) ? null : new URI(s);
                }
                catch(URISyntaxException uRISyntaxException0) {
                    throw new j(uRISyntaxException0);
                }
            }
        };
        m.S = m$150;
        m.t = m.a(URI.class, m$150);
        com.bykv.vk.openvk.preload.a.b.a.m.16 m$160 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return InetAddress.getByName(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((InetAddress)object0) == null ? null : ((InetAddress)object0).getHostAddress()));
            }
        };
        m.T = m$160;
        m.u = m.b(InetAddress.class, m$160);
        com.bykv.vk.openvk.preload.a.b.a.m.17 m$170 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return UUID.fromString(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((UUID)object0) == null ? null : ((UUID)object0).toString()));
            }
        };
        m.U = m$170;
        m.v = m.a(UUID.class, m$170);
        r r5 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return Currency.getInstance(a0.h());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b(((Currency)object0).getCurrencyCode());
            }
        }.a();
        m.V = r5;
        m.w = m.a(Currency.class, r5);
        m.x = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                return a0.a() != Timestamp.class ? null : new r() {
                    @Override  // com.bykv.vk.openvk.preload.a.r
                    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                        Date date0 = (Date)this.a.a(a0);
                        return date0 != null ? new Timestamp(date0.getTime()) : null;
                    }

                    @Override  // com.bykv.vk.openvk.preload.a.r
                    public final void a(c c0, Object object0) throws IOException {
                        this.a.a(c0, ((Timestamp)object0));
                    }
                };
            }
        };
        com.bykv.vk.openvk.preload.a.b.a.m.20 m$200 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                a0.c();
                int v = 0;
                int v1 = 0;
                int v2 = 0;
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                while(a0.f() != com.bykv.vk.openvk.preload.a.d.b.d) {
                    String s = a0.g();
                    int v6 = a0.m();
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
                a0.d();
                return new GregorianCalendar(v, v1, v2, v3, v4, v5);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                if(((Calendar)object0) == null) {
                    c0.h();
                    return;
                }
                c0.f();
                c0.a("year");
                c0.a(((long)((Calendar)object0).get(1)));
                c0.a("month");
                c0.a(((long)((Calendar)object0).get(2)));
                c0.a("dayOfMonth");
                c0.a(((long)((Calendar)object0).get(5)));
                c0.a("hourOfDay");
                c0.a(((long)((Calendar)object0).get(11)));
                c0.a("minute");
                c0.a(((long)((Calendar)object0).get(12)));
                c0.a("second");
                c0.a(((long)((Calendar)object0).get(13)));
                c0.g();
            }
        };
        m.W = m$200;
        m.y = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                Class class0 = a0.a();
                return class0 == Calendar.class || class0 == GregorianCalendar.class ? m$200 : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + m$200 + "]";
            }
        };
        com.bykv.vk.openvk.preload.a.b.a.m.21 m$210 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                String s = null;
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                StringTokenizer stringTokenizer0 = new StringTokenizer(a0.h(), "_");
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

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.b((((Locale)object0) == null ? null : ((Locale)object0).toString()));
            }
        };
        m.X = m$210;
        m.z = m.a(Locale.class, m$210);
        com.bykv.vk.openvk.preload.a.b.a.m.22 m$220 = new r() {
            private void a(c c0, i i0) throws IOException {
                if(i0 != null && !(i0 instanceof k)) {
                    if(i0 instanceof n) {
                        if(((n)i0).e()) {
                            c0.a(((n)i0).a());
                            return;
                        }
                        if(((n)i0).d()) {
                            c0.d(((n)i0).c());
                            return;
                        }
                        c0.b(((n)i0).b());
                        return;
                    }
                    if(i0 instanceof g) {
                        c0.d();
                        if(!(i0 instanceof g)) {
                            throw new IllegalStateException("Not a JSON Array: " + i0);
                        }
                        for(Object object0: ((g)i0)) {
                            this.a(c0, ((i)object0));
                        }
                        c0.e();
                        return;
                    }
                    if(!(i0 instanceof l)) {
                        throw new IllegalArgumentException("Couldn\'t write " + i0.getClass());
                    }
                    c0.f();
                    if(!(i0 instanceof l)) {
                        throw new IllegalStateException("Not a JSON Object: " + i0);
                    }
                    for(Object object1: ((l)i0).d()) {
                        c0.a(((String)((Map.Entry)object1).getKey()));
                        this.a(c0, ((i)((Map.Entry)object1).getValue()));
                    }
                    c0.g();
                    return;
                }
                c0.h();
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return this.b(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                this.a(c0, ((i)object0));
            }

            private i b(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                switch(com.bykv.vk.openvk.preload.a.b.a.m.30.a[a0.f().ordinal()]) {
                    case 1: {
                        return new n(new f(a0.h()));
                    }
                    case 2: {
                        return new n(Boolean.valueOf(a0.i()));
                    }
                    case 3: {
                        return new n(a0.h());
                    }
                    case 4: {
                        a0.j();
                        return k.a;
                    }
                    case 5: {
                        i i0 = new g();
                        a0.a();
                        while(a0.e()) {
                            ((g)i0).a(this.b(a0));
                        }
                        a0.b();
                        return i0;
                    }
                    case 6: {
                        i i1 = new l();
                        a0.c();
                        while(a0.e()) {
                            ((l)i1).a(a0.g(), this.b(a0));
                        }
                        a0.d();
                        return i1;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
            }
        };
        m.A = m$220;
        m.B = m.b(i.class, m$220);
        m.C = new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                Class class0 = a0.a();
                if(Enum.class.isAssignableFrom(class0) && class0 != Enum.class) {
                    if(!class0.isEnum()) {
                        class0 = class0.getSuperclass();
                    }
                    return new a(class0);
                }
                return null;
            }
        };
    }

    public static s a(com.bykv.vk.openvk.preload.a.c.a a0, r r0) {
        return new s() {
            // 去混淆评级： 低(20)
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                return a0.equals(a0) ? r0 : null;
            }
        };
    }

    public static s a(Class class0, r r0) {
        return new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                return a0.a() == class0 ? r0 : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + class0.getName() + ",adapter=" + r0 + "]";
            }
        };
    }

    public static s a(Class class0, Class class1, r r0) {
        return new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                Class class0 = a0.a();
                return class0 == class0 || class0 == class1 ? r0 : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + class1.getName() + "+" + class0.getName() + ",adapter=" + r0 + "]";
            }
        };
    }

    private static s b(Class class0, r r0) {
        return new s() {
            @Override  // com.bykv.vk.openvk.preload.a.s
            public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
                Class class0 = a0.a();
                return !class0.isAssignableFrom(class0) ? null : new r() {
                    private com.bykv.vk.openvk.preload.a.b.a.m.29 b;

                    @Override  // com.bykv.vk.openvk.preload.a.r
                    public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                        Object object0 = com.bykv.vk.openvk.preload.a.b.a.m.29.this.a.a(a0);
                        if(object0 != null && !class0.isInstance(object0)) {
                            throw new p("Expected a " + class0.getName() + " but was " + object0.getClass().getName());
                        }
                        return object0;
                    }

                    @Override  // com.bykv.vk.openvk.preload.a.r
                    public final void a(c c0, Object object0) throws IOException {
                        com.bykv.vk.openvk.preload.a.b.a.m.29.this.a.a(c0, object0);
                    }
                };
            }

            @Override
            public final String toString() {
                return "Factory[typeHierarchy=" + class0.getName() + ",adapter=" + r0 + "]";
            }
        };
    }

    final class com.bykv.vk.openvk.preload.a.b.a.m.30 {
        static final int[] a;

        static {
            int[] arr_v = new int[com.bykv.vk.openvk.preload.a.d.b.a().length];
            com.bykv.vk.openvk.preload.a.b.a.m.30.a = arr_v;
            try {
                arr_v[com.bykv.vk.openvk.preload.a.d.b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.i.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.c.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.j.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.e.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.d.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bykv.vk.openvk.preload.a.b.a.m.30.a[com.bykv.vk.openvk.preload.a.d.b.b.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

