package androidx.compose.ui.text.input;

import android.view.Choreographer.FrameCallback;

public final class e implements Choreographer.FrameCallback {
    public final Runnable a;

    public e(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        TextInputServiceAndroid_androidKt.f(this.a, v);
    }
}

