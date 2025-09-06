package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player.PositionInfo;
import androidx.media3.common.util.ListenerSet.Event;

public final class c0 implements Event {
    public final EventTime a;
    public final int b;
    public final PositionInfo c;
    public final PositionInfo d;

    public c0(EventTime analyticsListener$EventTime0, int v, PositionInfo player$PositionInfo0, PositionInfo player$PositionInfo1) {
        this.a = analyticsListener$EventTime0;
        this.b = v;
        this.c = player$PositionInfo0;
        this.d = player$PositionInfo1;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.U2(this.a, this.b, this.c, this.d, ((AnalyticsListener)object0));
    }
}

