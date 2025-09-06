package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.b.a;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.y;
import java.util.Iterator;

public abstract class v implements y {
    protected static final b a;

    static {
        v.a = b.d();
    }

    public abstract String A();

    public k B() {
        k k0 = this.v();
        if(k0 == null) {
            k0 = this.G();
            if(k0 == null) {
                return this.y();
            }
        }
        return k0;
    }

    public k C() {
        k k0 = this.G();
        return k0 == null ? this.y() : k0;
    }

    public abstract k D();

    public abstract m E();

    public abstract Class F();

    public abstract l G();

    public abstract boolean H();

    public abstract boolean I();

    public abstract boolean J();

    public boolean K(B b0) {
        return this.a().equals(b0);
    }

    public abstract boolean L();

    public abstract boolean M();

    public boolean N() {
        return this.M();
    }

    public boolean O() {
        return false;
    }

    public abstract v P(B arg1);

    public abstract v Q(String arg1);

    public abstract B a();

    public boolean c() {
        return this.getMetadata().l();
    }

    public abstract B d();

    public abstract A getMetadata();

    @Override  // com.fasterxml.jackson.databind.util.y
    public abstract String getName();

    public boolean l() {
        return this.B() != null;
    }

    public boolean m() {
        return this.u() != null;
    }

    public abstract b n();

    public F p() {
        return null;
    }

    public String r() {
        a b$a0 = this.s();
        return b$a0 == null ? null : b$a0.b();
    }

    public a s() {
        return null;
    }

    public Class[] t() {
        return null;
    }

    public k u() {
        k k0 = this.z();
        return k0 == null ? this.y() : k0;
    }

    public abstract o v();

    public Iterator w() {
        return h.p();
    }

    public abstract i y();

    public abstract l z();
}

