package androidx.media3.common;

import com.google.common.base.Q;

public final class r0 implements Q {
    public final SimpleBasePlayer a;
    public final State b;
    public final int c;
    public final int d;

    public r0(SimpleBasePlayer simpleBasePlayer0, State simpleBasePlayer$State0, int v, int v1) {
        this.a = simpleBasePlayer0;
        this.b = simpleBasePlayer$State0;
        this.c = v;
        this.d = v1;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return this.a.b5(this.b, this.c, this.d);
    }
}

