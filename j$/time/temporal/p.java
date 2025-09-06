package j$.time.temporal;

import j..time.LocalDate;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.chrono.l;

public final class p implements TemporalQuery, n {
    public final int a;

    public p(int v) {
        this.a = v;
        super();
    }

    @Override  // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor0) {
        switch(this.a) {
            case 1: {
                return (ZoneId)temporalAccessor0.y(m.a);
            }
            case 2: {
                return (l)temporalAccessor0.y(m.b);
            }
            case 3: {
                return (r)temporalAccessor0.y(m.c);
            }
            case 4: {
                a a1 = a.OFFSET_SECONDS;
                return temporalAccessor0.e(a1) ? ZoneOffset.Z(temporalAccessor0.n(a1)) : null;
            }
            case 5: {
                ZoneId zoneId0 = (ZoneId)temporalAccessor0.y(m.a);
                return zoneId0 == null ? ((ZoneId)temporalAccessor0.y(m.d)) : zoneId0;
            }
            case 6: {
                a a2 = a.EPOCH_DAY;
                return temporalAccessor0.e(a2) ? LocalDate.ofEpochDay(temporalAccessor0.u(a2)) : null;
            }
            default: {
                a a0 = a.NANO_OF_DAY;
                return temporalAccessor0.e(a0) ? LocalTime.Z(temporalAccessor0.u(a0)) : null;
            }
        }
    }

    @Override
    public String toString() {
        switch(this.a) {
            case 1: {
                return "ZoneId";
            }
            case 2: {
                return "Chronology";
            }
            case 3: {
                return "Precision";
            }
            case 4: {
                return "ZoneOffset";
            }
            case 5: {
                return "Zone";
            }
            case 6: {
                return "LocalDate";
            }
            case 7: {
                return "LocalTime";
            }
            default: {
                return super.toString();
            }
        }
    }

    @Override  // j$.time.temporal.n
    public j..time.temporal.l z(j..time.temporal.l l0) {
        return l0.c(l0.q(a.DAY_OF_MONTH).d(), a.DAY_OF_MONTH);
    }
}

