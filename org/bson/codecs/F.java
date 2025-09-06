package org.bson.codecs;

import org.bson.P;
import org.bson.a0;

public class f implements N {
    public Boolean c(P p0, T t0) {
        return Boolean.valueOf(p0.readBoolean());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return Boolean.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((Boolean)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, Boolean boolean0, Y y0) {
        a00.writeBoolean(boolean0.booleanValue());
    }
}

