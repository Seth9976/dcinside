package org.bson.codecs.jsr310;

import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalTime;
import j..time.ZoneOffset;
import org.bson.P;
import org.bson.a0;
import org.bson.codecs.T;
import org.bson.codecs.Y;

public class f extends a {
    @Override  // org.bson.codecs.X
    public Class d() {
        return LocalTime.class;
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        this.i(a00, ((LocalTime)object0), y0);
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        return this.h(p0, t0);
    }

    public LocalTime h(P p0, T t0) {
        return Instant.ofEpochMilli(this.c(p0)).atOffset(ZoneOffset.UTC).toLocalTime();
    }

    public void i(a0 a00, LocalTime localTime0, Y y0) {
        a00.f0(localTime0.atDate(LocalDate.ofEpochDay(0L)).toInstant(ZoneOffset.UTC).toEpochMilli());
    }
}

