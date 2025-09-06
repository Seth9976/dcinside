package androidx.media3.exoplayer;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class n0 implements Event {
    public final MediaItem a;
    public final int b;

    public n0(MediaItem mediaItem0, int v) {
        this.a = mediaItem0;
        this.b = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.z4(this.a, this.b, ((Listener)object0));
    }
}

