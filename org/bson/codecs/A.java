package org.bson.codecs;

import java.util.concurrent.atomic.AtomicBoolean;
import org.bson.P;
import org.bson.a0;

public class a implements N {
    public AtomicBoolean c(P p0, T t0) {
        return new AtomicBoolean(p0.readBoolean());
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return AtomicBoolean.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((AtomicBoolean)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, AtomicBoolean atomicBoolean0, Y y0) {
        a00.writeBoolean(atomicBoolean0.get());
    }
}

