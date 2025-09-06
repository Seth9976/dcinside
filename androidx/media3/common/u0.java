package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class u0 implements Event {
    public final State a;

    public u0(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.H5(this.a, ((Listener)object0));
    }
}

