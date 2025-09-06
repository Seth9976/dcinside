package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class h0 implements Event {
    public final EventTime a;
    public final Object b;
    public final long c;

    public h0(EventTime analyticsListener$EventTime0, Object object0, long v) {
        this.a = analyticsListener$EventTime0;
        this.b = object0;
        this.c = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.V2(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

