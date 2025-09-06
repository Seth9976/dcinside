package com.dcinside.app.post.fragments;

import androidx.fragment.app.FragmentActivity;
import rx.functions.b;

public final class i2 implements b {
    public final N3 a;
    public final FragmentActivity b;

    public i2(N3 n30, FragmentActivity fragmentActivity0) {
        this.a = n30;
        this.b = fragmentActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        N3.p4(this.a, this.b, ((Throwable)object0));
    }
}

