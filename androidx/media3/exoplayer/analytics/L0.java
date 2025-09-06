package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class l0 implements Event {
    public final EventTime a;

    public l0(EventTime analyticsListener$EventTime0) {
        this.a = analyticsListener$EventTime0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.v2(this.a, ((AnalyticsListener)object0));
    }
}

