package androidx.browser.customtabs;

import android.os.Bundle;

public final class d implements Runnable {
    public final EngagementSignalsCallback a;
    public final boolean b;
    public final Bundle c;

    public d(EngagementSignalsCallback engagementSignalsCallback0, boolean z, Bundle bundle0) {
        this.a = engagementSignalsCallback0;
        this.b = z;
        this.c = bundle0;
    }

    @Override
    public final void run() {
        this.a.onVerticalScrollEvent(this.b, this.c);
    }
}

