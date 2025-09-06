package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet.Event;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public final class b0 implements Event {
    public final EventTime a;
    public final Format b;
    public final DecoderReuseEvaluation c;

    public b0(EventTime analyticsListener$EventTime0, Format format0, DecoderReuseEvaluation decoderReuseEvaluation0) {
        this.a = analyticsListener$EventTime0;
        this.b = format0;
        this.c = decoderReuseEvaluation0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.h2(this.a, this.b, this.c, ((AnalyticsListener)object0));
    }
}

