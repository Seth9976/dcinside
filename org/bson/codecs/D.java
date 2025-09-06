package org.bson.codecs;

import java.math.BigDecimal;
import org.bson.P;
import org.bson.a0;
import org.bson.types.Decimal128;

public final class d implements N {
    public BigDecimal c(P p0, T t0) {
        return p0.U1().a();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return BigDecimal.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.h(a00, ((BigDecimal)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.c(p0, t0);
    }

    public void h(a0 a00, BigDecimal bigDecimal0, Y y0) {
        a00.E0(new Decimal128(bigDecimal0));
    }
}

