package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class o0 implements Event {
    public final EventTime a;
    public final Exception b;

    public o0(EventTime analyticsListener$EventTime0, Exception exception0) {
        this.a = analyticsListener$EventTime0;
        this.b = exception0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.k2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

