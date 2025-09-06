package io.realm.internal.coroutines;

import io.realm.G;
import io.realm.X0;
import io.realm.e1;
import io.realm.q0;
import kotlinx.coroutines.channels.D;

public final class g implements e1 {
    public final D a;
    public final b b;

    public g(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override  // io.realm.e1
    public final void a(X0 x00, q0 q00) {
        f.f(this.a, this.b, ((G)x00), q00);
    }
}

