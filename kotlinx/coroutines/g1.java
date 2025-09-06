package kotlinx.coroutines;

import kotlin.coroutines.g;
import y4.l;

class g1 extends a {
    public g1(@l g g0, boolean z) {
        super(g0, true, z);
    }

    @Override  // kotlinx.coroutines.Q0
    protected boolean Q0(@l Throwable throwable0) {
        L.b(this.getContext(), throwable0);
        return true;
    }
}

