package com.dcinside.app.system;

import io.realm.G;
import io.realm.f1.c;
import java.util.HashSet;

public final class d implements c {
    public final HashSet a;

    public d(HashSet hashSet0) {
        this.a = hashSet0;
    }

    @Override  // io.realm.f1$c
    public final void a(G g0) {
        g.k(this.a, g0);
    }
}

