package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.publisher.a;
import com.iab.omid.library.unity3d.utils.g;

public abstract class b {
    public abstract void a(View arg1, i arg2, @Nullable String arg3);

    public static b b(c c0, d d0) {
        g.a();
        g.d(c0, "AdSessionConfiguration is null");
        g.d(d0, "AdSessionContext is null");
        return new p(c0, d0);
    }

    public abstract void c(h arg1, String arg2);

    public abstract void d();

    public abstract String e();

    public abstract a f();

    public abstract void g(View arg1);

    public abstract void h();

    public abstract void i(View arg1);

    public abstract void j(n arg1);

    public abstract void k();
}

