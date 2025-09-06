package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ListenerSet.Event;

public final class u implements Event {
    public final EventTime a;
    public final Metadata b;

    public u(EventTime analyticsListener$EventTime0, Metadata metadata0) {
        this.a = analyticsListener$EventTime0;
        this.b = metadata0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.L2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

