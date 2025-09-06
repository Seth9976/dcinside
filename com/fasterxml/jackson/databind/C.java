package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.databind.annotation.f.a;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.introspect.i;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.util.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class c {
    protected final m a;

    protected c(m m0) {
        this.a = m0;
    }

    public abstract d A();

    public abstract List B();

    public abstract List C();

    public abstract List D();

    public abstract List E();

    public abstract Set F();

    public abstract F G();

    public m H() {
        return this.a;
    }

    public abstract boolean I();

    public abstract Object J(boolean arg1);

    public boolean K() {
        return this.A().E();
    }

    public boolean L() {
        return this.a.Z();
    }

    @Deprecated
    public abstract m M(Type arg1);

    @Deprecated
    public abstract p a();

    public abstract k b();

    @Deprecated
    public l c() {
        k k0 = this.d();
        return k0 instanceof l ? ((l)k0) : null;
    }

    public abstract k d();

    @Deprecated
    public k e() {
        k k0 = this.d();
        return k0 instanceof i ? k0 : null;
    }

    @Deprecated
    public abstract Map f();

    public abstract List g();

    public String h() {
        return null;
    }

    public abstract f i();

    public abstract Class[] j();

    public abstract j k();

    public abstract com.fasterxml.jackson.annotation.n.d l(com.fasterxml.jackson.annotation.n.d arg1);

    @Deprecated
    public abstract Method m(Class[] arg1);

    public abstract Map n();

    public k o() {
        return null;
    }

    public abstract k p();

    @Deprecated
    public abstract l q();

    public abstract l r(String arg1, Class[] arg2);

    public abstract Class s();

    public abstract a t();

    public abstract List u();

    public abstract b v(b arg1);

    public abstract j w();

    @Deprecated
    public abstract Constructor x(Class[] arg1);

    public Class y() {
        return this.a.g();
    }

    public abstract com.fasterxml.jackson.databind.util.b z();
}

