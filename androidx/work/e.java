package androidx.work;

import kotlinx.coroutines.I0;

public final class e implements Runnable {
    public final I0 a;

    public e(I0 i00) {
        this.a = i00;
    }

    @Override
    public final void run() {
        ListenableFutureKt.m(this.a);
    }
}

