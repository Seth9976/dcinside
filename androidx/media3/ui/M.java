package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class m implements View.OnClickListener {
    public final TextTrackSelectionAdapter a;

    public m(TextTrackSelectionAdapter playerControlView$TextTrackSelectionAdapter0) {
        this.a = playerControlView$TextTrackSelectionAdapter0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.E(view0);
    }
}

