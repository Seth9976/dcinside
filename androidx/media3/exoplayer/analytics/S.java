package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class s implements Event {
    public final EventTime a;
    public final boolean b;
    public final int c;

    public s(EventTime analyticsListener$EventTime0, boolean z, int v) {
        this.a = analyticsListener$EventTime0;
        this.b = z;
        this.c = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.S2(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

