package com.dcinside.app.ad.util;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;

public final class h extends a {
    @l
    private WeakReference c;
    private boolean d;

    public h(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super();
        this.c = new WeakReference(viewGroup0);
    }

    @Override  // com.dcinside.app.ad.util.a
    public boolean a() {
        return this.d;
    }

    @Override  // com.dcinside.app.ad.util.a
    public void e() {
        this.i(true);
        this.c.clear();
    }

    @Override  // com.dcinside.app.ad.util.a
    public void f() {
        if(this.a()) {
            return;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.c.get();
        if(viewGroup0 == null) {
            return;
        }
        s.c(viewGroup0);
        viewGroup0.setVisibility(8);
    }

    @Override  // com.dcinside.app.ad.util.a
    public void g() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void h() {
    }

    @Override  // com.dcinside.app.ad.util.a
    public void i(boolean z) {
        this.d = z;
    }
}

