package androidx.window.layout;

public final class i implements Runnable {
    public final WindowLayoutChangeCallbackWrapper a;
    public final WindowLayoutInfo b;

    public i(WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0, WindowLayoutInfo windowLayoutInfo0) {
        this.a = sidecarWindowBackend$WindowLayoutChangeCallbackWrapper0;
        this.b = windowLayoutInfo0;
    }

    @Override
    public final void run() {
        WindowLayoutChangeCallbackWrapper.c(this.a, this.b);
    }
}

