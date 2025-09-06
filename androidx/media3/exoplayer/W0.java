package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;

public final class w0 implements Event {
    public final boolean a;

    public w0(boolean z) {
        this.a = z;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.U(this.a, ((Listener)object0));
    }
}

