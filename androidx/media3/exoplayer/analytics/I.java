package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player.Commands;
import androidx.media3.common.util.ListenerSet.Event;

public final class i implements Event {
    public final EventTime a;
    public final Commands b;

    public i(EventTime analyticsListener$EventTime0, Commands player$Commands0) {
        this.a = analyticsListener$EventTime0;
        this.b = player$Commands0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.o2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

