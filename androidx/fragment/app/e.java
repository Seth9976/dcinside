package androidx.fragment.app;

import A3.o;
import android.os.Bundle;

public final class e implements FragmentResultListener {
    public final o a;

    public e(o o0) {
        this.a = o0;
    }

    @Override  // androidx.fragment.app.FragmentResultListener
    public final void e(String s, Bundle bundle0) {
        FragmentKt.f(this.a, s, bundle0);
    }
}

