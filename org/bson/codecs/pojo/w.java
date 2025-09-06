package org.bson.codecs.pojo;

import org.bson.P;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;
import org.bson.codecs.configuration.a;

class w implements N {
    private final Class a;
    private final a b;

    w(Class class0, a a0) {
        this.a = class0;
        this.b = a0;
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return this.a;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        throw this.b;
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        throw this.b;
    }
}

