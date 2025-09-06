package androidx.media3.common;

import com.google.common.base.Q;

public final class t0 implements Q {
    public final State a;

    public t0(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.v5(this.a);
    }
}

