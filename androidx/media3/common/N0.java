package androidx.media3.common;

import com.google.common.base.Q;

public final class n0 implements Q {
    public final SimpleBasePlayer a;
    public final State b;
    public final int c;
    public final int d;
    public final int e;

    public n0(SimpleBasePlayer simpleBasePlayer0, State simpleBasePlayer$State0, int v, int v1, int v2) {
        this.a = simpleBasePlayer0;
        this.b = simpleBasePlayer$State0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return this.a.X4(this.b, this.c, this.d, this.e);
    }
}

