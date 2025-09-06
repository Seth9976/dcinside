package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class p implements View.OnClickListener {
    public final PlayerControlViewLayoutManager a;

    public p(PlayerControlViewLayoutManager playerControlViewLayoutManager0) {
        this.a = playerControlViewLayoutManager0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.U(view0);
    }
}

