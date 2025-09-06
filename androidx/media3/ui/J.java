package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class j implements View.OnClickListener {
    public final AudioTrackSelectionAdapter a;

    public j(AudioTrackSelectionAdapter playerControlView$AudioTrackSelectionAdapter0) {
        this.a = playerControlView$AudioTrackSelectionAdapter0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.F(view0);
    }
}

