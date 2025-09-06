package androidx.media3.common;

import com.google.common.base.Q;

public final class y0 implements Q {
    public final State a;
    public final boolean b;

    public y0(State simpleBasePlayer$State0, boolean z) {
        this.a = simpleBasePlayer$State0;
        this.b = z;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.g5(this.a, this.b);
    }
}

