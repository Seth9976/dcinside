package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.b;
import com.google.gson.internal.c;
import com.google.gson.internal.g;
import com.google.gson.internal.n;
import com.google.gson.stream.a;
import com.google.gson.stream.d;
import com.google.gson.stream.e;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
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
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static class FutureTypeAdapter extends SerializationDelegatingTypeAdapter {
        private TypeAdapter a;

        FutureTypeAdapter() {
            this.a = null;
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(a a0) throws IOException {
            return this.k().e(a0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            this.k().i(d0, object0);
        }

        @Override  // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter j() {
            return this.k();
        }

        private TypeAdapter k() {
            TypeAdapter typeAdapter0 = this.a;
            if(typeAdapter0 == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            return typeAdapter0;
        }

        public void l(TypeAdapter typeAdapter0) {
            if(this.a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.a = typeAdapter0;
        }
    }

    static final boolean A = false;
    static final boolean B = false;
    static final boolean C = true;
    static final boolean D = false;
    static final boolean E = false;
    static final boolean F = false;
    static final boolean G = true;
    static final String H = null;
    static final com.google.gson.d I = null;
    static final x J = null;
    static final x K = null;
    private static final String L = ")]}\'\n";
    private final ThreadLocal a;
    private final ConcurrentMap b;
    private final c c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    final List e;
    final Excluder f;
    final com.google.gson.d g;
    final Map h;
    final boolean i;
    final boolean j;
    final boolean k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final String q;
    final int r;
    final int s;
    final u t;
    final List u;
    final List v;
    final x w;
    final x x;
    final List y;
    static final boolean z = false;

    static {
        Gson.I = com.google.gson.c.a;
        Gson.J = w.a;
        Gson.K = w.b;
    }

    public Gson() {
        Map map0 = Collections.emptyMap();
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        this(Excluder.h, Gson.I, map0, false, false, false, true, false, false, false, true, u.a, Gson.H, 2, 2, list0, list1, list2, Gson.J, Gson.K, list3);
    }

    Gson(Excluder excluder0, com.google.gson.d d0, Map map0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, u u0, String s, int v, int v1, List list0, List list1, List list2, x x0, x x1, List list3) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.f = excluder0;
        this.g = d0;
        this.h = map0;
        c c0 = new c(map0, z7, list3);
        this.c = c0;
        this.i = z;
        this.j = z1;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.t = u0;
        this.q = s;
        this.r = v;
        this.s = v1;
        this.u = list0;
        this.v = list1;
        this.w = x0;
        this.x = x1;
        this.y = list3;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(TypeAdapters.W);
        arrayList0.add(ObjectTypeAdapter.j(x0));
        arrayList0.add(excluder0);
        arrayList0.addAll(list2);
        arrayList0.add(TypeAdapters.C);
        arrayList0.add(TypeAdapters.m);
        arrayList0.add(TypeAdapters.g);
        arrayList0.add(TypeAdapters.i);
        arrayList0.add(TypeAdapters.k);
        TypeAdapter typeAdapter0 = Gson.x(u0);
        arrayList0.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapter0));
        Class class0 = Double.TYPE;
        TypeAdapter typeAdapter1 = this.e(z6);
        arrayList0.add(TypeAdapters.c(class0, Double.class, typeAdapter1));
        Class class1 = Float.TYPE;
        TypeAdapter typeAdapter2 = this.h(z6);
        arrayList0.add(TypeAdapters.c(class1, Float.class, typeAdapter2));
        arrayList0.add(NumberTypeAdapter.j(x1));
        arrayList0.add(TypeAdapters.o);
        arrayList0.add(TypeAdapters.q);
        TypeAdapter typeAdapter3 = Gson.b(typeAdapter0);
        arrayList0.add(TypeAdapters.b(AtomicLong.class, typeAdapter3));
        TypeAdapter typeAdapter4 = Gson.c(typeAdapter0);
        arrayList0.add(TypeAdapters.b(AtomicLongArray.class, typeAdapter4));
        arrayList0.add(TypeAdapters.s);
        arrayList0.add(TypeAdapters.x);
        arrayList0.add(TypeAdapters.E);
        arrayList0.add(TypeAdapters.G);
        arrayList0.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        arrayList0.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList0.add(TypeAdapters.b(g.class, TypeAdapters.B));
        arrayList0.add(TypeAdapters.I);
        arrayList0.add(TypeAdapters.K);
        arrayList0.add(TypeAdapters.O);
        arrayList0.add(TypeAdapters.Q);
        arrayList0.add(TypeAdapters.U);
        arrayList0.add(TypeAdapters.M);
        arrayList0.add(TypeAdapters.d);
        arrayList0.add(DateTypeAdapter.b);
        arrayList0.add(TypeAdapters.S);
        if(com.google.gson.internal.sql.a.a) {
            arrayList0.add(com.google.gson.internal.sql.a.e);
            arrayList0.add(com.google.gson.internal.sql.a.d);
            arrayList0.add(com.google.gson.internal.sql.a.f);
        }
        arrayList0.add(ArrayTypeAdapter.c);
        arrayList0.add(TypeAdapters.b);
        arrayList0.add(new CollectionTypeAdapterFactory(c0));
        arrayList0.add(new MapTypeAdapterFactory(c0, z1));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(c0);
        this.d = jsonAdapterAnnotationTypeAdapterFactory0;
        arrayList0.add(jsonAdapterAnnotationTypeAdapterFactory0);
        arrayList0.add(TypeAdapters.X);
        arrayList0.add(new ReflectiveTypeAdapterFactory(c0, d0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0, list3));
        this.e = DesugarCollections.unmodifiableList(arrayList0);
    }

    public d A(Writer writer0) throws IOException {
        if(this.k) {
            writer0.write(")]}\'\n");
        }
        d d0 = new d(writer0);
        if(this.m) {
            d0.T("  ");
        }
        d0.R(this.l);
        d0.Y(this.n);
        d0.d0(this.i);
        return d0;
    }

    public boolean B() {
        return this.i;
    }

    public String C(j j0) [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    public String D(Object object0) {
        return object0 == null ? "null" : this.E(object0, object0.getClass());
    }

    public String E(Object object0, Type type0) {
        StringWriter stringWriter0 = new StringWriter();
        this.J(object0, type0, stringWriter0);
        return stringWriter0.toString();
    }

    public void F(j j0, d d0) throws k {
        boolean z = d0.o();
        d0.Y(true);
        boolean z1 = d0.n();
        d0.R(this.l);
        boolean z2 = d0.k();
        d0.d0(this.i);
        try {
            n.b(j0, d0);
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            d0.Y(z);
            d0.R(z1);
            d0.d0(z2);
        }
    }

    public void G(j j0, Appendable appendable0) throws k {
        try {
            this.F(j0, this.A(n.c(appendable0)));
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
    }

    public void H(Object object0, Appendable appendable0) throws k {
        if(object0 != null) {
            this.J(object0, object0.getClass(), appendable0);
            return;
        }
        this.G(l.a, appendable0);
    }

    public void I(Object object0, Type type0, d d0) throws k {
        TypeAdapter typeAdapter0 = this.t(com.google.gson.reflect.a.c(type0));
        boolean z = d0.o();
        d0.Y(true);
        boolean z1 = d0.n();
        d0.R(this.l);
        boolean z2 = d0.k();
        d0.d0(this.i);
        try {
            typeAdapter0.i(d0, object0);
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            d0.Y(z);
            d0.R(z1);
            d0.d0(z2);
        }
    }

    public void J(Object object0, Type type0, Appendable appendable0) throws k {
        try {
            this.I(object0, type0, this.A(n.c(appendable0)));
        }
        catch(IOException iOException0) {
            throw new k(iOException0);
        }
    }

    public j K(Object object0) {
        return object0 == null ? l.a : this.L(object0, object0.getClass());
    }

    public j L(Object object0, Type type0) {
        b b0 = new b();
        this.I(object0, type0, b0);
        return b0.Y0();
    }

    private static void a(Object object0, a a0) {
        if(object0 == null) {
            return;
        }
        else {
            try {
                if(a0.f0() != com.google.gson.stream.c.j) {
                    throw new t("JSON document was not fully consumed.");
                }
                return;
            }
            catch(e e0) {
            }
            catch(IOException iOException0) {
                throw new k(iOException0);
            }
        }
        throw new t(e0);
    }

    private static TypeAdapter b(TypeAdapter typeAdapter0) {
        return new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((AtomicLong)object0));
            }

            public AtomicLong j(a a0) throws IOException {
                return new AtomicLong(((Number)typeAdapter0.e(a0)).longValue());
            }

            public void k(d d0, AtomicLong atomicLong0) throws IOException {
                Long long0 = atomicLong0.get();
                typeAdapter0.i(d0, long0);
            }
        }.d();
    }

    private static TypeAdapter c(TypeAdapter typeAdapter0) {
        return new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((AtomicLongArray)object0));
            }

            public AtomicLongArray j(a a0) throws IOException {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.p()) {
                    arrayList0.add(((Number)typeAdapter0.e(a0)).longValue());
                }
                a0.i();
                int v = arrayList0.size();
                AtomicLongArray atomicLongArray0 = new AtomicLongArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    atomicLongArray0.set(v1, ((long)(((Long)arrayList0.get(v1)))));
                }
                return atomicLongArray0;
            }

            public void k(d d0, AtomicLongArray atomicLongArray0) throws IOException {
                d0.c();
                int v = atomicLongArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    Long long0 = atomicLongArray0.get(v1);
                    typeAdapter0.i(d0, long0);
                }
                d0.i();
            }
        }.d();
    }

    static void d(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter e(boolean z) {
        return z ? TypeAdapters.v : new TypeAdapter() {
            final Gson a;

            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Double j(a a0) throws IOException {
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
                double f = number0.doubleValue();
                Gson.d(f);
                d0.f0(f);
            }
        };
    }

    @Deprecated
    public Excluder f() {
        return this.f;
    }

    public com.google.gson.d g() {
        return this.g;
    }

    private TypeAdapter h(boolean z) {
        return z ? TypeAdapters.u : new TypeAdapter() {
            final Gson a;

            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Float j(a a0) throws IOException {
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
                float f = number0.floatValue();
                Gson.d(f);
                if(!(number0 instanceof Float)) {
                    number0 = f;
                }
                d0.x0(number0);
            }
        };
    }

    public Object i(j j0, com.google.gson.reflect.a a0) throws t {
        return j0 == null ? null : this.l(new com.google.gson.internal.bind.a(j0), a0);
    }

    public Object j(j j0, Class class0) throws t {
        return com.google.gson.internal.l.d(class0).cast(this.i(j0, com.google.gson.reflect.a.b(class0)));
    }

    public Object k(j j0, Type type0) throws t {
        return this.i(j0, com.google.gson.reflect.a.c(type0));
    }

    public Object l(a a0, com.google.gson.reflect.a a1) throws k, t {
        boolean z = a0.q();
        boolean z1 = true;
        a0.E0(true);
        try {
            a0.f0();
            z1 = false;
            return this.t(a1).e(a0);
        }
        catch(EOFException eOFException0) {
            if(!z1) {
                throw new t(eOFException0);
            }
            return null;
        }
        catch(IllegalStateException illegalStateException0) {
            throw new t(illegalStateException0);
        }
        catch(IOException iOException0) {
            throw new t(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            a0.E0(z);
        }
    }

    public Object m(a a0, Type type0) throws k, t {
        return this.l(a0, com.google.gson.reflect.a.c(type0));
    }

    public Object n(Reader reader0, com.google.gson.reflect.a a0) throws k, t {
        a a1 = this.z(reader0);
        Object object0 = this.l(a1, a0);
        Gson.a(object0, a1);
        return object0;
    }

    public Object o(Reader reader0, Class class0) throws t, k {
        return com.google.gson.internal.l.d(class0).cast(this.n(reader0, com.google.gson.reflect.a.b(class0)));
    }

    public Object p(Reader reader0, Type type0) throws k, t {
        return this.n(reader0, com.google.gson.reflect.a.c(type0));
    }

    public Object q(String s, com.google.gson.reflect.a a0) throws t {
        return s == null ? null : this.n(new StringReader(s), a0);
    }

    public Object r(String s, Class class0) throws t {
        return com.google.gson.internal.l.d(class0).cast(this.q(s, com.google.gson.reflect.a.b(class0)));
    }

    public Object s(String s, Type type0) throws t {
        return this.q(s, com.google.gson.reflect.a.c(type0));
    }

    public TypeAdapter t(com.google.gson.reflect.a a0) {
        TypeAdapter typeAdapter2;
        boolean z;
        Objects.requireNonNull(a0, "type must not be null");
        TypeAdapter typeAdapter0 = (TypeAdapter)this.b.get(a0);
        if(typeAdapter0 != null) {
            return typeAdapter0;
        }
        Map map0 = (Map)this.a.get();
        if(map0 == null) {
            map0 = new HashMap();
            this.a.set(map0);
            z = true;
        }
        else {
            TypeAdapter typeAdapter1 = (TypeAdapter)map0.get(a0);
            if(typeAdapter1 != null) {
                return typeAdapter1;
            }
            z = false;
        }
        try {
            FutureTypeAdapter gson$FutureTypeAdapter0 = new FutureTypeAdapter();
            map0.put(a0, gson$FutureTypeAdapter0);
            typeAdapter2 = null;
            for(Object object0: this.e) {
                typeAdapter2 = ((y)object0).a(this, a0);
                if(typeAdapter2 != null) {
                    gson$FutureTypeAdapter0.l(typeAdapter2);
                    map0.put(a0, typeAdapter2);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            if(z) {
                this.a.remove();
            }
        }
        if(typeAdapter2 == null) {
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + a0);
        }
        if(z) {
            this.b.putAll(map0);
        }
        return typeAdapter2;
    }

    @Override
    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public TypeAdapter u(Class class0) {
        return this.t(com.google.gson.reflect.a.b(class0));
    }

    public TypeAdapter v(y y0, com.google.gson.reflect.a a0) {
        if(!this.e.contains(y0)) {
            y0 = this.d;
        }
        boolean z = false;
        for(Object object0: this.e) {
            y y1 = (y)object0;
            if(z) {
                TypeAdapter typeAdapter0 = y1.a(this, a0);
                if(typeAdapter0 != null) {
                    return typeAdapter0;
                }
                if(false) {
                    break;
                }
            }
            else {
                if(y1 != y0) {
                    continue;
                }
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + a0);
    }

    public boolean w() {
        return this.l;
    }

    private static TypeAdapter x(u u0) {
        return u0 == u.a ? TypeAdapters.t : new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public Object e(a a0) throws IOException {
                return this.j(a0);
            }

            @Override  // com.google.gson.TypeAdapter
            public void i(d d0, Object object0) throws IOException {
                this.k(d0, ((Number)object0));
            }

            public Number j(a a0) throws IOException {
                if(a0.f0() == com.google.gson.stream.c.i) {
                    a0.T();
                    return null;
                }
                return a0.L();
            }

            public void k(d d0, Number number0) throws IOException {
                if(number0 == null) {
                    d0.v();
                    return;
                }
                d0.E0(number0.toString());
            }
        };
    }

    public com.google.gson.e y() {
        return new com.google.gson.e(this);
    }

    public a z(Reader reader0) {
        a a0 = new a(reader0);
        a0.E0(this.n);
        return a0;
    }
}

