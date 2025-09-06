package kotlin.time;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.m;

@W0(markerClass = {l.class})
@h0(version = "1.9")
public interface d extends Comparable, r {
    public static final class a {
        public static int a(@y4.l d d0, @y4.l d d1) {
            L.p(d1, "other");
            return e.h(d0.x(d1), 0L);
        }

        public static boolean b(@y4.l d d0) {
            return kotlin.time.r.a.a(d0);
        }

        public static boolean c(@y4.l d d0) {
            return kotlin.time.r.a.b(d0);
        }

        @y4.l
        public static d d(@y4.l d d0, long v) {
            return d0.o(e.z0(v));
        }
    }

    int N3(@y4.l d arg1);

    @Override
    boolean equals(@m Object arg1);

    @Override
    int hashCode();

    @y4.l
    d o(long arg1);

    @y4.l
    d q(long arg1);

    long x(@y4.l d arg1);
}

