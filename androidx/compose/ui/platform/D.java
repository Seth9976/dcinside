package androidx.compose.ui.platform;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final AndroidComposeView a;

    public d(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AndroidComposeView.Y(this.a);
    }
}

