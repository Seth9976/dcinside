package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.jsonFormatVisitors.e;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public abstract class r implements e {
    public static abstract class a extends r {
    }

    @Override  // com.fasterxml.jackson.databind.jsonFormatVisitors.e
    public void e(g g0, m m0) throws o {
        g0.p(m0);
    }

    public r f() {
        return null;
    }

    public Class g() {
        return null;
    }

    public boolean h(I i0, Object object0) {
        return object0 == null;
    }

    @Deprecated
    public boolean i(Object object0) {
        return this.h(null, object0);
    }

    public boolean j() {
        return false;
    }

    public Iterator k() {
        return h.p();
    }

    public r l(r r0) {
        throw new UnsupportedOperationException();
    }

    public abstract void m(Object arg1, k arg2, I arg3) throws IOException;

    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        Class class0 = this.g();
        if(class0 == null) {
            class0 = object0.getClass();
        }
        i0.E(class0, String.format("Type id handling not implemented for type %s (by serializer of type %s)", class0.getName(), this.getClass().getName()));
    }

    public r o(x x0) {
        return this;
    }

    public boolean p() {
        return false;
    }

    public r q(Object object0) {
        return this;
    }

    public r r(Set set0) {
        return this;
    }
}

