package androidx.media3.common;

import com.google.common.base.Q;

public final class q0 implements Q {
    public final boolean a;
    public final State b;
    public final int c;
    public final long d;

    public q0(boolean z, State simpleBasePlayer$State0, int v, long v1) {
        this.a = z;
        this.b = simpleBasePlayer$State0;
        this.c = v;
        this.d = v1;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.d5(this.a, this.b, this.c, this.d);
    }
}

