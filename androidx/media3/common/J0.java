package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class j0 implements Event {
    public final State a;

    public j0(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.G5(this.a, ((Listener)object0));
    }
}

