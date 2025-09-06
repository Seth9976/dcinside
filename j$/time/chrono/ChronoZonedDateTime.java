package j$.time.chrono;

import j..time.Instant;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.l;

public interface ChronoZonedDateTime extends l, Comparable {
    ChronoLocalDateTime C();

    long P();

    j..time.chrono.l a();

    b b();

    ZoneOffset g();

    ChronoZonedDateTime h(ZoneId arg1);

    ZoneId s();

    Instant toInstant();

    LocalTime toLocalTime();
}

