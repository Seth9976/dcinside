package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.deser.y.a;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public final class m extends a {
    protected final String q;
    protected final boolean r;
    protected final y s;
    private static final long t = 1L;

    public m(y y0, String s, y y1, boolean z) {
        super(y0);
        this.q = s;
        this.s = y1;
        this.r = z;
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public final void M(Object object0, Object object1) throws IOException {
        this.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public Object N(Object object0, Object object1) throws IOException {
        if(object1 != null) {
            if(this.r) {
                if(object1 instanceof Object[]) {
                    for(int v = 0; v < ((Object[])object1).length; ++v) {
                        Object object2 = ((Object[])object1)[v];
                        if(object2 != null) {
                            this.s.M(object2, object0);
                        }
                    }
                    return this.p.N(object0, object1);
                }
                if(object1 instanceof Collection) {
                    for(Object object3: ((Collection)object1)) {
                        if(object3 != null) {
                            this.s.M(object3, object0);
                        }
                    }
                    return this.p.N(object0, object1);
                }
                if(!(object1 instanceof Map)) {
                    throw new IllegalStateException("Unsupported container type (" + object1.getClass().getName() + ") when resolving reference \'" + this.q + "\'");
                }
                for(Object object4: ((Map)object1).values()) {
                    if(object4 != null) {
                        this.s.M(object4, object0);
                    }
                }
                return this.p.N(object0, object1);
            }
            this.s.M(object1, object0);
        }
        return this.p.N(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    protected y Y(y y0) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public void r(n n0, h h0, Object object0) throws IOException {
        this.M(object0, this.p.q(n0, h0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public Object s(n n0, h h0, Object object0) throws IOException {
        return this.N(object0, this.q(n0, h0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.y$a
    public void w(g g0) {
        this.p.w(g0);
        this.s.w(g0);
    }
}

