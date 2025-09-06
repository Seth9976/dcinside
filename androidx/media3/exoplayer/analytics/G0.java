package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class g0 implements Event {
    public final EventTime a;
    public final int b;

    public g0(EventTime analyticsListener$EventTime0, int v) {
        this.a = analyticsListener$EventTime0;
        this.b = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.W2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

