package com.bumptech.glide.load.engine;

import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.g;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

final class s {
    private final Map a;
    private final Map b;

    s() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    l a(g g0, boolean z) {
        return (l)this.c(z).get(g0);
    }

    @VisibleForTesting
    Map b() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    // 去混淆评级： 低(20)
    private Map c(boolean z) {
        return z ? this.b : this.a;
    }

    void d(g g0, l l0) {
        this.c(l0.q()).put(g0, l0);
    }

    void e(g g0, l l0) {
        Map map0 = this.c(l0.q());
        if(l0.equals(map0.get(g0))) {
            map0.remove(g0);
        }
    }
}

