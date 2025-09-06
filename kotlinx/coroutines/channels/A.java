package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.U;
import kotlinx.coroutines.t0;
import y4.l;

class a extends m implements c {
    public a(@l g g0, @l kotlinx.coroutines.channels.l l0, boolean z) {
        super(g0, l0, false, z);
        this.S0(((I0)g0.get(I0.B8)));
    }

    @Override  // kotlinx.coroutines.Q0
    protected boolean Q0(@l Throwable throwable0) {
        L.b(this.getContext(), throwable0);
        return true;
    }

    @Override  // kotlinx.coroutines.Q0
    protected void r1(@y4.m Throwable throwable0) {
        kotlinx.coroutines.channels.l l0 = this.Q1();
        CancellationException cancellationException0 = null;
        if(throwable0 != null) {
            if(throwable0 instanceof CancellationException) {
                cancellationException0 = (CancellationException)throwable0;
            }
            if(cancellationException0 == null) {
                cancellationException0 = t0.a((U.a(this) + " was cancelled"), throwable0);
            }
        }
        l0.e(cancellationException0);
    }
}

