package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class r0 implements Event {
    public final EventTime a;
    public final int b;
    public final int c;

    public r0(EventTime analyticsListener$EventTime0, int v, int v1) {
        this.a = analyticsListener$EventTime0;
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.b3(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

