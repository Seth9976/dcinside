package com.dcinside.app.system;

import io.realm.G;
import io.realm.f1.c;
import java.util.HashSet;

public final class e implements c {
    public final HashSet a;

    public e(HashSet hashSet0) {
        this.a = hashSet0;
    }

    @Override  // io.realm.f1$c
    public final void a(G g0) {
        g.l(this.a, g0);
    }
}

