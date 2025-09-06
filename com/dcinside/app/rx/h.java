package com.dcinside.app.rx;

import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.h0;
import y4.l;

public final class h implements a {
    @l
    private final g a;
    @l
    private final I0 b;

    public h() {
        this(null, 1, null);
    }

    public h(@l g g0) {
        L.p(g0, "dispatchers");
        super();
        this.a = g0;
        this.b = O0.c(null, 1, null);
    }

    public h(g g0, int v, w w0) {
        if((v & 1) != 0) {
            g0 = h0.c();
        }
        this(g0);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.a.plus(this.b);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        kotlinx.coroutines.I0.a.b(this.b, null, 1, null);
    }
}

