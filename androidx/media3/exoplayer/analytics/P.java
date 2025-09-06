package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class p implements Event {
    public final EventTime a;
    public final int b;
    public final long c;
    public final long d;

    public p(EventTime analyticsListener$EventTime0, int v, long v1, long v2) {
        this.a = analyticsListener$EventTime0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.n2(this.a, this.b, this.c, this.d, ((AnalyticsListener)object0));
    }
}

