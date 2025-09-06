package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class l extends p implements Serializable {
    static final class a implements Serializable {
        protected Class a;
        protected String b;
        protected Class[] c;
        private static final long d = 1L;

        public a(Method method0) {
            this.a = method0.getDeclaringClass();
            this.b = method0.getName();
            this.c = method0.getParameterTypes();
        }
    }

    protected final transient Method f;
    protected Class[] g;
    protected a h;
    private static final long i = 1L;

    public l(K k0, Method method0, s s0, s[] arr_s) {
        super(k0, s0, arr_s);
        if(method0 == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f = method0;
    }

    protected l(a l$a0) {
        super(null, null, null);
        this.f = null;
        this.h = l$a0;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    @Deprecated
    public Type A(int v) {
        Type[] arr_type = this.K();
        return v < arr_type.length ? arr_type[v] : null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public int D() {
        return g.a(this.f);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public m E(int v) {
        Type[] arr_type = this.f.getGenericParameterTypes();
        return v < arr_type.length ? this.a.a(arr_type[v]) : null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public Class F(int v) {
        Class[] arr_class = this.M();
        return v < arr_class.length ? arr_class[v] : null;
    }

    public final Object H(Object object0) throws Exception {
        return this.f.invoke(object0, null);
    }

    public final Object I(Object object0, Object[] arr_object) throws Exception {
        return this.f.invoke(object0, arr_object);
    }

    public Method J() {
        return this.f;
    }

    @Deprecated
    public Type[] K() {
        return this.f.getGenericParameterTypes();
    }

    public Method L() {
        return this.f;
    }

    public Class[] M() {
        if(this.g == null) {
            this.g = this.f.getParameterTypes();
        }
        return this.g;
    }

    public Class N() {
        return this.f.getReturnType();
    }

    @Deprecated
    public boolean O() {
        return this.N() != Void.TYPE;
    }

    Object P() {
        Class class0;
        try {
            class0 = this.h.a;
            Method method0 = class0.getDeclaredMethod(this.h.b, this.h.c);
            if(!method0.isAccessible()) {
                h.i(method0, false);
            }
            return new l(null, method0, null, null);
        }
        catch(Exception unused_ex) {
            throw new IllegalArgumentException("Could not find method \'" + this.h.b + "\' from Class \'" + class0.getName());
        }
    }

    public l Q(s s0) {
        return new l(this.a, this.f, s0, this.d);
    }

    Object R() {
        return new l(new a(this.f));
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public AnnotatedElement c() {
        return this.J();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int e() {
        return this.f.getModifiers();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return h.R(object0, l.class) ? Objects.equals(this.f, ((l)object0).f) : false;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Class f() {
        return this.f.getReturnType();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public m g() {
        Type type0 = this.f.getGenericReturnType();
        return this.a.a(type0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String getName() {
        return this.f.getName();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int hashCode() {
        return this.f.hashCode();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Class m() {
        return this.f.getDeclaringClass();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public String n() {
        String s = super.n();
        switch(this.D()) {
            case 0: {
                return s + "()";
            }
            case 1: {
                return s + "(" + this.F(0).getName() + ")";
            }
            default: {
                return String.format("%s(%d params)", super.n(), this.D());
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Member o() {
        return this.L();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Object q(Object object0) throws IllegalArgumentException {
        try {
            return this.f.invoke(object0, null);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new IllegalArgumentException("Failed to getValue() with method " + this.n() + ": " + h.q(illegalAccessException0), illegalAccessException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public void r(Object object0, Object object1) throws IllegalArgumentException {
        try {
            this.f.invoke(object0, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new IllegalArgumentException("Failed to setValue() with method " + this.n() + ": " + h.q(illegalAccessException0), illegalAccessException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public b s(s s0) {
        return this.Q(s0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String toString() {
        return "[method " + this.n() + "]";
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object w() throws Exception {
        return this.f.invoke(null, null);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object x(Object[] arr_object) throws Exception {
        return this.f.invoke(null, arr_object);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object y(Object object0) throws Exception {
        return this.f.invoke(null, object0);
    }
}

