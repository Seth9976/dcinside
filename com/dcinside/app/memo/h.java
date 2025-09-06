package com.dcinside.app.memo;

import android.view.View;
import rx.functions.b;

public final class h implements b {
    public final View a;

    public h(View view0) {
        this.a = view0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.W(this.a, ((Throwable)object0));
    }
}

