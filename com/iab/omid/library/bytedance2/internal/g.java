package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

public class g {
    private Context a;
    @SuppressLint({"StaticFieldLeak"})
    private static g b;

    static {
        g.b = new g();
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context0) {
        this.a = context0 == null ? null : context0.getApplicationContext();
    }

    public static g b() {
        return g.b;
    }
}

