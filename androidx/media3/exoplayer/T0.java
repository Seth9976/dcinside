package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet.Event;

public final class t0 implements Event {
    public final CueGroup a;

    public t0(CueGroup cueGroup0) {
        this.a = cueGroup0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.R(this.a, ((Listener)object0));
    }
}

