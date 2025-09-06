package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import com.google.common.base.t;

public final class p implements t {
    public final AnalyticsCollector a;

    public p(AnalyticsCollector analyticsCollector0) {
        this.a = analyticsCollector0;
    }

    @Override  // com.google.common.base.t
    public final Object apply(Object object0) {
        return Builder.r(this.a, ((Clock)object0));
    }
}

