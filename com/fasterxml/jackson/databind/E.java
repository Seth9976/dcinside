package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.databind.cfg.l;
import com.fasterxml.jackson.databind.cfg.q;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.F;
import com.fasterxml.jackson.databind.introspect.b;
import com.fasterxml.jackson.databind.jsontype.d;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.j.a;
import com.fasterxml.jackson.databind.util.j;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

public abstract class e {
    private static final int a = 500;

    public abstract boolean A(l arg1);

    public N B(b b0, F f0) throws o {
        t t0 = this.q();
        boolean z = t0.M() != null;
        return ((N)h.n(f0.c(), t0.c())).b(f0.f());
    }

    public P C(b b0, F f0) {
        t t0 = this.q();
        boolean z = t0.M() != null;
        return (P)h.n(f0.e(), t0.c());
    }

    public abstract Object D(m arg1, String arg2) throws o;

    public Object E(Class class0, String s) throws o {
        return this.D(this.l(class0), s);
    }

    public m F(m m0, String s, d d0) throws o {
        Class class0;
        int v = s.indexOf(60);
        if(v > 0) {
            return this.e(m0, s, d0, v);
        }
        t t0 = this.q();
        com.fasterxml.jackson.databind.jsontype.d.b d$b0 = d0.b(t0, m0, s);
        if(d$b0 == com.fasterxml.jackson.databind.jsontype.d.b.b) {
            return (m)this.h(m0, s, d0);
        }
        try {
            class0 = this.x().k0(s);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
        catch(Exception exception0) {
            throw this.y(m0, s, String.format("problem: (%s) %s", exception0.getClass().getName(), h.q(exception0)));
        }
        if(!m0.b0(class0)) {
            return (m)this.f(m0, s);
        }
        m m1 = t0.S().b0(m0, class0);
        return d$b0 != com.fasterxml.jackson.databind.jsontype.d.b.c || d0.c(t0, m0, m1) == com.fasterxml.jackson.databind.jsontype.d.b.a ? m1 : ((m)this.g(m0, s, d0));
    }

    public m G(m m0, String s) throws o {
        Class class0;
        if(s.indexOf(60) > 0) {
            m m1 = this.x().J(s);
            if(m1.a0(m0.g())) {
                return m1;
            }
        }
        else {
            try {
                class0 = this.x().k0(s);
            }
            catch(ClassNotFoundException unused_ex) {
                return null;
            }
            catch(Exception exception0) {
                throw this.y(m0, s, String.format("problem: (%s) %s", exception0.getClass().getName(), h.q(exception0)));
            }
            if(m0.b0(class0)) {
                return this.x().b0(m0, class0);
            }
        }
        throw this.y(m0, s, "Not a subtype");
    }

    public abstract e H(Object arg1, Object arg2);

    protected String a(String s, String s1) {
        return s1 == null ? s : s + ": " + s1;
    }

    protected String b(String s) {
        return s == null ? "[N/A]" : this.i(s);
    }

    protected final String c(String s, Object[] arr_object) {
        return arr_object.length <= 0 ? s : String.format(s, arr_object);
    }

    protected String d(String s) {
        return s == null ? "[N/A]" : String.format("\"%s\"", this.i(s));
    }

    private m e(m m0, String s, d d0, int v) throws o {
        t t0 = this.q();
        com.fasterxml.jackson.databind.jsontype.d.b d$b0 = d0.b(t0, m0, s.substring(0, v));
        if(d$b0 == com.fasterxml.jackson.databind.jsontype.d.b.b) {
            return (m)this.h(m0, s, d0);
        }
        m m1 = this.x().J(s);
        if(!m1.a0(m0.g())) {
            return (m)this.f(m0, s);
        }
        return d$b0 == com.fasterxml.jackson.databind.jsontype.d.b.a || d0.c(t0, m0, m1) == com.fasterxml.jackson.databind.jsontype.d.b.a ? m1 : ((m)this.g(m0, s, d0));
    }

    protected Object f(m m0, String s) throws o {
        throw this.y(m0, s, "Not a subtype");
    }

    protected Object g(m m0, String s, d d0) throws o {
        throw this.y(m0, s, "Configured `PolymorphicTypeValidator` (of type " + h.j(d0) + ") denied resolution");
    }

    protected Object h(m m0, String s, d d0) throws o {
        throw this.y(m0, s, "Configured `PolymorphicTypeValidator` (of type " + h.j(d0) + ") denied resolution");
    }

    protected final String i(String s) {
        if(s == null) {
            return "";
        }
        return s.length() > 500 ? s.substring(0, 500) + "]...[" + s.substring(s.length() - 500) : s;
    }

    public abstract boolean j();

    public abstract m k(m arg1, Class arg2);

    public m l(Type type0) {
        return type0 == null ? null : this.x().f0(type0);
    }

    public j m(b b0, Object object0) throws o {
        j j0 = null;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof j) {
            return (j)object0;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + object0.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        if(((Class)object0) != a.class && !h.U(((Class)object0))) {
            if(!j.class.isAssignableFrom(((Class)object0))) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<Converter>");
            }
            t t0 = this.q();
            q q0 = t0.M();
            if(q0 != null) {
                j0 = q0.a(t0, b0, ((Class)object0));
            }
            return j0 == null ? ((j)h.n(((Class)object0), t0.c())) : j0;
        }
        return null;
    }

    public abstract Class n();

    public abstract com.fasterxml.jackson.databind.b o();

    public abstract Object p(Object arg1);

    public abstract t q();

    public abstract com.fasterxml.jackson.databind.cfg.m r();

    public abstract com.fasterxml.jackson.annotation.n.d s(Class arg1);

    public abstract Locale u();

    public abstract TimeZone w();

    public abstract com.fasterxml.jackson.databind.type.q x();

    protected abstract o y(m arg1, String arg2, String arg3);

    public abstract boolean z(com.fasterxml.jackson.databind.t arg1);
}

