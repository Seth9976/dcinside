package j$.time.chrono;

import j..time.Instant;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.l;
import j..time.temporal.n;

public interface ChronoLocalDateTime extends l, n, Comparable {
    int B(ChronoLocalDateTime arg1);

    j..time.chrono.l a();

    b b();

    ChronoZonedDateTime m(ZoneId arg1);

    Instant toInstant(ZoneOffset arg1);

    LocalTime toLocalTime();
}

