package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class a0 implements Event {
    public final int a;

    public a0(int v) {
        this.a = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.r4(this.a, ((Listener)object0));
    }
}

