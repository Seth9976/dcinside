package kotlin.ranges;

import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.1")
public interface f extends g {
    public static final class a {
        public static boolean a(@l f f0, @l Comparable comparable0) {
            L.p(comparable0, "value");
            return f0.c(f0.getStart(), comparable0) && f0.c(comparable0, f0.d());
        }

        public static boolean b(@l f f0) {
            return !f0.c(f0.getStart(), f0.d());
        }
    }

    @Override  // kotlin.ranges.g
    boolean a(@l Comparable arg1);

    boolean c(@l Comparable arg1, @l Comparable arg2);

    @Override  // kotlin.ranges.g
    boolean isEmpty();
}

