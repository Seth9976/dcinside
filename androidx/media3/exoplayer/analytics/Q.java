package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;

public final class q implements Event {
    public final EventTime a;
    public final LoadEventInfo b;
    public final MediaLoadData c;
    public final IOException d;
    public final boolean e;

    public q(EventTime analyticsListener$EventTime0, LoadEventInfo loadEventInfo0, MediaLoadData mediaLoadData0, IOException iOException0, boolean z) {
        this.a = analyticsListener$EventTime0;
        this.b = loadEventInfo0;
        this.c = mediaLoadData0;
        this.d = iOException0;
        this.e = z;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.G2(this.a, this.b, this.c, this.d, this.e, ((AnalyticsListener)object0));
    }
}

