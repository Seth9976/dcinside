package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class c implements Event {
    public final EventTime a;

    public c(EventTime analyticsListener$EventTime0) {
        this.a = analyticsListener$EventTime0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.p3(this.a, ((AnalyticsListener)object0));
    }
}

