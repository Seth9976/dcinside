package androidx.media3.exoplayer.analytics;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.ListenerSet.Event;

public final class t implements Event {
    public final EventTime a;
    public final AudioAttributes b;

    public t(EventTime analyticsListener$EventTime0, AudioAttributes audioAttributes0) {
        this.a = analyticsListener$EventTime0;
        this.b = audioAttributes0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$Event
    public final void invoke(Object object0) {
        DefaultAnalyticsCollector.b2(this.a, this.b, ((AnalyticsListener)object0));
    }
}

