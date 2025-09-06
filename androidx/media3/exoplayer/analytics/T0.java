package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class t0 implements Event {
    public final EventTime a;
    public final long b;

    public t0(EventTime analyticsListener$EventTime0, long v) {
        this.a = analyticsListener$EventTime0;
        this.b = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.I2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

