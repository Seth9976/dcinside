package androidx.compose.ui.platform;

import android.view.ViewTreeObserver.OnScrollChangedListener;

public final class e implements ViewTreeObserver.OnScrollChangedListener {
    public final AndroidComposeView a;

    public e(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        AndroidComposeView.r0(this.a);
    }
}

