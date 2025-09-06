package kotlinx.coroutines;

import y4.l;

public final class h extends p0 {
    @l
    private final Thread h;

    public h(@l Thread thread0) {
        this.h = thread0;
    }

    @Override  // kotlinx.coroutines.q0
    @l
    protected Thread I2() {
        return this.h;
    }
}

