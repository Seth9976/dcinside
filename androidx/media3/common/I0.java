package androidx.media3.common;

import com.google.common.base.Q;

public final class i0 implements Q {
    public final State a;

    public i0(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.S3(this.a);
    }
}

