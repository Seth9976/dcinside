package kotlinx.coroutines;

import kotlin.S0;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

final class c1 extends P0 {
    @l
    private final d e;

    public c1(@l d d0) {
        this.e = d0;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        this.e.resumeWith(S0.a);
    }
}

