package com.dcinside.app.post.fragments.mini;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;

public final class m implements ViewStub.OnInflateListener {
    public final t a;

    public m(t t0) {
        this.a = t0;
    }

    @Override  // android.view.ViewStub$OnInflateListener
    public final void onInflate(ViewStub viewStub0, View view0) {
        t.c0(this.a, viewStub0, view0);
    }
}

