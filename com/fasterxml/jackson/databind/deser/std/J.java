package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.B.c;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.impl.q;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class j extends D implements c {
    protected final m f;
    protected final v g;
    protected final boolean h;
    protected final Boolean i;

    protected j(j j0) {
        this(j0, j0.g, j0.i);
    }

    protected j(j j0, v v0, Boolean boolean0) {
        super(j0.f);
        this.f = j0.f;
        this.g = v0;
        this.i = boolean0;
        this.h = q.e(v0);
    }

    protected j(m m0) {
        this(m0, null, null);
    }

    protected j(m m0, v v0, Boolean boolean0) {
        super(m0);
        this.f = m0;
        this.i = boolean0;
        this.g = v0;
        this.h = q.e(v0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public y k(String s) {
        n n0 = this.r1();
        if(n0 == null) {
            throw new IllegalArgumentException(String.format("Cannot handle managed/back reference \'%s\': type: container deserializer of type %s returned null for \'getContentDeserializer()\'", s, this.getClass().getName()));
        }
        return n0.k(s);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public m k1() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public a m() {
        return a.c;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(h h0) throws o {
        B b0 = this.e();
        if(b0 == null || !b0.k()) {
            m m0 = this.k1();
            h0.D(m0, String.format("Cannot create empty instance of %s, no default Creator", m0));
        }
        try {
            return b0.A(h0);
        }
        catch(IOException iOException0) {
            return com.fasterxml.jackson.databind.util.h.u0(h0, iOException0);
        }
    }

    public abstract n r1();

    public m s1() {
        return this.f == null ? com.fasterxml.jackson.databind.type.q.v0() : this.f.E();
    }

    protected Object t1(h h0, Throwable throwable0, Object object0, String s) throws IOException {
        while(throwable0 instanceof InvocationTargetException && throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        com.fasterxml.jackson.databind.util.h.v0(throwable0);
        if(h0 != null && !h0.J0(i.r)) {
            com.fasterxml.jackson.databind.util.h.x0(throwable0);
        }
        if(!(throwable0 instanceof IOException && !(throwable0 instanceof o))) {
            throw o.D(throwable0, object0, ((String)com.fasterxml.jackson.databind.util.h.m0(s, "N/A")));
        }
        throw (IOException)throwable0;
    }

    @Deprecated
    protected Object u1(Throwable throwable0, Object object0, String s) throws IOException {
        return this.t1(null, throwable0, object0, s);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return true;
    }
}

