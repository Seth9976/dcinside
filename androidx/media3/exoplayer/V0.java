package androidx.media3.exoplayer;

import androidx.media3.common.Metadata;
import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class v0 implements Event {
    public final Metadata a;

    public v0(Metadata metadata0) {
        this.a = metadata0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.T(this.a, ((Listener)object0));
    }
}

