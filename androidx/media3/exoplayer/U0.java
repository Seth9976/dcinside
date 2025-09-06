package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class u0 implements Event {
    public final ComponentListener a;

    public u0(ComponentListener exoPlayerImpl$ComponentListener0) {
        this.a = exoPlayerImpl$ComponentListener0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        this.a.S(((Listener)object0));
    }
}

