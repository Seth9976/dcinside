package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.B;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.base.a;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.z;
import com.fasterxml.jackson.core.w;
import java.io.IOException;

public abstract class c extends a {
    protected w A;
    protected boolean B;
    protected boolean C;
    protected static final int[] D;
    protected static final i E;
    protected final B w;
    protected int[] x;
    protected int y;
    protected d z;

    static {
        c.D = com.fasterxml.jackson.core.io.c.g();
        c.E = k.c;
    }

    public c(g g0, int v, u u0) {
        super(v, u0, g0);
        this.x = c.D;
        this.A = h.x;
        this.w = g0.x0();
        if(b.h.c(v)) {
            this.y = 0x7F;
        }
        this.C = b.n.c(v);
        this.B = !b.f.c(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public int E0() {
        return this.y;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k N1(int v) {
        if(v < 0) {
            v = 0;
        }
        this.y = v;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    protected void T4(int v, int v1) {
        super.T4(v, v1);
        this.B = !b.f.c(v);
        this.C = b.n.c(v);
    }

    protected void Y4(String s) throws IOException {
        this.i(String.format("Can not %s, expecting field name (context: %s)", s, "root"));
    }

    protected void Z4(String s, int v) throws IOException {
        switch(v) {
            case 0: {
                if(this.i.l()) {
                    this.a.h(this);
                    return;
                }
                if(this.i.m()) {
                    this.a.c(this);
                }
                return;
            }
            case 1: {
                this.a.b(this);
                return;
            }
            case 2: {
                this.a.e(this);
                return;
            }
            case 3: {
                this.a.a(this);
                return;
            }
            case 5: {
                this.Y4(s);
                return;
            }
            default: {
                this.k();
            }
        }
    }

    public g a5() {
        return this.g;
    }

    @Override  // com.fasterxml.jackson.core.k
    public i c1() {
        return c.E;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public k d0(b k$b0) {
        super.d0(k$b0);
        if(k$b0 == b.f) {
            this.B = true;
            return this;
        }
        if(k$b0 == b.n) {
            this.C = false;
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k d2(w w0) {
        this.A = w0;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public k e0(b k$b0) {
        super.e0(k$b0);
        if(k$b0 == b.f) {
            this.B = false;
            return this;
        }
        if(k$b0 == b.n) {
            this.C = true;
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public d f0() {
        return this.z;
    }

    @Override  // com.fasterxml.jackson.core.k
    public B g2() {
        return this.w;
    }

    @Override  // com.fasterxml.jackson.core.k
    public k l1(d d0) {
        this.z = d0;
        if(d0 == null) {
            this.x = c.D;
            return this;
        }
        this.x = d0.a();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.base.a
    public H version() {
        return z.i(this.getClass());
    }
}

