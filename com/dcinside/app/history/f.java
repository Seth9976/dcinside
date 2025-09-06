package com.dcinside.app.history;

import java.util.List;

public final class f implements Runnable {
    public final PostHistoryActivity a;
    public final List b;
    public final long c;

    public f(PostHistoryActivity postHistoryActivity0, List list0, long v) {
        this.a = postHistoryActivity0;
        this.b = list0;
        this.c = v;
    }

    @Override
    public final void run() {
        a.f(this.a, this.b, this.c);
    }
}

