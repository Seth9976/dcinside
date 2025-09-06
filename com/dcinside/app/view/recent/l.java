package com.dcinside.app.view.recent;

import com.dcinside.app.base.g;
import rx.functions.b;

public final class l implements b {
    public final RecentMenuView a;
    public final g b;
    public final int c;

    public l(RecentMenuView recentMenuView0, g g0, int v) {
        this.a = recentMenuView0;
        this.b = g0;
        this.c = v;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        this.a.D(this.b, this.c, ((Boolean)object0));
    }
}

