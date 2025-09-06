package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet.Event;

public final class q0 implements Event {
    public final EventTime a;
    public final MediaMetadata b;

    public q0(EventTime analyticsListener$EventTime0, MediaMetadata mediaMetadata0) {
        this.a = analyticsListener$EventTime0;
        this.b = mediaMetadata0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.K2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

