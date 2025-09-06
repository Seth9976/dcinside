package j$.util;

import java.util.Collections;
import java.util.Comparator;

public final class Comparator.-EL {
    // 去混淆评级： 低(20)
    public static Comparator a(Comparator comparator0, Comparator comparator1) {
        return comparator0 instanceof j..util.Comparator ? ((j..util.Comparator)comparator0).thenComparing(comparator1) : Comparator.-CC.$default$thenComparing(comparator0, comparator1);
    }

    // 去混淆评级： 低(20)
    public static Comparator reversed(Comparator comparator0) {
        return comparator0 instanceof j..util.Comparator ? ((j..util.Comparator)comparator0).reversed() : Collections.reverseOrder(comparator0);
    }
}

