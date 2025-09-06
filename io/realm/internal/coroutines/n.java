package io.realm.internal.coroutines;

import io.realm.P0;
import io.realm.X0;
import kotlinx.coroutines.channels.D;

public final class n implements P0 {
    public final D a;
    public final b b;

    public n(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override  // io.realm.P0
    public final void M(Object object0) {
        m.f(this.a, this.b, ((X0)object0));
    }
}

