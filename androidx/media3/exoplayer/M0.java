package androidx.media3.exoplayer;

import androidx.media3.common.Player.Listener;
import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.util.ListenerSet.Event;

public final class m0 implements Event {
    public final int a;
    public final PositionInfo b;
    public final PositionInfo c;

    public m0(int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1) {
        this.a = v;
        this.b = player$PositionInfo0;
        this.c = player$PositionInfo1;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        ExoPlayerImpl.y4(this.a, this.b, this.c, ((Listener)object0));
    }
}

