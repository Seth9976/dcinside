package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.t;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.q;
import java.io.IOException;

public class r implements q {
    protected final String a;
    protected final Object b;
    protected final m c;

    public r(String s, Object object0) {
        this(s, object0, null);
    }

    public r(String s, Object object0, m m0) {
        this.a = s;
        this.b = object0;
        this.c = m0;
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void H(k k0, I i0, j j0) throws IOException {
        this.P(k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void P(k k0, I i0) throws IOException {
        k0.r4(this.a);
        k0.p4('(');
        if(this.b == null) {
            i0.X(k0);
        }
        else {
            boolean z = k0.f0() == null;
            if(z) {
                k0.l1(t.d());
            }
            try {
                m m0 = this.c;
                if(m0 == null) {
                    i0.m0(this.b.getClass(), true, null).m(this.b, k0, i0);
                    goto label_18;
                label_15:
                    if(!z) {
                        throw throwable0;
                    }
                    goto label_16;
                }
                else {
                    i0.k0(m0, true, null).m(this.b, k0, i0);
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                goto label_15;
            }
        label_16:
            k0.l1(null);
            throw throwable0;
        label_18:
            if(z) {
                k0.l1(null);
            }
        }
        k0.p4(')');
    }

    public String a() {
        return this.a;
    }

    public m b() {
        return this.c;
    }

    public Object c() {
        return this.b;
    }
}

