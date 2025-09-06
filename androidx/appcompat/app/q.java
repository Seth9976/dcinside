package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

public final class q implements OnBackInvokedCallback {
    public final AppCompatDelegateImpl a;

    public q(AppCompatDelegateImpl appCompatDelegateImpl0) {
        this.a = appCompatDelegateImpl0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.Y0();
    }
}

