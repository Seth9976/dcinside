package io.realm.internal.coroutines;

import io.realm.G;
import io.realm.P0;
import kotlinx.coroutines.channels.D;

public final class o implements P0 {
    public final D a;
    public final b b;

    public o(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override  // io.realm.P0
    public final void M(Object object0) {
        n.f(this.a, this.b, ((G)object0));
    }
}

