package com.dcinside.app.main.login;

import android.content.Context;
import io.realm.F0.d;
import io.realm.F0;

public final class r implements d {
    public final t a;
    public final Context b;
    public final String c;

    public r(t t0, Context context0, String s) {
        this.a = t0;
        this.b = context0;
        this.c = s;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        t.G(this.a, this.b, this.c, f00);
    }
}

