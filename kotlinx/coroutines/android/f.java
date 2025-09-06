package kotlinx.coroutines.android;

import android.view.Choreographer.FrameCallback;
import kotlinx.coroutines.o;

public final class f implements Choreographer.FrameCallback {
    public final o a;

    public f(o o0) {
        this.a = o0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        g.m(this.a, v);
    }
}

