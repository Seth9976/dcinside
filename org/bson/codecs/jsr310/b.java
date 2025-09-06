package org.bson.codecs.jsr310;

import j..time.Instant;
import org.bson.P;
import org.bson.a0;
import org.bson.codecs.T;
import org.bson.codecs.Y;

public class b extends a {
    @Override  // org.bson.codecs.X
    public Class d() {
        return Instant.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.i(a00, ((Instant)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public Instant h(P p0, T t0) {
        return Instant.ofEpochMilli(this.c(p0));
    }

    public void i(a0 a00, Instant instant0, Y y0) {
        try {
            a00.f0(instant0.toEpochMilli());
        }
        catch(ArithmeticException arithmeticException0) {
            throw new org.bson.codecs.configuration.a(String.format("Unsupported Instant value \'%s\' could not be converted to milliseconds: %s", instant0, arithmeticException0.getMessage()), arithmeticException0);
        }
    }
}

