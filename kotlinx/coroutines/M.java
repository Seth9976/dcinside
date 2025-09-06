package kotlinx.coroutines;

import java.util.concurrent.Future;
import y4.l;

final class m extends P0 {
    @l
    private final Future e;

    public m(@l Future future0) {
        this.e = future0;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@y4.m Throwable throwable0) {
        if(throwable0 != null) {
            this.e.cancel(false);
        }
    }
}

