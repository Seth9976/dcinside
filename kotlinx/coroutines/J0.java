package kotlinx.coroutines;

import java.util.concurrent.Future;
import y4.l;

final class j0 implements k0 {
    @l
    private final Future a;

    public j0(@l Future future0) {
        this.a = future0;
    }

    @Override  // kotlinx.coroutines.k0
    public void dispose() {
        this.a.cancel(false);
    }

    @Override
    @l
    public String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}

