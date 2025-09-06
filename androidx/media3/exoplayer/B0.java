package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class b0 implements Event {
    public final ExoPlayerImpl a;

    public b0(ExoPlayerImpl exoPlayerImpl0) {
        this.a = exoPlayerImpl0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        this.a.q4(((Listener)object0));
    }
}

