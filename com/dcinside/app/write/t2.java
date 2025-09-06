package com.dcinside.app.write;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;

public final class t2 implements ViewStub.OnInflateListener {
    public final y2 a;
    public final String b;
    public final int c;

    public t2(y2 y20, String s, int v) {
        this.a = y20;
        this.b = s;
        this.c = v;
    }

    @Override  // android.view.ViewStub$OnInflateListener
    public final void onInflate(ViewStub viewStub0, View view0) {
        y2.C(this.a, this.b, this.c, viewStub0, view0);
    }
}

