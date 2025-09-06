package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.IterationFinishedEvent;

public final class d0 implements IterationFinishedEvent {
    public final ExoPlayerImpl a;

    public d0(ExoPlayerImpl exoPlayerImpl0) {
        this.a = exoPlayerImpl0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$IterationFinishedEvent
    public final void a(Object object0, FlagSet flagSet0) {
        this.a.k4(((Listener)object0), flagSet0);
    }
}

