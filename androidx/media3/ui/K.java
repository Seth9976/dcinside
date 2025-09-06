package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class k implements View.OnClickListener {
    public final PlaybackSpeedAdapter a;
    public final int b;

    public k(PlaybackSpeedAdapter playerControlView$PlaybackSpeedAdapter0, int v) {
        this.a = playerControlView$PlaybackSpeedAdapter0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.x(this.b, view0);
    }
}

