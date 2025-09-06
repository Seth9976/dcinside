package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class y implements Event {
    public final State a;

    public y(State simpleBasePlayer$State0) {
        this.a = simpleBasePlayer$State0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.T5(this.a, ((Listener)object0));
    }
}

