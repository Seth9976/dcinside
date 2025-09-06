package kotlin.ranges;

import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;

@W0(markerClass = {r.class})
@h0(version = "1.9")
public interface kotlin.ranges.r {
    public static final class a {
        public static boolean a(@l kotlin.ranges.r r0, @l Comparable comparable0) {
            L.p(comparable0, "value");
            return comparable0.compareTo(r0.getStart()) >= 0 && comparable0.compareTo(r0.b()) < 0;
        }

        public static boolean b(@l kotlin.ranges.r r0) {
            return r0.getStart().compareTo(r0.b()) >= 0;
        }
    }

    boolean a(@l Comparable arg1);

    @l
    Comparable b();

    @l
    Comparable getStart();

    boolean isEmpty();
}

