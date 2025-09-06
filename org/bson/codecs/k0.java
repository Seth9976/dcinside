package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.types.ObjectId;

public class k0 implements N {
    public ObjectId c(P p0, T t0) {
        return p0.H();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return ObjectId.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((ObjectId)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, ObjectId objectId0, Y y0) {
        a00.l(objectId0);
    }
}

