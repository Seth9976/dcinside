package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import kotlinx.coroutines.channels.D;

public final class t implements ViewTreeObserver.OnScrollChangedListener {
    public final D a;
    public final View b;

    public t(D d0, View view0) {
        this.a = d0;
        this.b = view0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.h(this.a, this.b);
    }
}

