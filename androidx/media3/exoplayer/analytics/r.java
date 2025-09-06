package androidx.media3.exoplayer.analytics;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet.IterationFinishedEvent;

public final class r implements IterationFinishedEvent {
    public final DefaultAnalyticsCollector a;
    public final Player b;

    public r(DefaultAnalyticsCollector defaultAnalyticsCollector0, Player player0) {
        this.a = defaultAnalyticsCollector0;
        this.b = player0;
    }

    @Override  // androidx.media3.common.util.ListenerSet$IterationFinishedEvent
    public final void a(Object object0, FlagSet flagSet0) {
        this.a.q3(this.b, ((AnalyticsListener)object0), flagSet0);
    }
}

