package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class m extends a implements Serializable, Type {
    protected final Class a;
    protected final int b;
    protected final Object c;
    protected final Object d;
    protected final boolean e;
    private static final long f = 1L;

    protected m(m m0) {
        this.a = m0.a;
        this.b = m0.b;
        this.c = m0.c;
        this.d = m0.d;
        this.e = m0.e;
    }

    protected m(Class class0, int v, Object object0, Object object1, boolean z) {
        this.a = class0;
        this.b = v * 0x1F + class0.hashCode();
        this.c = object0;
        this.d = object1;
        this.e = z;
    }

    public abstract m A(Class arg1);

    public abstract m[] B(Class arg1);

    @Deprecated
    public m C(Class class0) {
        return this;
    }

    public abstract p D();

    public m E() {
        return null;
    }

    public Object F() {
        return null;
    }

    public Object G() {
        return null;
    }

    public String I() {
        StringBuilder stringBuilder0 = new StringBuilder(40);
        this.J(stringBuilder0);
        return stringBuilder0.toString();
    }

    public abstract StringBuilder J(StringBuilder arg1);

    public String K() {
        StringBuilder stringBuilder0 = new StringBuilder(40);
        this.L(stringBuilder0);
        return stringBuilder0.toString();
    }

    public abstract StringBuilder L(StringBuilder arg1);

    public abstract List M();

    public m N() {
        return null;
    }

    public m O() {
        return null;
    }

    public abstract m Q();

    public Object R() {
        return this.d;
    }

    public Object S() {
        return this.c;
    }

    public boolean T() {
        return true;
    }

    public boolean U() {
        return this.d != null || this.c != null;
    }

    public boolean V() {
        return this.c != null;
    }

    public final boolean W() {
        return h.Y(this.a) && this.a != Enum.class;
    }

    public boolean X() {
        return false;
    }

    public final boolean Y() {
        return this.a == Object.class;
    }

    public final boolean Z() {
        return h.h0(this.a);
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public a a(int v) {
        return this.y(v);
    }

    public final boolean a0(Class class0) {
        return this.a == class0 || class0.isAssignableFrom(this.a);
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public abstract int b();

    public final boolean b0(Class class0) {
        return this.a == class0 || this.a.isAssignableFrom(class0);
    }

    @Override  // com.fasterxml.jackson.core.type.a
    @Deprecated
    public abstract String c(int arg1);

    public abstract m c0(Class arg1, p arg2, m arg3, m[] arg4);

    @Override  // com.fasterxml.jackson.core.type.a
    public a d() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public a e() {
        return this.N();
    }

    public final boolean e0() {
        return this.e;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override  // com.fasterxml.jackson.core.type.a
    @Deprecated
    public Class f() {
        return null;
    }

    public abstract m f0(m arg1);

    @Override  // com.fasterxml.jackson.core.type.a
    public final Class g() {
        return this.a;
    }

    public abstract m g0(Object arg1);

    @Override  // com.fasterxml.jackson.core.type.a
    public a h() {
        return this.O();
    }

    public abstract m h0(Object arg1);

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean i() {
        return this.b() > 0;
    }

    public m i0(m m0) {
        Object object0 = m0.R();
        m m1 = object0 == this.d ? this : this.k0(object0);
        Object object1 = m0.S();
        return object1 == this.c ? m1 : m1.m0(object1);
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public final boolean isInterface() {
        return this.a.isInterface();
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public final boolean isPrimitive() {
        return this.a.isPrimitive();
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public final boolean j(Class class0) {
        return this.a == class0;
    }

    public abstract m j0();

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean k() {
        return Modifier.isAbstract(this.a.getModifiers());
    }

    public abstract m k0(Object arg1);

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean l() {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean m() {
        return false;
    }

    public abstract m m0(Object arg1);

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean n() {
        return (this.a.getModifiers() & 0x600) == 0 ? true : this.a.isPrimitive();
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public abstract boolean o();

    @Override  // com.fasterxml.jackson.core.type.a
    public final boolean p() {
        return h.Y(this.a);
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public final boolean q() {
        return Modifier.isFinal(this.a.getModifiers());
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean r() {
        return false;
    }

    @Override
    public abstract String toString();

    @Override  // com.fasterxml.jackson.core.type.a
    public boolean u() {
        return Throwable.class.isAssignableFrom(this.a);
    }

    @Deprecated
    protected m x(Class class0) [...] // Inlined contents

    public abstract m y(int arg1);

    public m z(int v) {
        m m0 = this.y(v);
        return m0 == null ? q.v0() : m0;
    }
}

