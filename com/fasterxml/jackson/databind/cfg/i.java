package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.E.a;
import com.fasterxml.jackson.annotation.n.d;
import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.databind.introspect.M;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class i implements Serializable {
    protected Map a;
    protected b b;
    protected a c;
    protected M d;
    protected Boolean e;
    protected Boolean f;
    private static final long g = 1L;

    public i() {
        this(null, b.d(), a.d(), com.fasterxml.jackson.databind.introspect.M.b.z(), null, null);
    }

    @Deprecated
    protected i(Map map0, b u$b0, a e$a0, M m0, Boolean boolean0) {
        this(map0, u$b0, e$a0, m0, boolean0, null);
    }

    protected i(Map map0, b u$b0, a e$a0, M m0, Boolean boolean0, Boolean boolean1) {
        this.a = map0;
        this.b = u$b0;
        this.c = e$a0;
        this.d = m0;
        this.e = boolean0;
        this.f = boolean1;
    }

    protected Map a() {
        return new HashMap();
    }

    public i b() {
        if(this.a == null) {
            return new i(null, this.b, this.c, this.d, this.e, this.f);
        }
        Map map0 = this.a();
        for(Object object0: this.a.entrySet()) {
            map0.put(((Map.Entry)object0).getKey(), ((w)((Map.Entry)object0).getValue()).j());
        }
        return new i(map0, this.b, this.c, this.d, this.e, this.f);
    }

    public d c(Class class0) {
        Map map0 = this.a;
        if(map0 != null) {
            h h0 = (h)map0.get(class0);
            if(h0 != null) {
                d n$d0 = h0.b();
                if(n$d0 != null) {
                    return n$d0.o() ? n$d0 : n$d0.A(this.f);
                }
            }
        }
        return this.f == null ? d.c() : d.d(this.f.booleanValue());
    }

    public w d(Class class0) {
        if(this.a == null) {
            this.a = this.a();
        }
        w w0 = (w)this.a.get(class0);
        if(w0 == null) {
            w0 = new w();
            this.a.put(class0, w0);
        }
        return w0;
    }

    public h e(Class class0) {
        return this.a == null ? null : ((h)this.a.get(class0));
    }

    public b f() {
        return this.b;
    }

    public Boolean g() {
        return this.f;
    }

    public Boolean h() {
        return this.e;
    }

    public a i() {
        return this.c;
    }

    public M j() {
        return this.d;
    }

    public void k(b u$b0) {
        this.b = u$b0;
    }

    public void l(Boolean boolean0) {
        this.f = boolean0;
    }

    public void m(Boolean boolean0) {
        this.e = boolean0;
    }

    public void n(a e$a0) {
        this.c = e$a0;
    }

    public void o(M m0) {
        this.d = m0;
    }
}

