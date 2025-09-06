package androidx.browser.customtabs;

import android.os.Bundle;

public final class c implements Runnable {
    public final EngagementSignalsCallback a;
    public final int b;
    public final Bundle c;

    public c(EngagementSignalsCallback engagementSignalsCallback0, int v, Bundle bundle0) {
        this.a = engagementSignalsCallback0;
        this.b = v;
        this.c = bundle0;
    }

    @Override
    public final void run() {
        this.a.onGreatestScrollPercentageIncreased(this.b, this.c);
    }
}

