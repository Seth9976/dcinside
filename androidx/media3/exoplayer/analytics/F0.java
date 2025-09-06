package androidx.media3.exoplayer.analytics;

import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet.Event;

public final class f0 implements Event {
    public final EventTime a;
    public final CueGroup b;

    public f0(EventTime analyticsListener$EventTime0, CueGroup cueGroup0) {
        this.a = analyticsListener$EventTime0;
        this.b = cueGroup0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.r2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

