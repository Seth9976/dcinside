package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class h implements View.OnClickListener {
    public final PlayerControlView a;

    public h(PlayerControlView playerControlView0) {
        this.a = playerControlView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.h0(view0);
    }
}

