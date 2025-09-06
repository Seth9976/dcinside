package androidx.media3.common;

import com.google.common.util.concurrent.t0;
import com.google.common.util.concurrent.w;

public final class s0 implements w {
    public final t0 a;

    public s0(t0 t00) {
        this.a = t00;
    }

    @Override  // com.google.common.util.concurrent.w
    public final t0 apply(Object object0) {
        return SimpleBasePlayer.Y2(this.a, object0);
    }
}

