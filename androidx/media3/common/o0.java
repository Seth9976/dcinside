package androidx.media3.common;

import com.google.common.base.Q;

public final class o0 implements Q {
    public final State a;

    public o0(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.V4(this.a);
    }
}

