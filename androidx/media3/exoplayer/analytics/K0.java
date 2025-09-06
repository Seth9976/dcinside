package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class k0 implements Event {
    public final EventTime a;
    public final String b;
    public final long c;
    public final long d;

    public k0(EventTime analyticsListener$EventTime0, String s, long v, long v1) {
        this.a = analyticsListener$EventTime0;
        this.b = s;
        this.c = v;
        this.d = v1;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.h3(this.a, this.b, this.c, this.d, ((AnalyticsListener)object0));
    }
}

