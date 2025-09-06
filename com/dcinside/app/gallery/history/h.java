package com.dcinside.app.gallery.history;

import rx.functions.b;

public final class h implements b {
    public final ManageHistoryActivity a;

    public h(ManageHistoryActivity manageHistoryActivity0) {
        this.a = manageHistoryActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ManageHistoryActivity.g2(this.a, ((Throwable)object0));
    }
}

