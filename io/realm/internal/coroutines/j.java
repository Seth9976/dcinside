package io.realm.internal.coroutines;

import io.realm.P0;
import io.realm.g1;
import kotlinx.coroutines.channels.D;

public final class j implements P0 {
    public final D a;
    public final b b;

    public j(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override  // io.realm.P0
    public final void M(Object object0) {
        i.f(this.a, this.b, ((g1)object0));
    }
}

