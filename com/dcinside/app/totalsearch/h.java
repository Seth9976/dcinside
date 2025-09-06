package com.dcinside.app.totalsearch;

import android.view.View;
import rx.functions.a;

public final class h implements a {
    public final View a;

    public h(View view0) {
        this.a = view0;
    }

    @Override  // rx.functions.a
    public final void call() {
        TotalSearchActivity.s2(this.a);
    }
}

