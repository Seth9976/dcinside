package androidx.media3.common;

import com.google.common.base.Q;

public final class b0 implements Q {
    public final State a;
    public final int b;

    public b0(State simpleBasePlayer$State0, int v) {
        this.a = simpleBasePlayer$State0;
        this.b = v;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.i5(this.a, this.b);
    }
}

