package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlinx.coroutines.internal.Q;
import y4.l;

final class o extends Q {
    public o(@l g g0, @l d d0) {
        super(g0, d0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.Q0
    public boolean n0(@l Throwable throwable0) {
        return throwable0 instanceof kotlinx.coroutines.flow.internal.l ? true : this.i0(throwable0);
    }
}

