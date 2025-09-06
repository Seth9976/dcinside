package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class g implements Event {
    public final EventTime a;
    public final String b;

    public g(EventTime analyticsListener$EventTime0, String s) {
        this.a = analyticsListener$EventTime0;
        this.b = s;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.e2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

