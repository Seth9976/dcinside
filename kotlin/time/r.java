package kotlin.time;

import kotlin.W0;
import kotlin.h0;

@W0(markerClass = {l.class})
@h0(version = "1.9")
public interface r {
    public static final class a {
        public static boolean a(@y4.l r r0) {
            return e.e0(r0.a());
        }

        public static boolean b(@y4.l r r0) {
            return !e.e0(r0.a());
        }

        @y4.l
        public static r c(@y4.l r r0, long v) {
            return r0.o(e.z0(v));
        }

        @y4.l
        public static r d(@y4.l r r0, long v) {
            return new c(r0, v, null);
        }
    }

    long a();

    boolean b();

    boolean c();

    @y4.l
    r o(long arg1);

    @y4.l
    r q(long arg1);
}

