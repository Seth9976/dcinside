package androidx.core.util;

import androidx.annotation.RequiresApi;
import j..util.function.Consumer.-CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.coroutines.d;
import y4.l;

@RequiresApi(24)
final class ContinuationConsumer extends AtomicBoolean implements Consumer {
    @l
    private final d a;

    public ContinuationConsumer(@l d d0) {
        super(false);
        this.a = d0;
    }

    @Override
    public void accept(Object object0) {
        if(this.compareAndSet(false, true)) {
            this.a.resumeWith(object0);
        }
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    @l
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + this.get() + ')';
    }
}

