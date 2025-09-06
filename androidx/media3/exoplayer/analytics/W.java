package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class w implements Event {
    public final EventTime a;
    public final boolean b;

    public w(EventTime analyticsListener$EventTime0, boolean z) {
        this.a = analyticsListener$EventTime0;
        this.b = z;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.D2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

