package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;

public class f extends q {
    protected final f g;
    protected b h;
    protected f i;
    protected String j;
    protected Object k;
    protected boolean l;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;

    protected f(int v, f f0, b b0) {
        this.a = v;
        this.g = f0;
        this.c = f0 == null ? 0 : f0.c + 1;
        this.h = b0;
        this.b = -1;
    }

    protected f(int v, f f0, b b0, Object object0) {
        this.a = v;
        this.g = f0;
        this.c = f0 == null ? 0 : f0.c + 1;
        this.h = b0;
        this.b = -1;
        this.k = object0;
    }

    public static f A(b b0) {
        return new f(0, null, b0);
    }

    public b B() {
        return this.h;
    }

    public final f C() {
        return this.g;
    }

    public f D(int v) {
        this.a = v;
        this.b = -1;
        this.j = null;
        this.l = false;
        this.k = null;
        b b0 = this.h;
        if(b0 != null) {
            b0.e();
        }
        return this;
    }

    public f E(int v, Object object0) {
        this.a = v;
        this.b = -1;
        this.j = null;
        this.l = false;
        this.k = object0;
        b b0 = this.h;
        if(b0 != null) {
            b0.e();
        }
        return this;
    }

    public f F(b b0) {
        this.h = b0;
        return this;
    }

    public int G(String s) throws p {
        if(this.a == 2 && !this.l) {
            this.l = true;
            this.j = s;
            b b0 = this.h;
            if(b0 != null) {
                this.t(b0, s);
            }
            return this.b >= 0 ? 1 : 0;
        }
        return 4;
    }

    public int H() {
        int v = this.a;
        if(v == 2) {
            if(!this.l) {
                return 5;
            }
            this.l = false;
            ++this.b;
            return 2;
        }
        if(v == 1) {
            int v1 = this.b;
            this.b = v1 + 1;
            return v1 < 0 ? 0 : 1;
        }
        int v2 = this.b + 1;
        this.b = v2;
        return v2 == 0 ? 0 : 3;
    }

    @Override  // com.fasterxml.jackson.core.q
    public final String b() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.q
    public Object c() {
        return this.k;
    }

    @Override  // com.fasterxml.jackson.core.q
    public q f() {
        return this.C();
    }

    @Override  // com.fasterxml.jackson.core.q
    public boolean j() {
        return this.j != null;
    }

    @Override  // com.fasterxml.jackson.core.q
    public void q(Object object0) {
        this.k = object0;
    }

    private final void t(b b0, String s) throws p {
        if(b0.d(s)) {
            Object object0 = b0.c();
            throw new j("Duplicate field \'" + s + "\'", (object0 instanceof k ? ((k)object0) : null));
        }
    }

    public f u() {
        this.k = null;
        return this.g;
    }

    public f v() {
        f f0 = this.i;
        if(f0 == null) {
            f f1 = new f(1, this, (this.h == null ? null : this.h.a()));
            this.i = f1;
            return f1;
        }
        return f0.D(1);
    }

    public f w(Object object0) {
        f f0 = this.i;
        if(f0 == null) {
            f f1 = new f(1, this, (this.h == null ? null : this.h.a()), object0);
            this.i = f1;
            return f1;
        }
        return f0.E(1, object0);
    }

    public f x() {
        f f0 = this.i;
        if(f0 == null) {
            f f1 = new f(2, this, (this.h == null ? null : this.h.a()));
            this.i = f1;
            return f1;
        }
        return f0.D(2);
    }

    public f y(Object object0) {
        f f0 = this.i;
        if(f0 == null) {
            f f1 = new f(2, this, (this.h == null ? null : this.h.a()), object0);
            this.i = f1;
            return f1;
        }
        return f0.E(2, object0);
    }

    @Deprecated
    public static f z() {
        return f.A(null);
    }
}

