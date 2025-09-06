package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;

public final class n implements Event {
    public final EventTime a;
    public final float b;

    public n(EventTime analyticsListener$EventTime0, float f) {
        this.a = analyticsListener$EventTime0;
        this.b = f;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.o3(this.a, this.b, ((AnalyticsListener)object0));
    }
}

