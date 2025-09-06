package androidx.compose.ui.platform;

import android.view.ViewTreeObserver.OnTouchModeChangeListener;

public final class f implements ViewTreeObserver.OnTouchModeChangeListener {
    public final AndroidComposeView a;

    public f(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override  // android.view.ViewTreeObserver$OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.w0(this.a, z);
    }
}

