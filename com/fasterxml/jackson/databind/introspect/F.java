package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class f extends p {
    static final class a implements Serializable {
        protected Class a;
        protected Class[] b;
        private static final long c = 1L;

        public a(Constructor constructor0) {
            this.a = constructor0.getDeclaringClass();
            this.b = constructor0.getParameterTypes();
        }
    }

    protected final Constructor f;
    protected a g;
    private static final long h = 1L;

    public f(K k0, Constructor constructor0, s s0, s[] arr_s) {
        super(k0, s0, arr_s);
        Objects.requireNonNull(constructor0);
        this.f = constructor0;
    }

    protected f(a f$a0) {
        super(null, null, null);
        this.f = null;
        this.g = f$a0;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    @Deprecated
    public Type A(int v) {
        Type[] arr_type = this.f.getGenericParameterTypes();
        return v < arr_type.length ? arr_type[v] : null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public int D() {
        return this.f.getParameterCount();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public m E(int v) {
        Type[] arr_type = this.f.getGenericParameterTypes();
        return v < arr_type.length ? this.a.a(arr_type[v]) : null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public Class F(int v) {
        Class[] arr_class = this.f.getParameterTypes();
        return v < arr_class.length ? arr_class[v] : null;
    }

    public Constructor H() {
        return this.f;
    }

    Object I() {
        Class class0;
        try {
            class0 = this.g.a;
            Constructor constructor0 = class0.getDeclaredConstructor(this.g.b);
            if(!constructor0.isAccessible()) {
                h.i(constructor0, false);
            }
            return new f(null, constructor0, null, null);
        }
        catch(Exception unused_ex) {
            throw new IllegalArgumentException("Could not find constructor with " + this.g.b.length + " args from Class \'" + class0.getName());
        }
    }

    public f J(s s0) {
        return new f(this.a, this.f, s0, this.d);
    }

    Object K() {
        return new f(new a(this.f));
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public AnnotatedElement c() {
        return this.H();
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
        return h.R(object0, f.class) ? Objects.equals(this.f, ((f)object0).f) : false;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Class f() {
        return this.f.getDeclaringClass();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public m g() {
        Class class0 = this.f();
        return this.a.a(class0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String getName() {
        return this.f.getName();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int hashCode() {
        return Objects.hashCode(this.f);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Class m() {
        return this.f.getDeclaringClass();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Member o() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Object q(Object object0) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + this.m().getName());
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public void r(Object object0, Object object1) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + this.m().getName());
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public b s(s s0) {
        return this.J(s0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String toString() {
        int v = this.f.getParameterCount();
        String s = h.l0(this.f.getDeclaringClass());
        Integer integer0 = v;
        return v == 1 ? String.format("[constructor for %s (%d arg%s), annotations: %s", s, integer0, "", this.b) : String.format("[constructor for %s (%d arg%s), annotations: %s", s, integer0, "s", this.b);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object w() throws Exception {
        return this.f.newInstance(null);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object x(Object[] arr_object) throws Exception {
        return this.f.newInstance(arr_object);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.p
    public final Object y(Object object0) throws Exception {
        return this.f.newInstance(object0);
    }
}

