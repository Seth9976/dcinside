package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class a0 implements Event {
    public final EventTime a;

    public a0(EventTime analyticsListener$EventTime0) {
        this.a = analyticsListener$EventTime0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.a2(this.a, ((AnalyticsListener)object0));
    }
}

