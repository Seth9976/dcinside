package kotlinx.coroutines;

import y4.l;
import y4.m;

public final class m0 extends P0 {
    @l
    private final k0 e;

    public m0(@l k0 k00) {
        this.e = k00;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        this.e.dispose();
    }
}

