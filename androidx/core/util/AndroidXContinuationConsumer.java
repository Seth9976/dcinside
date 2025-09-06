package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.d;
import y4.l;

final class AndroidXContinuationConsumer extends AtomicBoolean implements Consumer {
    @l
    private final d a;

    public AndroidXContinuationConsumer(@l d d0) {
        super(false);
        this.a = d0;
    }

    @Override  // androidx.core.util.Consumer
    public void accept(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(object0);
        }
    }

    @Override
    @l
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + this.get() + ')';
    }
}

