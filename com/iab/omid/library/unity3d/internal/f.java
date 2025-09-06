package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

public class f {
    private Context a;
    @SuppressLint({"StaticFieldLeak"})
    private static f b;

    static {
        f.b = new f();
    }

    public Context a() {
        return this.a;
    }

    public void b(Context context0) {
        this.a = context0 == null ? null : context0.getApplicationContext();
    }

    public static f c() {
        return f.b;
    }
}

