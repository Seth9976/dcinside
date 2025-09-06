package androidx.media3.common;

import android.view.SurfaceHolder;
import com.google.common.base.Q;

public final class h0 implements Q {
    public final State a;
    public final SurfaceHolder b;

    public h0(State simpleBasePlayer$State0, SurfaceHolder surfaceHolder0) {
        this.a = simpleBasePlayer$State0;
        this.b = surfaceHolder0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.r5(this.a, this.b);
    }
}

