package org.jsoup.nodes;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jsoup.select.h;
import org.jsoup.select.i.a;
import org.jsoup.select.i;

public final class m implements i {
    public final AtomicBoolean a;

    public m(AtomicBoolean atomicBoolean0) {
        this.a = atomicBoolean0;
    }

    @Override  // org.jsoup.select.i
    public a a(t t0, int v) {
        return h.a(this, t0, v);
    }

    @Override  // org.jsoup.select.i
    public final a b(t t0, int v) {
        return o.g2(this.a, t0, v);
    }
}

