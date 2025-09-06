package androidx.media3.exoplayer.analytics;

import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.ListenerSet.Event;

public final class u0 implements Event {
    public final EventTime a;
    public final TrackSelectionParameters b;

    public u0(EventTime analyticsListener$EventTime0, TrackSelectionParameters trackSelectionParameters0) {
        this.a = analyticsListener$EventTime0;
        this.b = trackSelectionParameters0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.d3(this.a, this.b, ((AnalyticsListener)object0));
    }
}

