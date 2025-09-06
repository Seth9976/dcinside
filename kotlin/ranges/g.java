package kotlin.ranges;

import kotlin.jvm.internal.L;
import y4.l;

public interface g {
    public static final class a {
        public static boolean a(@l g g0, @l Comparable comparable0) {
            L.p(comparable0, "value");
            return comparable0.compareTo(g0.getStart()) >= 0 && comparable0.compareTo(g0.d()) <= 0;
        }

        public static boolean b(@l g g0) {
            return g0.getStart().compareTo(g0.d()) > 0;
        }
    }

    boolean a(@l Comparable arg1);

    @l
    Comparable d();

    @l
    Comparable getStart();

    boolean isEmpty();
}

