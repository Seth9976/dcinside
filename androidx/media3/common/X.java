package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class x implements Event {
    public final State a;

    public x(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.S5(this.a, ((Listener)object0));
    }
}

