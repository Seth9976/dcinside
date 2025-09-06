package androidx.media3.common;

import androidx.media3.common.util.ListenerSet.Event;

public final class u implements Event {
    public final int a;
    public final PositionInfo b;
    public final PositionInfo c;

    public u(int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1) {
        this.a = v;
        this.b = player$PositionInfo0;
        this.c = player$PositionInfo1;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        SimpleBasePlayer.x5(this.a, this.b, this.c, ((Listener)object0));
    }
}

