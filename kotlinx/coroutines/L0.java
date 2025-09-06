package kotlinx.coroutines;

import y4.l;
import y4.m;

final class l0 implements n {
    @l
    private final k0 a;

    public l0(@l k0 k00) {
        this.a = k00;
    }

    @Override  // kotlinx.coroutines.n
    public void a(@m Throwable throwable0) {
        this.a.dispose();
    }

    @Override
    @l
    public String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}

