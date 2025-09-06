package j$.time.chrono;

import j..time.Instant;
import j..time.LocalDateTime;
import j..time.ZoneId;
import j..time.format.E;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.a;
import j..time.temporal.t;
import java.util.List;
import java.util.Map;

public interface l extends Comparable {
    b D(int arg1, int arg2, int arg3);

    b G(Map arg1, E arg2);

    t H(a arg1);

    ChronoZonedDateTime I(Instant arg1, ZoneId arg2);

    List K();

    boolean N(long arg1);

    m O(int arg1);

    @Override
    boolean equals(Object arg1);

    int f(m arg1, int arg2);

    @Override
    int hashCode();

    b j(long arg1);

    String k();

    b o(TemporalAccessor arg1);

    ChronoLocalDateTime r(LocalDateTime arg1);

    String t();

    @Override
    String toString();

    b w(int arg1, int arg2);
}

