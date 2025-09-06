package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.ListenerSet.Event;

public final class g0 implements Event {
    public final TrackSelectionParameters a;

    public g0(TrackSelectionParameters trackSelectionParameters0) {
        this.a = trackSelectionParameters0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.u4(this.a, ((Listener)object0));
    }
}

