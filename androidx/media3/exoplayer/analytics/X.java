package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Tracks;
import androidx.media3.common.util.ListenerSet.Event;

public final class x implements Event {
    public final EventTime a;
    public final Tracks b;

    public x(EventTime analyticsListener$EventTime0, Tracks tracks0) {
        this.a = analyticsListener$EventTime0;
        this.b = tracks0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.e3(this.a, this.b, ((AnalyticsListener)object0));
    }
}

