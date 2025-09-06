package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class i0 implements Event {
    public final EventTime a;
    public final MediaLoadData b;

    public i0(EventTime analyticsListener$EventTime0, MediaLoadData mediaLoadData0) {
        this.a = analyticsListener$EventTime0;
        this.b = mediaLoadData0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.f3(this.a, this.b, ((AnalyticsListener)object0));
    }
}

