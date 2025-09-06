package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class l0 implements Event {
    public final PlaybackInfo a;

    public l0(PlaybackInfo playbackInfo0) {
        this.a = playbackInfo0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.K4(this.a, ((Listener)object0));
    }
}

