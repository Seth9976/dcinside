package j$.time.format;

import j..time.chrono.l;
import j..time.temporal.q;
import java.util.Iterator;
import java.util.Locale;

final class b extends B {
    final A e;

    b(A a0) {
        this.e = a0;
    }

    @Override  // j$.time.format.B
    public final String e(l l0, q q0, long v, G g0, Locale locale0) {
        return this.e.a(v, g0);
    }

    @Override  // j$.time.format.B
    public final String f(q q0, long v, G g0, Locale locale0) {
        return this.e.a(v, g0);
    }

    @Override  // j$.time.format.B
    public final Iterator g(l l0, q q0, G g0, Locale locale0) {
        return this.e.b(g0);
    }

    @Override  // j$.time.format.B
    public final Iterator h(q q0, G g0, Locale locale0) {
        return this.e.b(g0);
    }
}

