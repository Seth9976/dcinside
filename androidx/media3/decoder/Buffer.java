package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public abstract class Buffer {
    private int a;

    public final void e(int v) {
        this.a |= v;
    }

    @CallSuper
    public void f() {
        this.a = 0;
    }

    public final void g(int v) {
        this.a &= ~v;
    }

    protected final boolean h(int v) {
        return (this.a & v) == v;
    }

    public final boolean i() {
        return this.h(0x10000000);
    }

    public final boolean j() {
        return this.h(4);
    }

    public final boolean k() {
        return this.h(0x8000000);
    }

    public final boolean l() {
        return this.h(1);
    }

    public final boolean m() {
        return this.h(0x20000000);
    }

    public final void n(int v) {
        this.a = v;
    }
}

