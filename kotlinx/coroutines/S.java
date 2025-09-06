package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public final class s extends C {
    private volatile int _resumed$volatile;
    private static final AtomicIntegerFieldUpdater c;

    static {
        s.c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    }

    public s(@l d d0, @m Throwable throwable0, boolean z) {
        if(throwable0 == null) {
            throwable0 = new CancellationException("Continuation " + d0 + " was cancelled normally");
        }
        super(throwable0, z);
        this._resumed$volatile = 0;
    }

    private final int f() {
        return this._resumed$volatile;
    }

    public final boolean h() {
        return s.c.compareAndSet(this, 0, 1);
    }

    private final void i(int v) {
        this._resumed$volatile = v;
    }
}

