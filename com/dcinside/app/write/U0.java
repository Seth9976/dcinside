package com.dcinside.app.write;

import android.view.View;
import android.view.ViewStub.OnInflateListener;
import android.view.ViewStub;
import com.dcinside.app.model.p;

public final class u0 implements ViewStub.OnInflateListener {
    public final PostWriteActivity a;
    public final p b;

    public u0(PostWriteActivity postWriteActivity0, p p0) {
        this.a = postWriteActivity0;
        this.b = p0;
    }

    @Override  // android.view.ViewStub$OnInflateListener
    public final void onInflate(ViewStub viewStub0, View view0) {
        PostWriteActivity.S6(this.a, this.b, viewStub0, view0);
    }
}

