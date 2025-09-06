package com.dcinside.app.settings.block.post;

import io.realm.F0.d;
import io.realm.F0;

public final class f implements d {
    public final D a;
    public final boolean b;

    public f(D d0, boolean z) {
        this.a = d0;
        this.b = z;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        D.M0(this.a, this.b, f00);
    }
}

