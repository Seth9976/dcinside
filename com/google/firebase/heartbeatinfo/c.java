package com.google.firebase.heartbeatinfo;

import android.content.Context;
import h2.b;

public final class c implements b {
    public final Context a;
    public final String b;

    public c(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // h2.b
    public final Object get() {
        return g.j(this.a, this.b);
    }
}

