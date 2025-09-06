package androidx.media3.common;

import com.google.common.base.Q;

public final class g0 implements Q {
    public final State a;
    public final float b;

    public g0(State simpleBasePlayer$State0, float f) {
        this.a = simpleBasePlayer$State0;
        this.b = f;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.u5(this.a, this.b);
    }
}

