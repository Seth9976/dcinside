package com.dcinside.app.read;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;
import java.util.List;

public final class D0 implements ViewStub.OnInflateListener {
    public final J0 a;
    public final List b;

    public D0(J0 j00, List list0) {
        this.a = j00;
        this.b = list0;
    }

    @Override  // android.view.ViewStub$OnInflateListener
    public final void onInflate(ViewStub viewStub0, View view0) {
        J0.o0(this.a, this.b, viewStub0, view0);
    }
}

