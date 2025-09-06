package kotlin.text;

import java.util.Set;
import kotlin.internal.f;
import kotlin.jvm.internal.L;

class z extends y {
    @f
    private static final r t(String s) {
        L.p(s, "<this>");
        return new r(s);
    }

    @f
    private static final r u(String s, Set set0) {
        L.p(s, "<this>");
        L.p(set0, "options");
        return new r(s, set0);
    }

    @f
    private static final r v(String s, t t0) {
        L.p(s, "<this>");
        L.p(t0, "option");
        return new r(s, t0);
    }
}

