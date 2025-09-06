package androidx.concurrent.futures;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import kotlin.e0;
import kotlin.f0;
import kotlinx.coroutines.o.a;
import kotlinx.coroutines.o;
import y4.l;

final class ToContinuation implements Runnable {
    @l
    private final t0 a;
    @l
    private final o b;

    public ToContinuation(@l t0 t00, @l o o0) {
        this.a = t00;
        this.b = o0;
    }

    @l
    public final o a() {
        return this.b;
    }

    @l
    public final t0 b() {
        return this.a;
    }

    @Override
    public void run() {
        if(this.a.isCancelled()) {
            a.a(this.b, null, 1, null);
            return;
        }
        try {
            Object object0 = e0.b(AbstractResolvableFuture.j(this.a));
            this.b.resumeWith(object0);
        }
        catch(ExecutionException executionException0) {
            Object object1 = e0.b(f0.a(ListenableFutureKt.b(executionException0)));
            this.b.resumeWith(object1);
        }
    }
}

