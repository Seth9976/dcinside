package kotlinx.coroutines.android;

import kotlinx.coroutines.k0;

public final class c implements k0 {
    public final d a;
    public final Runnable b;

    public c(d d0, Runnable runnable0) {
        this.a = d0;
        this.b = runnable0;
    }

    @Override  // kotlinx.coroutines.k0
    public final void dispose() {
        d.j2(this.a, this.b);
    }
}

