package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class q implements Event {
    public final State a;

    public q(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.M5(this.a, ((Listener)object0));
    }
}

