package androidx.media3.common;

import com.google.common.base.Q;

public final class x0 implements Q {
    public final State a;
    public final PlaybackParameters b;

    public x0(State simpleBasePlayer$State0, PlaybackParameters playbackParameters0) {
        this.a = simpleBasePlayer$State0;
        this.b = playbackParameters0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.l5(this.a, this.b);
    }
}

