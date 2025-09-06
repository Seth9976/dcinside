package androidx.compose.ui.platform;

import A3.a;

public final class h implements Runnable {
    public final a a;

    public h(a a0) {
        this.a = a0;
    }

    @Override
    public final void run() {
        androidx.compose.ui.platform.AndroidComposeView.snapshotObserver.1.c(this.a);
    }
}

