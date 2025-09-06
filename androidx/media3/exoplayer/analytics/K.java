package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.ListenerSet.Event;

public final class k implements Event {
    public final EventTime a;
    public final MediaItem b;
    public final int c;

    public k(EventTime analyticsListener$EventTime0, MediaItem mediaItem0, int v) {
        this.a = analyticsListener$EventTime0;
        this.b = mediaItem0;
        this.c = v;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.J2(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

