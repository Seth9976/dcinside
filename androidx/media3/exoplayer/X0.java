package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.util.ListenerSet.Event;
import java.util.List;

public final class x0 implements Event {
    public final List a;

    public x0(List list0) {
        this.a = list0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ComponentListener.Q(this.a, ((Listener)object0));
    }
}

