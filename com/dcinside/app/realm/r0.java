package com.dcinside.app.realm;

import android.content.Context;
import io.realm.F0.d.b;

public final class r0 implements b {
    public final Context a;

    public r0(Context context0) {
        this.a = context0;
    }

    @Override  // io.realm.F0$d$b
    public final void onError(Throwable throwable0) {
        a.k(this.a, throwable0);
    }
}

