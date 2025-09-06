package androidx.compose.ui.platform;

public final class k implements Runnable {
    public final AndroidComposeViewAccessibilityDelegateCompat a;

    public k(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) {
        this.a = androidComposeViewAccessibilityDelegateCompat0;
    }

    @Override
    public final void run() {
        AndroidComposeViewAccessibilityDelegateCompat.s0(this.a);
    }
}

