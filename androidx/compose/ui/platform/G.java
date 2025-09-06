package androidx.compose.ui.platform;

public final class g implements Runnable {
    public final AndroidComposeView a;

    public g(AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
    }

    @Override
    public final void run() {
        AndroidComposeView.s0(this.a);
    }
}

