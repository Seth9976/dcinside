package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.b.a.f;
import com.bykv.vk.openvk.preload.a.b.a.g;
import com.bykv.vk.openvk.preload.a.b.a.h;
import com.bykv.vk.openvk.preload.a.b.a.i;
import com.bykv.vk.openvk.preload.a.b.a.j;
import com.bykv.vk.openvk.preload.a.b.a.m;
import com.bykv.vk.openvk.preload.a.b.b;
import com.bykv.vk.openvk.preload.a.d.c;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class d {
    static final class a extends r {
        private r a;

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
            r r0 = this.a;
            if(r0 == null) {
                throw new IllegalStateException();
            }
            return r0.a(a0);
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final void a(c c0, Object object0) throws IOException {
            r r0 = this.a;
            if(r0 == null) {
                throw new IllegalStateException();
            }
            r0.a(c0, object0);
        }

        public final void a(r r0) {
            if(this.a != null) {
                throw new AssertionError();
            }
            this.a = r0;
        }
    }

    private static final com.bykv.vk.openvk.preload.a.c.a a;
    private final ThreadLocal b;
    private final Map c;
    private final b d;
    private final com.bykv.vk.openvk.preload.a.b.a.d e;
    private List f;
    private boolean g;

    static {
        d.a = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);
    }

    public d() {
        Map map0 = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List list0 = Collections.emptyList();
        this(com.bykv.vk.openvk.preload.a.b.c.a, com.bykv.vk.openvk.preload.a.b.a, map0, true, q.a, list0);
    }

    d(com.bykv.vk.openvk.preload.a.b.c c0, com.bykv.vk.openvk.preload.a.c c1, Map map0, boolean z, q q0, List list0) {
        this.b = new ThreadLocal();
        this.c = new ConcurrentHashMap();
        b b0 = new b(map0);
        this.d = b0;
        this.g = z;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(m.B);
        arrayList0.add(g.a);
        arrayList0.add(c0);
        arrayList0.addAll(list0);
        arrayList0.add(m.p);
        arrayList0.add(m.g);
        arrayList0.add(m.d);
        arrayList0.add(m.e);
        arrayList0.add(m.f);
        r r0 = q0 == q.a ? m.k : new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(a0.f() == com.bykv.vk.openvk.preload.a.d.b.i) {
                    a0.j();
                    return null;
                }
                return a0.l();
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                if(((Number)object0) == null) {
                    c0.h();
                    return;
                }
                c0.b(((Number)object0).toString());
            }
        };
        arrayList0.add(m.a(Long.TYPE, Long.class, r0));
        Class class0 = Double.TYPE;
        com.bykv.vk.openvk.preload.a.d.1 d$10 = new r() {
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
                if(((Number)object0) == null) {
                    c0.h();
                    return;
                }
                d.a(((Number)object0).doubleValue());
                c0.a(((Number)object0));
            }
        };
        arrayList0.add(m.a(class0, Double.class, d$10));
        Class class1 = Float.TYPE;
        com.bykv.vk.openvk.preload.a.d.2 d$20 = new r() {
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
                if(((Number)object0) == null) {
                    c0.h();
                    return;
                }
                d.a(((Number)object0).floatValue());
                c0.a(((Number)object0));
            }
        };
        arrayList0.add(m.a(class1, Float.class, d$20));
        arrayList0.add(m.l);
        arrayList0.add(m.h);
        arrayList0.add(m.i);
        r r1 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                return new AtomicLong(((Number)this.a.a(a0)).longValue());
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                this.a.a(c0, ((AtomicLong)object0).get());
            }
        }.a();
        arrayList0.add(m.a(AtomicLong.class, r1));
        r r2 = new r() {
            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.e()) {
                    arrayList0.add(((Number)this.a.a(a0)).longValue());
                }
                a0.b();
                int v = arrayList0.size();
                AtomicLongArray atomicLongArray0 = new AtomicLongArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    atomicLongArray0.set(v1, ((long)(((Long)arrayList0.get(v1)))));
                }
                return atomicLongArray0;
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(c c0, Object object0) throws IOException {
                c0.d();
                int v = ((AtomicLongArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    this.a.a(c0, ((AtomicLongArray)object0).get(v1));
                }
                c0.e();
            }
        }.a();
        arrayList0.add(m.a(AtomicLongArray.class, r2));
        arrayList0.add(m.j);
        arrayList0.add(m.m);
        arrayList0.add(m.q);
        arrayList0.add(m.r);
        arrayList0.add(m.a(BigDecimal.class, m.n));
        arrayList0.add(m.a(BigInteger.class, m.o));
        arrayList0.add(m.s);
        arrayList0.add(m.t);
        arrayList0.add(m.v);
        arrayList0.add(m.w);
        arrayList0.add(m.z);
        arrayList0.add(m.u);
        arrayList0.add(m.b);
        arrayList0.add(com.bykv.vk.openvk.preload.a.b.a.c.a);
        arrayList0.add(m.y);
        arrayList0.add(j.a);
        arrayList0.add(i.a);
        arrayList0.add(m.x);
        arrayList0.add(com.bykv.vk.openvk.preload.a.b.a.a.a);
        arrayList0.add(m.a);
        arrayList0.add(new com.bykv.vk.openvk.preload.a.b.a.b(b0));
        arrayList0.add(new f(b0));
        com.bykv.vk.openvk.preload.a.b.a.d d0 = new com.bykv.vk.openvk.preload.a.b.a.d(b0);
        this.e = d0;
        arrayList0.add(d0);
        arrayList0.add(m.C);
        arrayList0.add(new h(b0, c1, c0));
        this.f = DesugarCollections.unmodifiableList(arrayList0);
    }

    private static c a(Writer writer0) throws IOException {
        c c0 = new c(writer0);
        c0.c(false);
        return c0;
    }

    private Object a(com.bykv.vk.openvk.preload.a.d.a a0, Type type0) throws com.bykv.vk.openvk.preload.a.j, p {
        boolean z = a0.p();
        boolean z1 = true;
        a0.a(true);
        try {
            a0.f();
            z1 = false;
            return this.a(com.bykv.vk.openvk.preload.a.c.a.a(type0)).a(a0);
        }
        catch(EOFException eOFException0) {
            if(!z1) {
                throw new p(eOFException0);
            }
            return null;
        }
        catch(IllegalStateException illegalStateException0) {
            throw new p(illegalStateException0);
        }
        catch(IOException iOException0) {
            throw new p(iOException0);
        }
        catch(AssertionError assertionError0) {
            AssertionError assertionError1 = new AssertionError("AssertionError (GSON pangle-v3200): " + assertionError0.getMessage());
            assertionError1.initCause(assertionError0);
            throw assertionError1;
        }
        finally {
            a0.a(z);
        }
    }

    static void a(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final r a(com.bykv.vk.openvk.preload.a.c.a a0) {
        boolean z;
        r r0 = (r)this.c.get((a0 == null ? d.a : a0));
        if(r0 != null) {
            return r0;
        }
        Map map0 = (Map)this.b.get();
        if(map0 == null) {
            map0 = new HashMap();
            this.b.set(map0);
            z = true;
        }
        else {
            z = false;
        }
        r r1 = (a)map0.get(a0);
        if(r1 != null) {
            return r1;
        }
        try {
            a d$a0 = new a();
            map0.put(a0, d$a0);
            for(Object object0: this.f) {
                r r2 = ((s)object0).a(this, a0);
                if(r2 != null) {
                    d$a0.a(r2);
                    this.c.put(a0, r2);
                    return r2;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            map0.remove(a0);
            if(z) {
                this.b.remove();
            }
        }
        throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle " + a0);
    }

    public final r a(s s0, com.bykv.vk.openvk.preload.a.c.a a0) {
        if(!this.f.contains(s0)) {
            s0 = this.e;
        }
        boolean z = false;
        for(Object object0: this.f) {
            s s1 = (s)object0;
            if(z) {
                r r0 = s1.a(this, a0);
                if(r0 != null) {
                    return r0;
                }
                if(false) {
                    break;
                }
            }
            else {
                if(s1 != s0) {
                    continue;
                }
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + a0);
    }

    public final r a(Class class0) {
        return this.a(com.bykv.vk.openvk.preload.a.c.a.a(class0));
    }

    public final Object a(Reader reader0, Type type0) throws com.bykv.vk.openvk.preload.a.j, p {
        com.bykv.vk.openvk.preload.a.d.a a0 = new com.bykv.vk.openvk.preload.a.d.a(reader0);
        a0.a(false);
        Object object0 = this.a(a0, type0);
        if(object0 == null) {
            return object0;
        }
        else {
            try {
                if(a0.f() != com.bykv.vk.openvk.preload.a.d.b.j) {
                    throw new com.bykv.vk.openvk.preload.a.j("JSON document was not fully consumed.");
                }
                return object0;
            }
            catch(com.bykv.vk.openvk.preload.a.d.d d0) {
            }
            catch(IOException iOException0) {
                throw new com.bykv.vk.openvk.preload.a.j(iOException0);
            }
        }
        throw new p(d0);
    }

    public final String a(Object object0) {
        if(object0 == null) {
            k k0 = k.a;
            StringWriter stringWriter0 = new StringWriter();
            try {
                c c0 = d.a(stringWriter0);
                boolean z = c0.a();
                c0.a(true);
                boolean z1 = c0.b();
                c0.b(this.g);
                boolean z2 = c0.c();
                c0.c(false);
                try {
                    com.bykv.vk.openvk.preload.geckox.h.a.a(k0, c0);
                }
                catch(IOException iOException1) {
                    throw new com.bykv.vk.openvk.preload.a.j(iOException1);
                }
                catch(AssertionError assertionError0) {
                    AssertionError assertionError1 = new AssertionError("AssertionError (GSON pangle-v3200): " + assertionError0.getMessage());
                    assertionError1.initCause(assertionError0);
                    throw assertionError1;
                }
                finally {
                    c0.a(z);
                    c0.b(z1);
                    c0.c(z2);
                }
                return stringWriter0.toString();
            }
            catch(IOException iOException0) {
                throw new com.bykv.vk.openvk.preload.a.j(iOException0);
            }
        }
        Class class0 = object0.getClass();
        StringWriter stringWriter1 = new StringWriter();
        try {
            c c1 = d.a(stringWriter1);
            r r0 = this.a(com.bykv.vk.openvk.preload.a.c.a.a(class0));
            boolean z3 = c1.a();
            c1.a(true);
            boolean z4 = c1.b();
            c1.b(this.g);
            boolean z5 = c1.c();
            c1.c(false);
            try {
                r0.a(c1, object0);
            }
            catch(IOException iOException3) {
                throw new com.bykv.vk.openvk.preload.a.j(iOException3);
            }
            catch(AssertionError assertionError2) {
                AssertionError assertionError3 = new AssertionError("AssertionError (GSON pangle-v3200): " + assertionError2.getMessage());
                assertionError3.initCause(assertionError2);
                throw assertionError3;
            }
            finally {
                c1.a(z3);
                c1.b(z4);
                c1.c(z5);
            }
            return stringWriter1.toString();
        }
        catch(IOException iOException2) {
            throw new com.bykv.vk.openvk.preload.a.j(iOException2);
        }
    }

    @Override
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f + ",instanceCreators:" + this.d + "}";
    }
}

