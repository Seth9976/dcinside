package androidx.media3.common;

import android.view.SurfaceView;
import com.google.common.base.Q;

public final class k0 implements Q {
    public final State a;
    public final SurfaceView b;

    public k0(State simpleBasePlayer$State0, SurfaceView surfaceView0) {
        this.a = simpleBasePlayer$State0;
        this.b = surfaceView0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.s5(this.a, this.b);
    }
}

