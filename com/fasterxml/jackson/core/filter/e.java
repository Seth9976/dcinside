package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import java.io.IOException;

public class e extends q {
    protected final e g;
    protected e h;
    protected String i;
    protected d j;
    protected boolean k;
    protected boolean l;

    protected e(int v, e e0, d d0, boolean z) {
        this.a = v;
        this.g = e0;
        this.c = e0 == null ? 0 : e0.c + 1;
        this.j = d0;
        this.b = -1;
        this.k = z;
        this.l = false;
    }

    public static e A(d d0) {
        return new e(0, null, d0, true);
    }

    public void B(k k0) throws IOException {
        if(this.l) {
            this.l = false;
            k0.v3(this.i);
        }
    }

    public e C(e e0) {
        e e1 = this.g;
        if(e1 == e0) {
            return this;
        }
        while(e1 != null) {
            e e2 = e1.g;
            if(e2 == e0) {
                return e1;
            }
            e1 = e2;
        }
        return null;
    }

    public d D() {
        return this.j;
    }

    public final e E() {
        return this.g;
    }

    public boolean F() {
        return this.k;
    }

    public r G() {
        if(!this.k) {
            this.k = true;
            return this.a == 2 ? r.k : r.m;
        }
        if(this.l && this.a == 2) {
            this.l = false;
            return r.o;
        }
        return null;
    }

    protected e H(int v, d d0, boolean z) {
        this.a = v;
        this.j = d0;
        this.b = -1;
        this.i = null;
        this.k = z;
        this.l = false;
        return this;
    }

    public d I(String s) throws p {
        this.i = s;
        this.l = true;
        return this.j;
    }

    public void J() {
        this.j = null;
        for(e e0 = this.g; e0 != null; e0 = e0.g) {
            e0.j = null;
        }
    }

    public void K(k k0) throws IOException {
        if(this.j != null && this.j != d.a) {
            e e0 = this.g;
            if(e0 != null) {
                e0.t(k0);
            }
            if(!this.k) {
                this.k = true;
                int v = this.a;
                if(v == 2) {
                    k0.D4();
                    k0.v3(this.i);
                    return;
                }
                if(v == 1) {
                    k0.z4();
                }
            }
            else if(this.l) {
                k0.v3(this.i);
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.q
    public final String b() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.core.q
    public Object c() {
        return null;
    }

    @Override  // com.fasterxml.jackson.core.q
    public q f() {
        return this.E();
    }

    @Override  // com.fasterxml.jackson.core.q
    public boolean j() {
        return this.i != null;
    }

    @Override  // com.fasterxml.jackson.core.q
    public void q(Object object0) {
    }

    private void t(k k0) throws IOException {
        if(this.j != null && this.j != d.a) {
            e e0 = this.g;
            if(e0 != null) {
                e0.t(k0);
            }
            if(!this.k) {
                this.k = true;
                int v = this.a;
                if(v == 2) {
                    k0.D4();
                    if(this.l) {
                        this.l = false;
                        k0.v3(this.i);
                    }
                }
                else if(v == 1) {
                    k0.z4();
                }
            }
            else if(this.l) {
                this.l = false;
                k0.v3(this.i);
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.q
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        this.u(stringBuilder0);
        return stringBuilder0.toString();
    }

    protected void u(StringBuilder stringBuilder0) {
        e e0 = this.g;
        if(e0 != null) {
            e0.u(stringBuilder0);
        }
        int v = this.a;
        if(v == 2) {
            stringBuilder0.append('{');
            if(this.i == null) {
                stringBuilder0.append('?');
            }
            else {
                stringBuilder0.append('\"');
                stringBuilder0.append(this.i);
                stringBuilder0.append('\"');
            }
            stringBuilder0.append('}');
            return;
        }
        if(v == 1) {
            stringBuilder0.append('[');
            stringBuilder0.append(this.a());
            stringBuilder0.append(']');
            return;
        }
        stringBuilder0.append("/");
    }

    public d v(d d0) {
        int v = this.a;
        if(v == 2) {
            return d0;
        }
        int v1 = this.b + 1;
        this.b = v1;
        return v == 1 ? d0.h(v1) : d0;
    }

    public e w(k k0) throws IOException {
        if(this.k) {
            k0.n3();
            return this.g;
        }
        if(this.j != null && this.j != d.a && this.j.j(this.i())) {
            e e0 = this.g;
            if(e0 != null) {
                e0.t(k0);
            }
            k0.z4();
            k0.n3();
        }
        return this.g;
    }

    public e x(k k0) throws IOException {
        if(this.k) {
            k0.p3();
            return this.g;
        }
        if(this.j != null && this.j != d.a && this.j.k(this.j())) {
            e e0 = this.g;
            if(e0 != null) {
                e0.t(k0);
            }
            k0.D4();
            k0.p3();
        }
        return this.g;
    }

    public e y(d d0, boolean z) {
        e e0 = this.h;
        if(e0 == null) {
            e e1 = new e(1, this, d0, z);
            this.h = e1;
            return e1;
        }
        return e0.H(1, d0, z);
    }

    public e z(d d0, boolean z) {
        e e0 = this.h;
        if(e0 == null) {
            e e1 = new e(2, this, d0, z);
            this.h = e1;
            return e1;
        }
        return e0.H(2, d0, z);
    }
}

