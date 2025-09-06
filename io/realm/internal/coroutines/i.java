package io.realm.internal.coroutines;

import io.realm.E;
import io.realm.P0;
import kotlinx.coroutines.channels.D;

public final class i implements P0 {
    public final D a;
    public final b b;
    public final E c;

    public i(D d0, b b0, E e0) {
        this.a = d0;
        this.b = b0;
        this.c = e0;
    }

    @Override  // io.realm.P0
    public final void M(Object object0) {
        h.f(this.a, this.b, this.c, ((E)object0));
    }
}

