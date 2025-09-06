package j$.time.format;

import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.m;

public final class a implements TemporalQuery {
    @Override  // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor0) {
        ZoneId zoneId0 = (ZoneId)temporalAccessor0.y(m.l());
        return zoneId0 == null || zoneId0 instanceof ZoneOffset ? null : zoneId0;
    }
}

