package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet.Event;

public final class y0 implements Event {
    public final VideoSize a;

    public y0(VideoSize videoSize0) {
        this.a = videoSize0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.X(this.a, ((Listener)object0));
    }
}

