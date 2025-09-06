package androidx.media3.common;

import com.google.common.base.Q;

public final class e0 implements Q {
    public final State a;
    public final MediaMetadata b;

    public e0(State simpleBasePlayer$State0, MediaMetadata mediaMetadata0) {
        this.a = simpleBasePlayer$State0;
        this.b = mediaMetadata0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.m5(this.a, this.b);
    }
}

