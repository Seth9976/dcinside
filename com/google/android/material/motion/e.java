package com.google.android.material.motion;

import android.window.OnBackInvokedCallback;

public final class e implements OnBackInvokedCallback {
    public final b a;

    public e(b b0) {
        this.a = b0;
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.d();
    }
}

