package com.dcinside.app.totalsearch;

import android.view.View;
import rx.functions.a;

public final class b implements a {
    public final View a;

    public b(View view0) {
        this.a = view0;
    }

    @Override  // rx.functions.a
    public final void call() {
        TotalSearchActivity.r2(this.a);
    }
}

