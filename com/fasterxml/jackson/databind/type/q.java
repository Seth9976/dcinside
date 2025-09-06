package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.b;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.t;
import com.fasterxml.jackson.databind.util.w;
import j..util.Objects;
import j..util.stream.BaseStream;
import j..util.stream.DoubleStream;
import j..util.stream.IntStream;
import j..util.stream.LongStream;
import j..util.stream.Stream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class q implements Serializable {
    protected static final n A = null;
    protected final w a;
    protected final r[] b;
    protected final s c;
    protected final ClassLoader d;
    private static final long e = 1L;
    public static final int f = 200;
    private static final m[] g;
    protected static final q h;
    protected static final p i;
    private static final Class j;
    private static final Class k;
    private static final Class l;
    private static final Class m;
    private static final Class n;
    private static final Class o;
    private static final Class p;
    private static final Class q;
    private static final Class r;
    protected static final n s;
    protected static final n t;
    protected static final n u;
    protected static final n v;
    protected static final n w;
    protected static final n x;
    protected static final n y;
    protected static final n z;

    static {
        q.g = new m[0];
        q.h = new q();
        q.i = p.i();
        q.j = String.class;
        q.k = Object.class;
        q.l = Comparable.class;
        q.m = Enum.class;
        q.n = com.fasterxml.jackson.databind.p.class;
        q.o = Boolean.TYPE;
        Class class0 = Double.TYPE;
        q.p = class0;
        Class class1 = Integer.TYPE;
        q.q = class1;
        Class class2 = Long.TYPE;
        q.r = class2;
        q.s = new n(Boolean.TYPE);
        q.t = new n(class0);
        q.u = new n(class1);
        q.v = new n(class2);
        q.w = new n(String.class);
        q.x = new n(Object.class);
        q.y = new n(Comparable.class);
        q.z = new n(Enum.class);
        q.A = new n(com.fasterxml.jackson.databind.p.class);
    }

    private q() {
        this(new t(16, 200));
    }

    protected q(w w0) {
        Objects.requireNonNull(w0);
        this.a = w0;
        this.c = new s(this);
        this.b = null;
        this.d = null;
    }

    protected q(w w0, s s0, r[] arr_r, ClassLoader classLoader0) {
        if(w0 == null) {
            w0 = new t(16, 200);
        }
        this.a = w0;
        this.c = s0.g(this);
        this.b = arr_r;
        this.d = classLoader0;
    }

    protected Class A(String s) throws ClassNotFoundException {
        return Class.forName(s);
    }

    protected Class B(String s, boolean z, ClassLoader classLoader0) throws ClassNotFoundException {
        return Class.forName(s, true, classLoader0);
    }

    public void C() {
        this.a.clear();
    }

    public a D(m m0) {
        return a.r0(m0, null);
    }

    public a E(Class class0) {
        return a.r0(this.g(null, class0, null), null);
    }

    public d F(Class class0, m m0) {
        m m1 = this.i(null, class0, p.g(class0, m0));
        return m1 instanceof d ? ((d)m1) : d.u0(m1, m0);
    }

    public d G(Class class0, Class class1) {
        return this.F(class0, this.i(null, class1, q.i));
    }

    public e H(Class class0, m m0) {
        p p0 = p.g(class0, m0);
        e e0 = (e)this.i(null, class0, p0);
        if(p0.p() && m0 != null) {
            m m1 = e0.A(Collection.class).E();
            if(!m1.equals(m0)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", h.l0(class0), m0, m1));
            }
        }
        return e0;
    }

    public e I(Class class0, Class class1) {
        return this.H(class0, this.i(null, class1, q.i));
    }

    public m J(String s) throws IllegalArgumentException {
        return this.c.d(s);
    }

    public m K(m m0, Class class0) {
        Class class1 = m0.g();
        if(class1 == class0) {
            return m0;
        }
        m m1 = m0.A(class0);
        if(m1 == null) {
            throw class0.isAssignableFrom(class1) ? new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", class0.getName(), m0)) : new IllegalArgumentException(String.format("Class %s not a super-type of %s", class0.getName(), m0));
        }
        return m1;
    }

    public i L(Class class0, m m0, m m1) {
        m m2 = this.i(null, class0, p.h(class0, new m[]{m0, m1}));
        return m2 instanceof i ? ((i)m2) : i.t0(m2, m0, m1);
    }

    public i M(Class class0, Class class1, Class class2) {
        return this.L(class0, this.i(null, class1, q.i), this.i(null, class2, q.i));
    }

    public j N(Class class0, m m0, m m1) {
        p p0 = p.h(class0, new m[]{m0, m1});
        j j0 = (j)this.i(null, class0, p0);
        if(p0.p()) {
            m m2 = j0.A(Map.class);
            m m3 = m2.N();
            if(!m3.equals(m0)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", h.l0(class0), m0, m3));
            }
            m m4 = m2.E();
            if(!m4.equals(m1)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", h.l0(class0), m1, m4));
            }
        }
        return j0;
    }

    public j O(Class class0, Class class1, Class class2) {
        return class0 == Properties.class ? this.N(class0, q.w, q.w) : this.N(class0, this.i(null, class1, q.i), this.i(null, class2, q.i));
    }

    public m P(Class class0, p p0) {
        return this.a(class0, this.i(null, class0, p0));
    }

    public m Q(Class class0, m[] arr_m) {
        return this.P(class0, p.e(class0, arr_m));
    }

    public m R(Class class0, Class[] arr_class) {
        m[] arr_m = new m[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_m[v] = this.i(null, arr_class[v], q.i);
        }
        return this.Q(class0, arr_m);
    }

    @Deprecated
    public m S(Class class0, Class class1, m[] arr_m) {
        return this.Q(class0, arr_m);
    }

    @Deprecated
    public m T(Class class0, Class class1, Class[] arr_class) {
        return this.R(class0, arr_class);
    }

    public d U(Class class0) {
        return this.F(class0, q.v0());
    }

    public e V(Class class0) {
        return this.H(class0, q.v0());
    }

    public i W(Class class0) {
        return this.L(class0, q.v0(), q.v0());
    }

    public j X(Class class0) {
        return this.N(class0, q.v0(), q.v0());
    }

    public m Y(Class class0, m m0) {
        return l.z0(class0, p.b(class0, m0), null, null, m0);
    }

    @Deprecated
    public m Z(Class class0, Class class1, m[] arr_m) {
        return this.a0(class0, arr_m);
    }

    protected m a(Type type0, m m0) {
        if(this.b == null) {
            return m0;
        }
        p p0 = m0.D();
        if(p0 == null) {
            p0 = q.i;
        }
        r[] arr_r = this.b;
        int v = 0;
        while(v < arr_r.length) {
            r r0 = arr_r[v];
            m m1 = r0.a(m0, type0, p0, this);
            if(m1 == null) {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", r0, r0.getClass().getName(), m0));
            }
            ++v;
            m0 = m1;
        }
        return m0;
    }

    public m a0(Class class0, m[] arr_m) {
        return this.i(null, class0, p.e(class0, arr_m));
    }

    private p b(m m0, int v, Class class0, boolean z) {
        k[] arr_k = new k[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_k[v2] = new k(v2);
        }
        m m1 = this.i(null, class0, p.e(class0, arr_k)).A(m0.g());
        if(m1 == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", m0.g().getName(), class0.getName()));
        }
        String s = this.x(m0, m1);
        if(s != null && !z) {
            throw new IllegalArgumentException("Failed to specialize base type " + m0.w() + " as " + class0.getName() + ", problem: " + s);
        }
        m[] arr_m = new m[v];
        for(int v1 = 0; v1 < v; ++v1) {
            m m2 = arr_k[v1].s0();
            if(m2 == null) {
                m2 = q.v0();
            }
            arr_m[v1] = m2;
        }
        return p.e(class0, arr_m);
    }

    public m b0(m m0, Class class0) throws IllegalArgumentException {
        return this.c0(m0, class0, false);
    }

    private m c(Class class0, p p0, m m0, m[] arr_m) {
        List list0 = p0.m();
        if(list0.isEmpty()) {
            return e.B0(class0, p0, m0, arr_m, this.y());
        }
        if(list0.size() != 1) {
            throw new IllegalArgumentException("Strange Collection type " + class0.getName() + ": cannot determine type parameters");
        }
        return e.B0(class0, p0, m0, arr_m, ((m)list0.get(0)));
    }

    public m c0(m m0, Class class0, boolean z) throws IllegalArgumentException {
        Class class1 = m0.g();
        if(class1 == class0) {
            return m0;
        }
        if(class1 == Object.class) {
            return this.i(null, class0, q.i).i0(m0);
        }
        if(!class1.isAssignableFrom(class0)) {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", h.l0(class0), h.Q(m0)));
        }
        if(m0.o()) {
            if(m0.r()) {
                if(class0 == HashMap.class || class0 == LinkedHashMap.class || class0 == EnumMap.class || class0 == TreeMap.class) {
                    return this.i(null, class0, p.c(class0, m0.N(), m0.E())).i0(m0);
                }
            }
            else if(m0.m()) {
                if(class0 == ArrayList.class || class0 == LinkedList.class || class0 == HashSet.class || class0 == TreeSet.class) {
                    return this.i(null, class0, p.b(class0, m0.E())).i0(m0);
                }
                else if(class1 == EnumSet.class) {
                    return m0;
                }
            }
        }
        if(m0.D().p()) {
            return this.i(null, class0, q.i).i0(m0);
        }
        TypeVariable[] arr_typeVariable = class0.getTypeParameters();
        return arr_typeVariable.length == 0 ? this.i(null, class0, q.i).i0(m0) : this.i(null, class0, this.b(m0, arr_typeVariable.length, class0, z)).i0(m0);
    }

    protected m d(Class class0, p p0, m m0, m[] arr_m) {
        if(p0.p()) {
            m m1 = this.f(class0);
            return m1 == null ? this.r(class0, p0, m0, arr_m) : m1;
        }
        return this.r(class0, p0, m0, arr_m);
    }

    protected Class e(String s) {
        if("int".equals(s)) {
            return Integer.TYPE;
        }
        if("long".equals(s)) {
            return Long.TYPE;
        }
        if("float".equals(s)) {
            return Float.TYPE;
        }
        if("double".equals(s)) {
            return Double.TYPE;
        }
        if("boolean".equals(s)) {
            return Boolean.TYPE;
        }
        if("byte".equals(s)) {
            return Byte.TYPE;
        }
        if("char".equals(s)) {
            return Character.TYPE;
        }
        if("short".equals(s)) {
            return Short.TYPE;
        }
        return "void".equals(s) ? Void.TYPE : null;
    }

    public m e0(b b0) {
        return this.g(null, b0.b(), q.i);
    }

    protected m f(Class class0) {
        if(class0.isPrimitive()) {
            if(class0 == q.o) {
                return q.s;
            }
            if(class0 == q.q) {
                return q.u;
            }
            if(class0 == q.r) {
                return q.v;
            }
            if(class0 == q.p) {
                return q.t;
            }
        }
        else {
            if(class0 == q.j) {
                return q.w;
            }
            if(class0 == q.k) {
                return q.x;
            }
            if(class0 == q.n) {
                return q.A;
            }
        }
        return null;
    }

    public m f0(Type type0) {
        return this.g(null, type0, q.i);
    }

    protected m g(c c0, Type type0, p p0) {
        if(type0 instanceof Class) {
            return this.a(type0, this.i(c0, ((Class)type0), q.i));
        }
        if(type0 instanceof ParameterizedType) {
            return this.a(type0, this.j(c0, ((ParameterizedType)type0), p0));
        }
        if(type0 instanceof m) {
            return (m)type0;
        }
        if(type0 instanceof GenericArrayType) {
            return this.a(type0, this.h(c0, ((GenericArrayType)type0), p0));
        }
        if(type0 instanceof TypeVariable) {
            return this.a(type0, this.k(c0, ((TypeVariable)type0), p0));
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Unrecognized Type: " + (type0 == null ? "[null]" : type0.toString()));
        }
        return this.a(type0, this.n(c0, ((WildcardType)type0), p0));
    }

    @Deprecated
    public m g0(Type type0, m m0) {
        p p1;
        if(m0 == null) {
            return this.g(null, type0, q.i);
        }
        p p0 = m0.D();
        if(type0.getClass() == Class.class) {
            p1 = p0;
        }
        else {
            m m1 = m0;
            for(p1 = p0; p1.p(); p1 = m1.D()) {
                m1 = m1.Q();
                if(m1 == null) {
                    return this.g(null, type0, p1);
                }
            }
            return this.g(null, type0, p1);
        }
        return this.g(null, type0, p1);
    }

    protected m h(c c0, GenericArrayType genericArrayType0, p p0) {
        return a.r0(this.g(c0, genericArrayType0.getGenericComponentType(), p0), p0);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public m h0(Type type0, p p0) {
        return type0 instanceof Class ? this.a(type0, this.i(null, ((Class)type0), p0)) : this.g(null, type0, p0);
    }

    protected m i(c c0, Class class0, p p0) {
        m[] arr_m;
        m m4;
        c c1;
        m m0 = this.f(class0);
        if(m0 != null) {
            return m0;
        }
        Class class1 = p0 == null || p0.p() ? class0 : p0.a(class0);
        m m1 = null;
        m m2 = class1 == null ? null : ((m)this.a.get(class1));
        if(m2 != null) {
            return m2;
        }
        if(c0 == null) {
            c1 = new c(class0);
        }
        else {
            c c2 = c0.c(class0);
            if(c2 != null) {
                m m3 = new com.fasterxml.jackson.databind.type.m(class0, q.i);
                c2.a(((com.fasterxml.jackson.databind.type.m)m3));
                return m3;
            }
            c1 = c0.b(class0);
        }
        if(class0.isArray()) {
            m4 = a.r0(this.g(c1, class0.getComponentType(), p0), p0);
        }
        else {
            if(!class0.isInterface()) {
                m1 = this.u(c1, class0, p0);
            }
            arr_m = this.w(c1, class0, p0);
            if(class0 == Properties.class) {
                m2 = j.D0(class0, p0, m1, arr_m, q.w, q.w);
            }
            else if(m1 != null) {
                m2 = m1.c0(class0, p0, m1, arr_m);
            }
            if(m2 == null) {
                m2 = this.l(c1, class0, p0, m1, arr_m);
                if(m2 == null) {
                    m2 = this.m(c1, class0, p0, m1, arr_m);
                    m4 = m2 == null ? this.r(class0, p0, m1, arr_m) : m2;
                }
                else {
                    m4 = m2;
                }
            }
            else {
                m4 = m2;
            }
        }
        c1.d(m4);
        if(class1 != null && !m4.U()) {
            this.a.putIfAbsent(class1, m4);
        }
        return m4;
    }

    @Deprecated
    public m i0(Type type0, Class class0) {
        return class0 == null ? this.g0(type0, null) : this.g0(type0, this.f0(class0));
    }

    protected m j(c c0, ParameterizedType parameterizedType0, p p0) {
        Class class0 = (Class)parameterizedType0.getRawType();
        if(class0 == q.m) {
            return q.z;
        }
        if(class0 == q.l) {
            return q.y;
        }
        Type[] arr_type = parameterizedType0.getActualTypeArguments();
        int v1 = arr_type == null ? 0 : arr_type.length;
        if(v1 == 0) {
            return this.i(c0, class0, q.i);
        }
        m[] arr_m = new m[v1];
        for(int v = 0; v < v1; ++v) {
            arr_m[v] = this.g(c0, arr_type[v], p0);
        }
        return this.i(c0, class0, p.e(class0, arr_m));
    }

    public static q j0() {
        return q.h;
    }

    protected m k(c c0, TypeVariable typeVariable0, p p0) {
        Type[] arr_type;
        String s = typeVariable0.getName();
        if(p0 == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + s + "\")");
        }
        m m0 = p0.j(s);
        if(m0 != null) {
            return m0;
        }
        if(p0.n(s)) {
            return q.x;
        }
        p p1 = p0.u(s);
        synchronized(typeVariable0) {
            arr_type = typeVariable0.getBounds();
        }
        return this.g(c0, arr_type[0], p1);
    }

    public Class k0(String s) throws ClassNotFoundException {
        Throwable throwable0;
        if(s.indexOf(46) < 0) {
            Class class0 = this.e(s);
            if(class0 != null) {
                return class0;
            }
        }
        ClassLoader classLoader0 = this.q0() == null ? Thread.currentThread().getContextClassLoader() : this.q0();
        if(classLoader0 != null) {
            try {
                return this.B(s, true, classLoader0);
            }
            catch(Exception exception0) {
                throwable0 = h.P(exception0);
                return this.A(s);
            }
        }
        throwable0 = null;
        try {
            return this.A(s);
        }
        catch(Exception exception1) {
            if(throwable0 == null) {
                throwable0 = h.P(exception1);
            }
            h.x0(throwable0);
            throw new ClassNotFoundException(throwable0.getMessage(), throwable0);
        }
    }

    protected m l(c c0, Class class0, p p0, m m0, m[] arr_m) {
        if(p0 == null) {
            p0 = q.i;
        }
        if(class0 == Map.class) {
            return this.q(class0, p0, m0, arr_m);
        }
        if(class0 == Collection.class) {
            return this.c(class0, p0, m0, arr_m);
        }
        if(class0 == AtomicReference.class) {
            return this.s(class0, p0, m0, arr_m);
        }
        if(class0 != Iterator.class && class0 != Stream.class) {
            if(BaseStream.class.isAssignableFrom(class0)) {
                if(DoubleStream.class.isAssignableFrom(class0)) {
                    return this.p(class0, p0, m0, arr_m, q.t);
                }
                if(IntStream.class.isAssignableFrom(class0)) {
                    return this.p(class0, p0, m0, arr_m, q.u);
                }
                return LongStream.class.isAssignableFrom(class0) ? this.p(class0, p0, m0, arr_m, q.v) : null;
            }
            return null;
        }
        return this.o(class0, p0, m0, arr_m);
    }

    protected m m(c c0, Class class0, p p0, m m0, m[] arr_m) {
        for(int v = 0; v < arr_m.length; ++v) {
            m m1 = arr_m[v].c0(class0, p0, m0, arr_m);
            if(m1 != null) {
                return m1;
            }
        }
        return null;
    }

    public m m0(m m0, Class class0) {
        m m1 = m0.A(class0);
        if(m1 != null) {
            m m2 = m1.D().l(0);
            return m2 == null ? this.y() : m2;
        }
        return this.y();
    }

    protected m n(c c0, WildcardType wildcardType0, p p0) {
        return this.g(c0, wildcardType0.getUpperBounds()[0], p0);
    }

    public m[] n0(m m0, Class class0) {
        m m1 = m0.A(class0);
        return m1 == null ? q.g : m1.D().s();
    }

    private m o(Class class0, p p0, m m0, m[] arr_m) {
        List list0 = p0.m();
        if(list0.isEmpty()) {
            return this.p(class0, p0, m0, arr_m, this.y());
        }
        if(list0.size() != 1) {
            throw new IllegalArgumentException("Strange Iteration type " + class0.getName() + ": cannot determine type parameters");
        }
        return this.p(class0, p0, m0, arr_m, ((m)list0.get(0)));
    }

    @Deprecated
    public m[] o0(Class class0, Class class1) {
        return this.n0(this.f0(class0), class1);
    }

    private m p(Class class0, p p0, m m0, m[] arr_m, m m1) {
        return g.y0(class0, p0, m0, arr_m, m1);
    }

    @Deprecated
    public m[] p0(Class class0, Class class1, p p0) {
        return this.n0(this.h0(class0, p0), class1);
    }

    private m q(Class class0, p p0, m m0, m[] arr_m) {
        if(class0 == Properties.class) {
            return j.D0(class0, p0, m0, arr_m, q.w, q.w);
        }
        List list0 = p0.m();
        int v = list0.size();
        switch(v) {
            case 0: {
                m m1 = this.y();
                return j.D0(class0, p0, m0, arr_m, m1, m1);
            }
            case 2: {
                return j.D0(class0, p0, m0, arr_m, ((m)list0.get(0)), ((m)list0.get(1)));
            }
            default: {
                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", h.l0(class0), v, (v == 1 ? "" : "s"), p0));
            }
        }
    }

    public ClassLoader q0() {
        return this.d;
    }

    protected m r(Class class0, p p0, m m0, m[] arr_m) {
        return new n(class0, p0, m0, arr_m);
    }

    public m r0(m m0, m m1) {
        if(m0 == null) {
            return m1;
        }
        if(m1 == null) {
            return m0;
        }
        Class class0 = m0.g();
        Class class1 = m1.g();
        if(class0 == class1) {
            return m0;
        }
        return class0.isAssignableFrom(class1) ? m1 : m0;
    }

    private m s(Class class0, p p0, m m0, m[] arr_m) {
        List list0 = p0.m();
        if(list0.isEmpty()) {
            return l.z0(class0, p0, m0, arr_m, this.y());
        }
        if(list0.size() != 1) {
            throw new IllegalArgumentException("Strange Reference type " + class0.getName() + ": cannot determine type parameters");
        }
        return l.z0(class0, p0, m0, arr_m, ((m)list0.get(0)));
    }

    public static Class s0(Type type0) {
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof m) {
            return ((m)type0).g();
        }
        if(type0 instanceof GenericArrayType) {
            return Array.newInstance(q.s0(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
        }
        if(type0 instanceof ParameterizedType) {
            return q.s0(((ParameterizedType)type0).getRawType());
        }
        if(type0 instanceof TypeVariable) {
            return q.s0(((TypeVariable)type0).getBounds()[0]);
        }
        return type0 instanceof WildcardType ? q.s0(((WildcardType)type0).getUpperBounds()[0]) : q.j0().f0(type0).g();
    }

    public m t0(Type type0, p p0) {
        return this.g(null, type0, p0);
    }

    protected m u(c c0, Class class0, p p0) {
        Type type0 = h.L(class0);
        return type0 == null ? null : this.g(c0, type0, p0);
    }

    @Deprecated
    public m u0(Class class0) {
        return this.d(class0, q.i, null, null);
    }

    public static m v0() {
        return q.j0().y();
    }

    protected m[] w(c c0, Class class0, p p0) {
        Type[] arr_type = h.K(class0);
        if(arr_type != null && arr_type.length != 0) {
            m[] arr_m = new m[arr_type.length];
            for(int v = 0; v < arr_type.length; ++v) {
                arr_m[v] = this.g(c0, arr_type[v], p0);
            }
            return arr_m;
        }
        return q.g;
    }

    @Deprecated
    public q w0(t t0) {
        return new q(t0, this.c, this.b, this.d);
    }

    private String x(m m0, m m1) throws IllegalArgumentException {
        List list0 = m0.D().m();
        List list1 = m1.D().m();
        int v = list1.size();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            m m2 = (m)list0.get(v2);
            m m3 = v2 >= v ? q.v0() : ((m)list1.get(v2));
            if(!this.z(m2, m3) && (!m2.j(Object.class) && (v2 != 0 || !m0.r() || !m3.j(Object.class)) && (!m2.isInterface() || !m2.b0(m3.g())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", ((int)(v2 + 1)), v1, m2.w(), m3.w());
            }
        }
        return null;
    }

    public q x0(w w0) {
        return new q(w0, this.c, this.b, this.d);
    }

    protected m y() {
        return q.x;
    }

    public q y0(ClassLoader classLoader0) {
        return new q(this.a, this.c, this.b, classLoader0);
    }

    private boolean z(m m0, m m1) {
        if(m1 instanceof k) {
            ((k)m1).t0(m0);
            return true;
        }
        if(m0.g() != m1.g()) {
            return false;
        }
        List list0 = m0.D().m();
        List list1 = m1.D().m();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.z(((m)list0.get(v1)), ((m)list1.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public q z0(r r0) {
        w w0 = this.a;
        if(r0 == null) {
            return new q(null, this.c, null, this.d);
        }
        r[] arr_r = this.b;
        if(arr_r == null) {
            return new q(null, this.c, new r[]{r0}, this.d);
        }
        r[] arr_r1 = (r[])com.fasterxml.jackson.databind.util.c.j(arr_r, r0);
        return new q(w0, this.c, arr_r1, this.d);
    }
}

