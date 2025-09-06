package com.dcinside.app.settings.block.post;

import io.realm.F0.d;
import io.realm.F0;

public final class t implements d {
    public final D a;
    public final boolean b;

    public t(D d0, boolean z) {
        this.a = d0;
        this.b = z;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        D.W0(this.a, this.b, f00);
    }
}

