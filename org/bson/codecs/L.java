package org.bson.codecs;

import org.bson.P;
import org.bson.a0;
import org.bson.w;

public class l implements N {
    public w c(P p0, T t0) {
        return p0.M();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return w.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((w)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, w w0, Y y0) {
        a00.Y(w0);
    }
}

