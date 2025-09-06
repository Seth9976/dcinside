package okio;

import kotlin.jvm.internal.L;
import y4.l;

final class k implements m0 {
    @Override  // okio.m0
    public void close() {
    }

    @Override  // okio.m0
    public void flush() {
    }

    @Override  // okio.m0
    @l
    public q0 timeout() {
        return q0.NONE;
    }

    @Override  // okio.m0
    public void write(@l okio.l l0, long v) {
        L.p(l0, "source");
        l0.skip(v);
    }
}

