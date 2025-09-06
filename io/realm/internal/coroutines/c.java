package io.realm.internal.coroutines;

import io.realm.g1;
import io.realm.v0;
import io.realm.w0;
import kotlinx.coroutines.channels.D;

public final class c implements w0 {
    public final D a;
    public final b b;

    public c(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override  // io.realm.w0
    public final void a(Object object0, v0 v00) {
        io.realm.internal.coroutines.b.b.f(this.a, this.b, ((g1)object0), v00);
    }
}

