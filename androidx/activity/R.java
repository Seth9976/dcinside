package androidx.activity;

import A3.a;
import android.window.OnBackInvokedCallback;

public final class r implements OnBackInvokedCallback {
    public final a a;

    public r(a a0) {
        this.a = a0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Api33Impl.c(this.a);
    }
}

