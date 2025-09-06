package com.dcinside.app.gallery.history;

import rx.functions.b;

public final class e implements b {
    public final ManageHistoryActivity a;

    public e(ManageHistoryActivity manageHistoryActivity0) {
        this.a = manageHistoryActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ManageHistoryActivity.c2(this.a, ((Throwable)object0));
    }
}

