package io.realm.internal.coroutines;

import io.realm.F0;
import io.realm.P0;
import kotlinx.coroutines.channels.D;

public final class h implements P0 {
    public final D a;
    public final b b;
    public final F0 c;

    public h(D d0, b b0, F0 f00) {
        this.a = d0;
        this.b = b0;
        this.c = f00;
    }

    @Override  // io.realm.P0
    public final void M(Object object0) {
        g.f(this.a, this.b, this.c, ((F0)object0));
    }
}

