package androidx.activity;

import android.view.View.OnLayoutChangeListener;
import android.view.View;
import kotlinx.coroutines.channels.D;

public final class s implements View.OnLayoutChangeListener {
    public final D a;

    public s(D d0) {
        this.a = d0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.g(this.a, view0, v, v1, v2, v3, v4, v5, v6, v7);
    }
}

