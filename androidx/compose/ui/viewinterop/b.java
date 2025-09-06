package androidx.compose.ui.viewinterop;

import A3.a;

public final class b implements Runnable {
    public final a a;

    public b(a a0) {
        this.a = a0;
    }

    @Override
    public final void run() {
        androidx.compose.ui.viewinterop.AndroidViewHolder.snapshotObserver.1.c(this.a);
    }
}

