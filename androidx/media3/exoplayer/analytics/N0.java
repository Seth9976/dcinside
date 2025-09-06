package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class n0 implements Event {
    public final EventTime a;

    public n0(EventTime analyticsListener$EventTime0) {
        this.a = analyticsListener$EventTime0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.A2(this.a, ((AnalyticsListener)object0));
    }
}

