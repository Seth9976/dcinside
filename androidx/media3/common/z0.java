package androidx.media3.common;

import com.google.common.base.Q;

public final class z0 implements Q {
    public final State a;
    public final TrackSelectionParameters b;

    public z0(State simpleBasePlayer$State0, TrackSelectionParameters trackSelectionParameters0) {
        this.a = simpleBasePlayer$State0;
        this.b = trackSelectionParameters0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return SimpleBasePlayer.p5(this.a, this.b);
    }
}

