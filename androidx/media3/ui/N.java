package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;

public final class n implements View.OnClickListener {
    public final TrackSelectionAdapter a;
    public final Player b;
    public final TrackGroup c;
    public final TrackInformation d;

    public n(TrackSelectionAdapter playerControlView$TrackSelectionAdapter0, Player player0, TrackGroup trackGroup0, TrackInformation playerControlView$TrackInformation0) {
        this.a = playerControlView$TrackSelectionAdapter0;
        this.b = player0;
        this.c = trackGroup0;
        this.d = playerControlView$TrackInformation0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.y(this.b, this.c, this.d, view0);
    }
}

