package androidx.media3.exoplayer.analytics;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.ListenerSet.Event;

public final class b implements Event {
    public final EventTime a;
    public final PlaybackParameters b;

    public b(EventTime analyticsListener$EventTime0, PlaybackParameters playbackParameters0) {
        this.a = analyticsListener$EventTime0;
        this.b = playbackParameters0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.N2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

