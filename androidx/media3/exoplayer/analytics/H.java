package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class h implements Event {
    public final EventTime a;
    public final LoadEventInfo b;
    public final MediaLoadData c;

    public h(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0) {
        this.a = analyticsListener$EventTime0;
        this.b = loadEventInfo0;
        this.c = mediaLoadData0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.H2(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

