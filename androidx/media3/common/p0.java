package androidx.media3.common;

import com.google.common.base.Q;

public final class p0 implements Q {
    public final State a;
    public final AudioAttributes b;

    public p0(State simpleBasePlayer$State0, AudioAttributes audioAttributes0) {
        this.a = simpleBasePlayer$State0;
        this.b = audioAttributes0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.e5(this.a, this.b);
    }
}

