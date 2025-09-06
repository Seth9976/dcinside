package com.dcinside.app.main;

import androidx.fragment.app.FragmentActivity;
import rx.functions.b;

public final class s implements b {
    public final Q a;
    public final FragmentActivity b;

    public s(Q q0, FragmentActivity fragmentActivity0) {
        this.a = q0;
        this.b = fragmentActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Q.E1(this.a, this.b, ((Throwable)object0));
    }
}

