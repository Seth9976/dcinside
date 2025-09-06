package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.impl.i;
import com.fasterxml.jackson.databind.t;
import java.util.Collections;
import java.util.List;

public class f {
    protected final c a;
    protected G b;
    protected List c;
    protected d[] d;
    protected a e;
    protected Object f;
    protected k g;
    protected i h;
    private static final d[] i;

    static {
        f.i = new d[0];
    }

    public f(c c0) {
        this.c = Collections.emptyList();
        this.a = c0;
    }

    protected f(f f0) {
        Collections.emptyList();
        this.a = f0.a;
        this.b = f0.b;
        this.c = f0.c;
        this.d = f0.d;
        this.e = f0.e;
        this.f = f0.f;
        this.g = f0.g;
        this.h = f0.h;
    }

    public r a() {
        d[] arr_d;
        if(this.g != null && this.b.a0(t.p)) {
            this.g.k(this.b.a0(t.q));
        }
        a a0 = this.e;
        if(a0 != null) {
            a0.a(this.b);
        }
        if(this.c == null || this.c.isEmpty()) {
            if(this.e == null && this.h == null) {
                return null;
            }
            arr_d = f.i;
        }
        else {
            arr_d = (d[])this.c.toArray(new d[this.c.size()]);
            if(this.b.a0(t.p)) {
                for(int v = 0; v < arr_d.length; ++v) {
                    arr_d[v].A(this.b);
                }
            }
        }
        if(this.d != null && this.d.length != this.c.size()) {
            throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", this.c.size(), ((int)this.d.length)));
        }
        return new e(this.a.H(), this, arr_d, this.d);
    }

    public e b() {
        return e.h0(this.a.H(), this);
    }

    public a c() {
        return this.e;
    }

    public c d() {
        return this.a;
    }

    public com.fasterxml.jackson.databind.introspect.d e() {
        return this.a.A();
    }

    public Object f() {
        return this.f;
    }

    public d[] g() {
        return this.d;
    }

    public i h() {
        return this.h;
    }

    public List i() {
        return this.c;
    }

    public k j() {
        return this.g;
    }

    public boolean k() {
        return this.c != null && this.c.size() > 0;
    }

    public void l(a a0) {
        this.e = a0;
    }

    protected void m(G g0) {
        this.b = g0;
    }

    public void n(Object object0) {
        this.f = object0;
    }

    public void o(d[] arr_d) {
        if(arr_d != null && arr_d.length != this.c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", ((int)arr_d.length), this.c.size()));
        }
        this.d = arr_d;
    }

    public void p(i i0) {
        this.h = i0;
    }

    public void q(List list0) {
        this.c = list0;
    }

    public void r(k k0) {
        if(this.g != null) {
            throw new IllegalArgumentException("Multiple type ids specified with " + this.g + " and " + k0);
        }
        this.g = k0;
    }
}

