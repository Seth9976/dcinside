package com.iab.omid.library.unity3d.internal;

import A2.a;
import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.i;

public class e {
    private final a a;
    private final String b;
    private final i c;
    private final String d;

    public e(View view0, i i0, @Nullable String s) {
        this.a = new a(view0);
        this.b = view0.getClass().getCanonicalName();
        this.c = i0;
        this.d = s;
    }

    public String a() {
        return this.d;
    }

    public i b() {
        return this.c;
    }

    public a c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }
}

