package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class k0 implements Event {
    public final PlaybackInfo a;

    public k0(PlaybackInfo playbackInfo0) {
        this.a = playbackInfo0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.J4(this.a, ((Listener)object0));
    }
}

