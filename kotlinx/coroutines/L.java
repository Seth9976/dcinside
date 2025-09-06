package kotlinx.coroutines;

import java.util.concurrent.Future;
import y4.m;

final class l implements n {
    @y4.l
    private final Future a;

    public l(@y4.l Future future0) {
        this.a = future0;
    }

    @Override  // kotlinx.coroutines.n
    public void a(@m Throwable throwable0) {
        if(throwable0 != null) {
            this.a.cancel(false);
        }
    }

    @Override
    @y4.l
    public String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}

