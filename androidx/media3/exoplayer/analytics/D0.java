package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.DecoderCounters;

public final class d0 implements Event {
    public final EventTime a;
    public final DecoderCounters b;

    public d0(EventTime analyticsListener$EventTime0, DecoderCounters decoderCounters0) {
        this.a = analyticsListener$EventTime0;
        this.b = decoderCounters0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.k3(this.a, this.b, ((AnalyticsListener)object0));
    }
}

