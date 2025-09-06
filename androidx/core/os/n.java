package androidx.core.os;

import android.os.ProfilingResult;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.D;

public final class n implements Consumer {
    public final D a;

    public n(D d0) {
        this.a = d0;
    }

    @Override
    public final void accept(Object object0) {
        androidx.core.os.Profiling.registerForAllProfilingResults.1.g(this.a, ((ProfilingResult)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

